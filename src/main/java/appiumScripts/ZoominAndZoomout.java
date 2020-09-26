package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ZoominAndZoomout {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "Android");
		
		cap.setCapability("platformVersion","8.1.0");
		
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		AndroidDriver<MobileElement> driver =
new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	TouchAction ta= new TouchAction(driver);
		Thread.sleep(3000);
		ta.tap(PointOption.point(447, 827)).perform();
		
	
		
		
		Thread.sleep(3000);
	// zoom in
		
		//slide action for 1st finger
	
		TouchAction t1= new TouchAction(driver).press(PointOption.point(398,678))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(410,775)).release();
		
		// slide action with thumb finger
		
		TouchAction t2= new TouchAction(driver).press(PointOption.point(510,1363))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(570,1158)).release();
		
		
	// zoomout
		
		TouchAction t3= new TouchAction(driver).press(PointOption.point(350,1002))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(253,574)).release();
		
		TouchAction t4= new TouchAction(driver).press(PointOption.point(369,1169))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(138,1605)).release();
		
		
		
		
		
		MultiTouchAction mta= new 	MultiTouchAction(driver);
		
		//mta.add(t1).add(t2).perform();
		
		
		//Thread.sleep(3000);
		
		
		mta.add(t3).add(t4).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
