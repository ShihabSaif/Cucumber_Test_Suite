package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TpPortalLoginSteps {
    WebDriver driver = null;
    @Given("chrome browser is open")
    public void chrome_browser_is_open() throws InterruptedException {
        System.out.println("browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("project path is : " + projectPath);
        System.getProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        Thread.sleep(3000);
    }

    @And("user is on portal login page")
    public void user_is_on_portal_login_page() throws InterruptedException {
        System.out.println("user_is_on_google_search_page");
        driver.navigate().to("http://10.9.0.77:5334/#/login");
        Thread.sleep(5000);
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() throws InterruptedException {
        System.out.println("user enters username and password");
        driver.findElement(By.cssSelector("input[placeholder='Enter username']")).sendKeys("shihab");
        driver.findElement(By.cssSelector("input[placeholder='Enter password']")).sendKeys("Shihab@007!");
        Thread.sleep(2000);
    }

    @And("user clicks login button")
    public void userClicksLoginButton() throws InterruptedException {
        System.out.println("user clicks login button");
        driver.findElement(By.className("btn-primary")).click();
        Thread.sleep(2000);
    }

    @When("user enters otp number")
    public void userEntersOtpNumber() throws InterruptedException {
        System.out.println("user enters otp number");
        driver.findElement(By.cssSelector("input[placeholder='Enter OTP']")).sendKeys("123456");
        Thread.sleep(2000);
    }

    @And("user clicks submit button")
    public void userClicksSubmitButton() throws InterruptedException {
        System.out.println("user clicks submit button");
        driver.findElement(By.className("btn-primary")).click();
        Thread.sleep(2000);
    }

    @Then("user is navigated to the portal homepage")
    public void user_is_navigated_to_the_portal_homepage() {

    }

}
