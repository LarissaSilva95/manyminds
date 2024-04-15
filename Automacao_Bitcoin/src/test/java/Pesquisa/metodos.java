package Pesquisa;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class metodos {

    private WebDriver navegador;

    public metodos(WebDriver navegador) {
        this.navegador = navegador;
    }

    public metodos click (By elemento) {
        navegador.findElement(elemento).click();
        return this;
    }

    public void escrever ( String texto, By elemeto){
        navegador.findElement(elemeto).sendKeys(texto);
    }

    public  void enter ( By elemento){

        navegador.findElement(elemento).sendKeys(Keys.ENTER);
    }

    public void validaResultado(By elemento) {
        navegador.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        int existe = navegador.findElements(elemento).size();
        Assertions.assertEquals(10, existe);
    }


}
