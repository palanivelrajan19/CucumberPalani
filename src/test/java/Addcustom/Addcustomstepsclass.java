package Addcustom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addcustomstepsclass {
	static WebDriver driver;
	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Palani\\eclipse-workspace\\cucuproject\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();  
	}

	@When("The user is filling all the details")
	public void the_user_is_filling_all_the_details() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Palani");
		   driver.findElement(By.id("lname")).sendKeys("rajan");
		   driver.findElement(By.id("email")).sendKeys("palani@gmail.com");
		   driver.findElement(By.name("addr")).sendKeys("chennai");
		   driver.findElement(By.name("telephoneno")).sendKeys("123456789");  
		   
	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("The user should be displaye the customerid")
	public void the_user_should_be_displaye_the_customerid() {
		 Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
	}

}
