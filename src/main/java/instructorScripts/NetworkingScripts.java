package instructorScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NetworkingScripts {

	
AndroidDriver<MobileElement> driver;

@BeforeTest
public void setup() throws MalformedURLException
{
	
DesiredCapabilities cap= new DesiredCapabilities();
cap.setCapability("deviceName", "SonalDemoSept");
cap.setCapability("platformName", "Android");
cap.setCapability("platformVersion", "6.0");
cap.setCapability("appPackage", "com.example.android.apis");
cap.setCapability("appActivity", "com.example.android.apis.ApiDemos");
cap.setCapability("noReset", true);
driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);	

}

@Test
public void ntwrkmangment()
{
	// wifi, mobile data locaion services, airplane mode
	
	driver.toggleWifi();
	driver.toggleLocationServices();
	driver.toggleAirplaneMode();
	
	/*boolean var=driver.getConnection().isWiFiEnabled(); // true
	if(var==false)
	{
	driver.toggleWifi(); // click on wifi option in device
	}
	else
	{
		System.out.println("wifi is enabled");
}*/
	
	//driver.toggleLocationServices();
	
	/*boolean var2= driver.getConnection().isDataEnabled();
	System.out.println(var2);
	if(var2==false)
	{
	driver.toggleData(); // click on wifi option in device
	}
	else
	{
		System.out.println("data is enabled");
}*/
	
	boolean var3= driver.getConnection().isAirplaneModeEnabled(); //false
	System.out.println(var3);
	
	
	
}

//@Test
public void ntwrkTest2() throws InterruptedException
{
	
	driver.openNotifications();
	// locate a notification and click it.
	
	driver.lockDevice();
	
	Thread.sleep(3000);
	
	driver.unlockDevice();
	
	// this will rotate the device
	driver.rotate(ScreenOrientation.LANDSCAPE);
	
	// execute your testcases
	
	Thread.sleep(3000);
	
	driver.rotate(ScreenOrientation.PORTRAIT);
	
}
	
	
	
	
	
}
