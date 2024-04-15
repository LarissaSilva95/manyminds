package Pesquisa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

@DisplayName("Pesquisar resultados Bitcoin")
public class pesquisaBitcoin {

    private WebDriver navegador;
    @Test

    public void validarResultadoBitcoin() throws IOException, InterruptedException {
        //Abrir Navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        //Maximizar a tela
        navegador.manage().window().maximize();

        //Definir tempo de espera padrão
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navegar para pagina do Duckduckgo
        navegador.get("https://duckduckgo.com/");


        metodos mt = new metodos(navegador);
        elementos el = new elementos();

        mt.click(el.getCaixaTexto());
        mt.escrever("Bitcoin", el.getCaixaTexto());
        mt.enter(el.getCaixaTexto());
        mt.validaResultado(el.getPrimeiroArt());




    }


}
