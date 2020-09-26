package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class GesturesModule4 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
	// appium tool to connect to my real device
		
DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "Android");
		
		cap.setCapability("platformVersion","8.1.0");
		
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		AndroidDriver<MobileElement> driver =
new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
	// Tap on a coordinate on maps application
		
		//Create Object for TouchAction class
		
		TouchAction ta= new TouchAction(driver);
		
		Thread.sleep(3000);
		
		//coordinate(447,827)
		// tap() , in order to give coordinates PointOption.point()
		//perform() method
		ta.tap(PointOption.point(447, 827)).perform();
		
		// longpress on a coordinate--> wait for sometime(2)--->release my finger-->perform
		
		//longpress coordinate is (439,1388)
		
		ta.longPress(PointOption.point(439, 1388))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).release().perform();
		
		
		// tap on a element
		// locate the element on the application
		
	MobileElement dir=	driver.findElementByXPath("//*[@text='Directions']");
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(dir))).perform();
		
		
		
		
		
		

	}

}
