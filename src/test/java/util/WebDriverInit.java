package util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInit {

    public static WebDriver webDriver;

    @Before
    public void WebDriverStart() {
        if (webDriver == null)
            System.setProperty("webdriver.chrome.driver", "D:\\CICD\\CucumberTestNG\\src\\test\\resources\\drivers\\chromedriver.exe");
            webDriver = new ChromeDriver();
    }
}


