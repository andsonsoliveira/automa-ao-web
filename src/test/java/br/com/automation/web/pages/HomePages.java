package br.com.automation.web.pages;

import br.com.automation.web.maps.HomeMaps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePages {
    WebDriver webDriver;

    HomeMaps homeMaps;

    public HomePages(WebDriver webDriver) {
        this.webDriver = webDriver;
        homeMaps = new HomeMaps();
        PageFactory.initElements(webDriver,homeMaps);
    }


     public void inputSide1(String valorSide1){
        homeMaps.tbSide1.sendKeys(valorSide1);
     }
    public void inputSide2(String valorSide2){
        homeMaps.tbSide2.sendKeys(valorSide2);
    }
    public void inputSide3(String valorSide3){
        homeMaps.tbSide3.sendKeys(valorSide3);
    }

    public void clickIdentificar(){
        homeMaps.btIdentificar.click();
    }
    public String validarEquilatero(){
        Assert.assertEquals(homeMaps.tvResultado,"Equilátero");
        return null;
    }
    public String validarIsosceles() {
        Assert.assertEquals(homeMaps.tvResultado, "Isósceles");
        return null;
    }
    public String validarEscaleno() {
        Assert.assertEquals(homeMaps.tvResultado.getText(), "Escaleno");
        return null;
    }
}
