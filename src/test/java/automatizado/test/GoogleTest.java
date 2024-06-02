package automatizado.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class GoogleTest {

    private WebDriver driver;
    private final String baseUrl = "http://www.google.com";
    private final String driverPath = "src/test/java/automatizado/resource/chromedriver-v125.0.6422.exe";
    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @Test
    public void pesquisa() {
        iniciar();
    }


}
