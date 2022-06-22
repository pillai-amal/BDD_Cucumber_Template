package Bindings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParamTest {

	WebDriver driver;

	@Given("user is in form webpage")
	public void user_is_in_form_webpage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}

	@When("enter {string} and {string}")
	public void enter_and(String string, String string2) {
		driver.findElement(By.id("firstName")).sendKeys(string);
		driver.findElement(By.id("lastName")).sendKeys(string2);
	}

	@Then("Quit the browser")
	public void quit_the_browser() {
		driver.quit();
	}
}
