package com.nttdata.steps;

import com.nttdata.screens.LoginSaucedemoScreen;
import com.nttdata.screens.MainSaucedemoScreen;
import net.thucydides.core.annotations.Step;

public class SaucedemoSteps {

    LoginSaucedemoScreen saucedemo;
    MainSaucedemoScreen mainsaucedo;

    public void SeleccionUsername(){
        saucedemo.clickUsername();
    }

    public void SeleccionPassword(){
        saucedemo.clickPassword();
    }

    public void SeleccionLogin(){
        saucedemo.clickLogin();
    }

    public void completarUser(String user){
        saucedemo.writeUsername(user);
    }

    public void completarPass(String pass){
        saucedemo.writePassword(pass);
    }

    @Step("valido que debería aparecer el título de {string}")
    public String getResultText(){
        return mainsaucedo.getResultText();
    }

    public int getTamanoProducts(){
        return mainsaucedo.getItemSize();
    }

}
