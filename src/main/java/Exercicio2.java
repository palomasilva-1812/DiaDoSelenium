import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Exercicio2 {

    public static void main(String[] args) throws IOException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.setExperimentalOption("prefs", Map.of("profile.default_content_setting_values.cookies", 2));
        chromeOptions.addArguments("--start-maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);


        webDriver.get("https://www.facebook.com/");
       
        webDriver.findElement(By.id("email")).sendKeys("paloma-silva12@hotmail.com");
        webDriver.findElement(By.id("pass")).sendKeys("23085-9");

        File printscreen = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(printscreen, new File("Curso.png"));
    }
}
