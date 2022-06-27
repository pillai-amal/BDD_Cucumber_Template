package Bindings;

import java.util.List;

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
	
	@When("enter creds")
	public void enter_creds(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> creds = dataTable.cells();
		System.out.println(creds);
		driver.findElement(By.id("firstName")).sendKeys(creds.get(0).get(0));
		driver.findElement(By.id("lastName")).sendKeys(creds.get(0).get(1));
	}

	@Then("Quit the browser")
	public void quit_the_browser() {
		driver.quit();
	}
}
