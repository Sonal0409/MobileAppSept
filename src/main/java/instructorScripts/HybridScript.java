package instructorScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HybridScript {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

	
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
		cap.setCapability("chromedriverExecutable", "C:\\Grid\\chromedriver.exe");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
Set<String> cns=driver.getContextHandles();  // only Native view 
			System.out.println(cns + "\n\n"); 
			driver.findElementByXPath("//android.widget.TextView[@text='Wikipedia']").click();
			
			// will ftech the native view and webview details of the app under test
			Set<String> cns1=driver.getContextHandles();
			
			System.out.println(cns1+ "\n\n");   // native_view and web_view
			
			Thread.sleep(4000);
			
			// Switch to webView
			
			driver.context("WEBVIEW_chrome");
			
			Thread.sleep(3000);
			
			driver.findElementByXPath("//*[@id=\"searchIcon\"]").click();
			
			Thread.sleep(3000);
			
			driver.findElementByXPath("//*[@class='search']").sendKeys("appium documentation");
			
			driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			
			// not switching back to native view
			driver.context("NATIVE_APP");
			
			driver.findElementById("com.android.chrome:id/menu_button").click();
			
			Thread.sleep(3000);
			
			driver.findElementByAccessibilityId("History").click();
			

		
	}

}
