import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Exercicio3 {
    public static void main(String[] args) throws IOException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.setExperimentalOption("prefs", Map.of("profile.default_content_setting_values.cookies", 2));
        chromeOptions.addArguments("--start-maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);


        webDriver.get("https://www.mercadolivre.com.br/");
        webDriver.findElement(By.name("as_word")).sendKeys("celular");
        webDriver.findElement(By.xpath("//button[@class='nav-search-btn']")).click();
        //WebElement pesquisa = webDriver.findElement(By.xpath("//div[@class='ui-search']"));
        WebElement pesquisa = webDriver.findElement(By.xpath("//div[@class='ui-search-result__content-wrapper']"));

        List<WebElement> tituloItens = pesquisa.findElements(By.xpath("//h2[@class='ui-search-item__title']"));
        List<WebElement> precoItens = pesquisa.findElements(By.xpath("//span[@class='price-tag-fraction']"));


        for (int i=0; i<10; i++) {

            System.out.println(tituloItens.get(i).getText() + " Preço= $" + precoItens.get(i).getText());


        }


    }
}


