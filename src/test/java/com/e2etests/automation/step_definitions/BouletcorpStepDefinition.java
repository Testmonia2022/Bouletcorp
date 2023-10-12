package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import com.e2etests.automation.page_objects.BouletcorpPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletcorpStepDefinition {
	private BouletcorpPage bouletcorpPage;

	public BouletcorpStepDefinition() {
		this.bouletcorpPage = new BouletcorpPage();
	}


	@Given("Je me connect sur l application Bouletcorp")
	public void jeMeConnectSurLApplicationBouletcorp() {
		bouletcorpPage.goToUrl();
	}
	@When("Je clique sur le bouton a propos")
	public void jeCliqueSurLeBoutonAPropos() {
		bouletcorpPage.clickToBtnAbout();
	}
	@Then("Je verifie que la page a change {string}")
	public void jeVerifieQueLaPageAChange(String urlApropos) {
	    String currentUrl = Setup.driver.getCurrentUrl();
	    Assert.assertEquals(urlApropos, currentUrl);
	}
	@Then("Le widget instagram est bien affiche")
	public void leWidgetInstagramEstBienAffiche() {
		//BouletcorpPage.btnInstagram.isDisplayed();
		Assertions.assertTrue(BouletcorpPage.btnInstagram.isDisplayed());
		
	}


	
	}




