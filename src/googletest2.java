import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class googletest2 {

	@Test
	public void googleTest() throws MalformedURLException, URISyntaxException {
		DesiredCapabilities caps =new DesiredCapabilities();
		//caps.setBrowserName("chrome");
		//caps.setPlatform(Platform.WIN11);
		caps.setCapability(CapabilityType.BROWSER_NAME, "edge");
		WebDriver driver=new RemoteWebDriver(new URI("http://192.168.0.104:4444").toURL(),caps);
		driver.manage().window().maximize();
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		
		
	}
	
	
}
