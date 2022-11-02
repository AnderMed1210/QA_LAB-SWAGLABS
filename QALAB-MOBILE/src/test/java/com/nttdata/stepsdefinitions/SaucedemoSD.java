package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SaucedemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SaucedemoSD {

    @Steps
    SaucedemoSteps saucedemoSteps;


    @Given("que me encuentro en la APP de Saucedemo")
    public void queMeEncuentroEnLaAPPDeSaucedemo() {
        System.out.println("El APP se ejecuta");
    }

    @When("selecciono el input username e ingreso la credencial {string}")
    public void seleccionoElInputUsernameEIngresoLaCredencial(String username) {
        saucedemoSteps.SeleccionUsername();
        saucedemoSteps.completarUser(username);
    }

    @And("selecciono el input password e ingreso la credencial {string}")
    public void seleccionoElInputPasswordEIngresoLaCredencial(String password) {
        saucedemoSteps.SeleccionPassword();
        saucedemoSteps.completarPass(password);
    }

    @And("selecciono el boton Login")
    public void seleccionoElBotonLogin() {
        saucedemoSteps.SeleccionLogin();
    }

    @Then("valido que debería aparecer el título de {string}")
    public void validoQueDeberíaAparecerElTítuloDe(String titulo) {
        Assert.assertEquals(saucedemoSteps.getResultText(), titulo);
    }

    @And("también valido que al menos exista un item")
    public void tambiénValidoQueAlMenosExistaUnItem() {
        Assert.assertTrue("El tamaño de la lista es mayor que 0.", saucedemoSteps.getTamanoProducts()>0);
    }
}
