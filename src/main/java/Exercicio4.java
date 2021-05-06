import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.Map;

public class Exercicio4 {

    public static void main(String[] args) throws IOException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.setExperimentalOption("prefs", Map.of("profile.default_content_setting_values.cookies", 2));
        chromeOptions.addArguments("--start-maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);


        webDriver.get("http://ondas.cptec.inpe.br");

        //webDriver.findElement(By.name("estado")).sendKeys("Bahia");

        Select dropdown = new Select(webDriver.findElement(By.id("estado")));
        dropdown.selectByVisibleText("Bahia");

        //final By estado = By.id("estado");
        // final By cidade = By.id("cidade");


        //   new Select(webDriver.findElement(estado)).selectByValue("Alagoas");
        //   new Select(webDriver.findElement(estado)).selectByValue("Porto de Pedras");


    }
}
