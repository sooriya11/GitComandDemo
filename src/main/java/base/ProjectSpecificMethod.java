package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{
	//public static RemoteWebDriver driver;
	
	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	
	protected void setDriver() {
		rd.set(new ChromeDriver());
	}
	protected RemoteWebDriver getDriver() {
		return rd.get();
	}
	
	@BeforeMethod
	public void preCondition() {
		setDriver();//driver = new ChromeDriver();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().get("http://leaftaps.com/opentaps/");
		
	}
	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}
	

}
