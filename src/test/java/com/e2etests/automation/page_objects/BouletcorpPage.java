package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class BouletcorpPage {
private ConfigFileReader configFileReader;

	
	/*@FindBy*/
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='à propos']")
	public static WebElement btnAbout;
	@FindBy(how = How.XPATH, using = "//img[@src='/buttons/insta.png']")
	public static WebElement btnInstagram;
	
	public BouletcorpPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/*Create Methods */
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));

	}
	public void clickToBtnAbout() {
		btnAbout.click();
	}
}
