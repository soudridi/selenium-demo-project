package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationsStepDefinition {

	private AuthenticationPage authenticationPage;

	public AuthentificationsStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}

	/*Login*/
	@Given("je me connecte a l'application OrangeHRM")
	public void jeMeConnecteALApplicationOrangeHRM() {
		authenticationPage.goToUrl();
	}

	@When("je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {
		authenticationPage.fillUsername(username);
	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		authenticationPage.fillPassword(password);
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		authenticationPage.clickOnbtnLogin();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String msg) {
		String message = AuthenticationPage.homePage.getText();
		Assert.assertTrue(message.contains(msg));
	}
	/*Logout*/
	@When("Je clique sur l'icone logout")
	public void jeCliqueSurLIconeLogout() {
		authenticationPage.clickOniconLogout();
	   }
	@When("Je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() throws InterruptedException {
		Thread.sleep(2000);
		authenticationPage.clickOnbtnLogout();
	  }



}
