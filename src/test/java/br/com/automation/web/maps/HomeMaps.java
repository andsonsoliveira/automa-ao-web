package br.com.automation.web.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMaps {
    @FindBy(xpath="/html/body/form/input[1]")
    public WebElement tbSide1;

    @FindBy(xpath="/html/body/form/input[2]")
    public WebElement tbSide2;

    @FindBy(xpath="/html/body/form/input[3]")
    public WebElement tbSide3;

    @FindBy(xpath ="/html/body/form/input[4]")
    public WebElement btIdentificar;

    @FindBy(xpath ="/html/body/div[4]/text)")
    public WebElement tvResultado;

}

