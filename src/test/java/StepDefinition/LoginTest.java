package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseCalss {
	@Given("I open {string} browser")
	public void i_open_browser(String string) {
		openbrowser("chrome");
	}
	@Given("I visit {string} environment")
	public void i_visit_environment(String string) {
		openApplication("qa");
	}
	@When("I enter {string} username")
	public void i_enter_username(String username) {
	    driver.findElement(By.id("username")).sendKeys(username);
	}
	@When("I enter {string} password")
	public void i_enter_password(String password) {
	   driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("I click the {string} button")
	public void i_click_the_button(String button) {
	   driver.findElement(By.xpath("//input[@name='"+button+"']")).click();
	}
	@Then("I should see the dashboard")
	public void i_should_see_the_dashboard() {
	 boolean dashboard= driver.findElement(By.id("phHeaderLogoImage")).isDisplayed();
	 Assert.assertTrue(dashboard);
	}
}
