import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Teste {

    DriverManagerType driverManagerType;

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.setExperimentalOption("prefs", Map.of("profile.default_content_setting_values.cookies", 2));
        chromeOptions.addArguments("--start-maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

       // webDriver.get("https://gshow.globo.com/realities/bbb/bbb21/votacao/paredao-bbb21-vote-para-eliminar-camilla-de-lucas-gilberto-ou-juliette-55e6ae46-c55a-4988-bf25-22f8cf360284.ghtml");
      //  webDriver.findElement(By.xpath("//div[@class='_16b505f2a42d59ecd63']")).click();

        //webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        webDriver.get("https://www.itau.com.br/");
        webDriver.findElement(By.id("agencia")).sendKeys("0252");
        webDriver.findElement(By.id("conta")).sendKeys("23085-9");
        WebDriverWait webDriverWait  = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("btnLoginSubmit"))).click();

       // webDriver.findElement(By.id("btnLoginSubmit")).click();


        WebElement teclas = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='teclas clearfix']")));

        List<WebElement> botoes = teclas.findElements(By.xpath("//a[@class='tecla left campoTeclado']"));

        for (WebElement botao : botoes){
            if (botao.getText().contains("1")) {
                botao.click();
            }
        }

      //  webDriver.quit();
       // webDriver.close();


       /* WebDriverWait webDriverWait  = new WebDriverWait(webDriver, Duration.ofSeconds(15));
        webDriver.findElement(By.id("btnLoginSubmit")).click();
        WebElement teclas = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='teclas clearfix']")));*/

       // webDriver.findElement(By.xpath("//div[@class='teclas clearfix']"));
     //  System.out.println(teclas.getText());
        //webDriver.get("https://www.hltv.org/");

      // webDriver.findElement(By.xpath("//div[@class='navsignin']")).click();

     //   WebElement form = webDriver.findElement(By.xpath("//div[@id='overlay']//form"));
     //   form.findElement(By.name("username")).sendKeys("danilozagato");
      //  form.findElement(By.name("password")).sendKeys("PipocaDoce");
      //  form.findElement(By.name("login")).click();

      //  WebElement element = webDriver.findElement(By.name("password"));
        //element.sendKeys("PipocaDoce");


        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement btnk = webDriver.findElement(By.name("btnk"));
        btnk.click();*/




    }

}
