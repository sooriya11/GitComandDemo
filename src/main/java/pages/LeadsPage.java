package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod {
	public void clickCreateLead() {
		getDriver().findElement(By.linkText("Create Lead")).click();

	}

}
