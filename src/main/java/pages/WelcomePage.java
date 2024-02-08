package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	public void clickCrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();

	}

	public void clickLogout() {
		getDriver().findElement(By.className("decorativeSubmit")).click();

	}

}
