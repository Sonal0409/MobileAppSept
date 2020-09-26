package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HybridAppTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
		cap.setCapability("chromedriverExecutable", "C:\\Grid\\chromedriver.exe");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		// for appium tool to perfrom action on web context, it needs a browser driver.
		//driver version == chrome app version
		// chrome driver version 55 ===chrome app 55 -- emulator
		// chrome driver 84 ===chrome app 84
		
		//Appium is in Native context
		
		driver.findElementByXPath("//android.widget.TextView[@text='Wikipedia']").click();
		
		Thread.sleep(3000);
		
		// to know the names of the Native and web context
		
	Set<String> cns=	driver.getContextHandles();
	
	System.out.println(cns );
	
	//[NATIVE_APP, WEBVIEW_chrome]
		// the search button is on the webcontext
		// we have to switch to webcontext
		
	driver.context("WEBVIEW_chrome");
	
	driver.findElementByXPath("//*[@type='submit']").click();
	
	Thread.sleep(2000);
		
	driver.findElementByXPath("//*[@class='search']").sendKeys("Appium documentation");
	
	Thread.sleep(2000);
		
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
		// clcik on  menu -- native context
		// from web context switch to native context
		
		driver.context("NATIVE_APP");
		
		Thread.sleep(2000);
		
		//android.widget.ImageButton
		
	
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"More options\"]").click();
		
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"History\"]").click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
