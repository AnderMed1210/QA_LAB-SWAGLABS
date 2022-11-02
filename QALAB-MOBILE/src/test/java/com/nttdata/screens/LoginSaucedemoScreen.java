package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginSaucedemoScreen extends PageObject {

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement username;
    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement password;
    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    public void clickUsername(){
        System.out.println("Click en usuario");
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        username.click();
    }

    public void clickPassword(){
        System.out.println("Click en clave");
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        password.click();
    }

    public void clickLogin(){
        System.out.println("Click en el btnLogin");
        btnLogin.click();
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void writeUsername(String user){
        System.out.println("Escribiendo Usuario...........");
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        username.sendKeys(user);
        System.out.println("Username: " + user);
    }

    public void writePassword(String pass){
        System.out.println("Escribiendo Clave...........");
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        password.sendKeys(pass);
        System.out.println("Password: " + pass);
    }

}
