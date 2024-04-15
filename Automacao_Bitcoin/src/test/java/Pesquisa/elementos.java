package Pesquisa;

import org.openqa.selenium.By;

public class elementos {

    private By caixaTexto = By.name("q");
    private By btnPesquisa = By.cssSelector("#searchbox_homepage > div > div > button > svg");
    private By primeiroArt = By.tagName("article");


    public By getCaixaTexto() {
        return caixaTexto;
    }

    public void setCaixaTexto(By caixaTexto) {
        this.caixaTexto = caixaTexto;
    }

    public By getBtnPesquisa() {
        return btnPesquisa;
    }

    public void setBtnPesquisa(By btnPesquisa) {
        this.btnPesquisa = btnPesquisa;
    }


    public By getPrimeiroArt() {
        return primeiroArt;
    }

    public void setPrimeiroArt(By primeiroArt) {
        this.primeiroArt = primeiroArt;
    }
}
