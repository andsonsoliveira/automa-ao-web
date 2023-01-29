package br.com.automation.web.tests;

import br.com.automation.web.core.Driver;
import br.com.automation.web.pages.HomePages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Validar {
    WebDriver webDriver;
    Driver driver;
    HomePages homePages;


    @BeforeTest
    public void startTest(){
        driver = new Driver("chrome");
        webDriver = driver.getDriver();
        webDriver.get("https://www.vanilton.net/triangulo/");
        homePages = new HomePages(webDriver);

    }

    @Test
    public void validarEquilatero(){

        homePages.inputSide1("3");
        homePages.inputSide2("3");
        homePages.inputSide3("3");
        homePages.clickIdentificar();
        homePages.validarEquilatero();
    }
    @Test
    public void validarIsosceles(){

        homePages.inputSide1("3");
        homePages.inputSide2("3");
        homePages.inputSide3("2");
        homePages.clickIdentificar();
        homePages.validarIsosceles();
    }
    @Test
    public void validarEscaleno(){

        homePages.inputSide1("1");
        homePages.inputSide2("2");
        homePages.inputSide3("3");
        homePages.clickIdentificar();
        homePages.validarEscaleno();
    }
    @AfterTest
    public void closeTeste(){
        webDriver.quit();
    }

}
