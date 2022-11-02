package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBySet;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainSaucedemoScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement titulo;

    @AndroidFindBy(accessibility= "test-Item")
    private List<WebElement> listaproductos;

    public String getResultText(){
        System.out.println("Texto a recuperar: " + titulo.getText());
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        return titulo.getText();
    }

    public int getItemSize(){
        System.out.println("Tamano de lista: " + listaproductos.size());
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return listaproductos.size();
    }

}
