package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {
    WebDriver driver = null;
    @Given("browser is open")
    public void browser_is_open() throws InterruptedException {
        System.out.println("browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("project path is : " + projectPath);
        System.getProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        Thread.sleep(3000);
    }
    @And("user is on google search page")
    public void user_is_on_google_search_page() throws InterruptedException {
        System.out.println("user_is_on_google_search_page");
        driver.navigate().to("https://google.com");
        Thread.sleep(2000);

    }
    @When("user enters text in search box")
    public void user_enters_text_in_search_box() throws InterruptedException {
        System.out.println("user_enters_text_in_search_box");
        driver.findElement(By.name("q")).sendKeys("software");
        Thread.sleep(2000);
    }
    @Then("user is navigated here")
    public void user_is_navigated_here() throws InterruptedException {
        System.out.println("user_is_navigated_here");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
}
