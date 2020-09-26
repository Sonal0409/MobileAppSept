package instructorScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetUpCheck {
	
	// we are going to use driver object in other methods in this same class, so declaring it as a global variable
	
		AndroidDriver<MobileElement> driver;
		
		// When using TestNG framework, we will write our testcase script inside methods
		// provide cappabilties to connect to device and application
		
		
		// @Test annotation mean that this method is a Test method, which has to be executed as a testcase
		
		// @Beforemethod:  @BeforeMethod annotation mean that this particular method will be executed as a prerequisite for every test method in the class
		//@BforeClass annotation means that this particular method will be executed as the first method of the class. and will be execute donly once
		
		
		@Test
		public void configuration() throws MalformedURLException 
		{
			
	DesiredCapabilities cap= new DesiredCapabilities();
			
			cap.setCapability("deviceName", "SonalDemoSept");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "6.0");
			cap.setCapability("appPackage", "com.example.android.apis");
			cap.setCapability("appActivity", "com.example.android.apis.ApiDemos");
			//cap.setCapability("App", "C:\\Appium\\ApiDemos.apk");
			
			// Connect to the server
			
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	// implicit wait: the tool will wait for specific amount of time for all the element to be visible in the application   	
		}
		
		
		
}
			

		


