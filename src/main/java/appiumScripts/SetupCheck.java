package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetupCheck {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		//Name of device
		// paltformName
		// platformVersion
		// application details
		//server details
		
		// Appium Class DesiredCapabilties , setCapability(key,value)
		// these are nothing but request that are sent to appium server to create the session. 
		// These requests are sent in the form of( key, value)

		DesiredCapabilities cap= new DesiredCapabilities();
		
		//obj.methodname();
		
		cap.setCapability("deviceName", "SonalDemoSept");
		cap.setCapability("platformName", "Android");
		
		cap.setCapability("platformVersion","6.0");
		
		// application details
		// Package name = com.example.android.apis
		//and activity name = com.example.android.apis.ApiDemos
		
		cap.setCapability("appPackage", "com.example.android.apis");
		cap.setCapability("appActivity", "com.example.android.apis.ApiDemos");
		
	// server details -- Destination	
		
	// sever will create the session with mobile app	
		
		AndroidDriver<MobileElement> driver =
				new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		// testing 
		
		// Look for preference menu option nad manulally i will click onit
		
		//click on preference
		// Look for preference depenecy menu option nad manulally i will click onit
		//click on preference dependency
		// Look for check box option nad manulally i will click onit
		//click on check box
		
		// find the elment on the app and perform action on it
		// using appium inspector we can locate an element on the mobile app
		
		
	//	driver.findElement(locatorvalue).click();
		
	driver.findElementByXPath("//*[@text='Preference']").click();
	
	Thread.sleep(3000);
	
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	
	Thread.sleep(3000);
	
	driver.findElementByXPath("//*[@resource-id='android:id/checkbox']").click();
	
	Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
