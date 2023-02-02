package StepDefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AccountsTest extends BaseCalss {


@Then("I click the accounts tab")
public void i_click_the_accounts_tab() {
   driver.findElement(By.linkText("Accounts")).click();
}

@When("I click the new  {string} button")
public void i_click_the_new_button(String button) {
   driver.findElement(By.xpath("//input[@value='"+ button +"']")).click();
}
@When("I Enter {string} Account name")
public void i_enter_account_name(String account_name) {
	driver.findElement(By.id("acc2")).sendKeys(account_name);;
}
@Then("I Enter the {string} account number")
public void i_enter_the_account_number(String account_number) {
   driver.findElement(By.id("acc5")).sendKeys(account_number);
}
@Then("I Enter the {string} account Site")
public void i_enter_the_account_site(String account_site) {
   driver.findElement(By.id("acc23")).sendKeys(account_site);
}
@Then("I Enter the {string} Annaul revenue")
public void i_enter_the_annaul_revenue(String annaul_revenue) {
    driver.findElement(By.id("acc8")).sendKeys(annaul_revenue);
}
@Then("I Enter the {string} Phone number")
public void i_enter_the_phone_number(String phone_number) {
 driver.findElement(By.id("acc10")).sendKeys(phone_number);   
}
@Then("I Enter the {string} Fax number")
public void i_enter_the_fax_number(String fax_number) {
   driver.findElement(By.id("acc11")).sendKeys(fax_number);
}
@Then("I Enter the {string} website")
public void i_enter_the_website(String website) {
   driver.findElement(By.id("acc12")).sendKeys(website);
}
@Then("I Enter the {string} SIC code")
public void i_enter_the_sic_code(String sic_code) {
   driver.findElement(By.id("acc16")).sendKeys(sic_code);
}
@Then("I should see the following values for {string} field")
public void i_should_see_the_following_values_for_field(String FeildElm, io.cucumber.datatable.DataTable Values) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	
   List<String> rows= Values.asList(String.class);
   WebElement val= driver.findElement(By.id(FeildElm));
   Select sel = new Select(val);
   List<WebElement> opt= sel.getOptions();
   
   for (int i=0; i<opt.size();i++) {
	   Assert.assertEquals( rows.get(i), opt.get(i).getText());
	   
   }
   
}
@Then("I click the {string} save button")
public void i_click_the_save_button(String button) {
   driver.findElement(By.xpath("//input[@value='"+ button +"']")).click();
}
@Then("I should see the reccord I saved")
public void i_should_see_the_reccord_i_saved() {
	Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='topName']")).isDisplayed());
    
}
@Then("I can create an account")
public void i_can_create_an_account(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	
	List<Map<String,String>> records=dataTable.asMaps();
	
	for(Map<String,String> record:records) {
	
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.name("new")).click();		
	driver.findElement(By.id("acc2")).sendKeys(record.get("Account_Name"));
	driver.findElement(By.id("acc5")).sendKeys(record.get("Account_Number"));
	WebElement RatingElm= driver.findElement(By.id("acc9"));
	Select RatingSel= new Select(RatingElm);
	RatingSel.selectByVisibleText(record.get("Rating"));
	
	driver.findElement(By.name("save")).click();
	
	
}

}
}
