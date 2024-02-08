package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod {
	@Given("Enter the username")
	public void enterUserName() {
		getDriver().findElement(By.id("username")).sendKeys("demosalesmanager");

	}

	@Given("Enter the Password")
	public void enterPassword() {
		getDriver().findElement(By.id("password")).sendKeys("crmsfa");

	}

	@When("Click on the Login Button")
	public void clickLoginBtn() {
		getDriver().findElement(By.className("decorativeSubmit")).click();

	}

}
