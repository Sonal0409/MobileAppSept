package instructorScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEventsDemo {
	
	AndroidDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws MalformedURLException
	{
		
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability("deviceName", "SonalDemoSept");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "6.0");
	cap.setCapability("appPackage", "com.hostelworld.app");
	cap.setCapability("appActivity", "com.hostelworld.app.feature.common.view.BottomNavBaseActivity");
	cap.setCapability("noReset", true);
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);	

	}
	
	
	@Test
	public void keyeventsCheck() throws InterruptedException
	{
		driver.findElementByXPath("//*[@resource-id='com.hostelworld.app:id/searchBoxDestinationTv']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@resource-id='com.hostelworld.app:id/suggestionEt']").sendKeys("L");
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.N));
		driver.pressKey(new KeyEvent(AndroidKey.D));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.N));
		
	
		Thread.sleep(5000);
		List<MobileElement> results = driver.findElementsByXPath("//*[@class='androidx.recyclerview.widget.RecyclerView']//child::*");
		
		for(MobileElement temp: results)
		{
			
			
			if(temp.getText().contains("London"))
			{
			temp.click();
			break;
			}
		}
		
		Thread.sleep(5000);
		String destination = driver.findElementByXPath("//*[@resource-id='com.hostelworld.app:id/searchBoxDestinationTv']").getAttribute("text");
	     System.out.println(destination);
	}
	


}
