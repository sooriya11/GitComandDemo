package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	public void clickLeadPage() {
		getDriver().findElement(By.linkText("Leads")).click();
		
	}

}
