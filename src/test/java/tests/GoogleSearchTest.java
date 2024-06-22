package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.WebDriverInit;

public class GoogleSearchTest {
WebDriver webDriver;
    @Given("I open the Google homepage")
    public void iOpenTheGoogleHomepage() {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");
        webDriver.manage().window().maximize();
    }


    @Then("enter the input text to Search")
    public void enterTheInputTextToSearch() {
//        WebDriverInit.webDriver.findElement(By.id("APjFqb")).sendKeys("Automate");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("document.getElementById('APjFqb').value='automate';");
    }
}
