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

public class PerformanceCheck {

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
		
		ta.tap(PointOption.point(299,1399)).perform();
	Thread.sleep(3000);
		ta.longPress(PointOption.point(682, 1284)).
		waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).release().perform();
		

		MobileElement dir=driver.findElementByXPath("//android.widget.Button[@text='Directions']");
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(dir))).perform();
	

		
	}

}
