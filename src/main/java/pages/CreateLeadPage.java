package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	public void enterComapanyName() {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

	}

	public void enterFirstName() {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");

	}

	public void enterLastName() {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");

	}

	public void clickCreateLeadBtn() {
		getDriver().findElement(By.name("submitButton")).click();

	}

}
