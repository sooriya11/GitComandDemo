package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class ViewPage extends ProjectSpecificMethod {
	public void retriveLeadId() {
		String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		String leadId = text.replaceAll("[^0-9]", "");
		System.out.println("Lead Id " + leadId);
	}

}
