package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NetworkingMethods {

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
	
		// togglewifi, toffledata, toggleairplanemode
	
		// how to check if services are on or of
		
		boolean wifi= driver.getConnection().isWiFiEnabled();  // true
	
		System.out.println(wifi);  // true
		
	  // toggles the wifi button on device
	
		boolean data=driver.getConnection().isDataEnabled();
	
		System.out.println(data); // true
		
		boolean airplane= driver.getConnection().isAirplaneModeEnabled();
		
		System.out.println(airplane);
		
		//driver.toggleAirplaneMode();
		
		boolean newairplane= driver.getConnection().isAirplaneModeEnabled();
	
		System.out.println("new status" + newairplane);
		
		
		driver.openNotifications();
		
		
		driver.lockDevice(); //lock the device
		
		Thread.sleep(2000);
		
		driver.unlockDevice();
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		Thread.sleep(2000);
		
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	}

}
