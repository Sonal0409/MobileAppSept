package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

public class KeyEvents {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		cap.setCapability("noReset", true);
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
        
		TouchAction ta= new TouchAction(driver);
		
		ta.tap(PointOption.point(333,1423)).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Search here']").click();

		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.EditText[@text='Search here']").sendKeys("N");
		
		// Enter data through key Pad
		// KeyEvent , AndroidKey(list of keys) , pressKey
		
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.D));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.H));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
		driver.pressKey(new KeyEvent(AndroidKey.VOLUME_UP));
		driver.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
	
		
		
		
		
		
		
		
		
	}

}
