package test;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
//	WebDriver driver;
	EdgeDriver driver = new EdgeDriver();
	@Given("user enters into the website")
	public void user_enters_into_the_website() {
		
		driver.get("https://bookcart.azurewebsites.net/");
	    System.out.println("1");
	}

	@Given("user click on login link")
	public void user_click_on_login_link() {
	    System.out.println("12");
	    driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();

	}

	@Given("user enters name as ortonoi")
	public void user_enters_name_as_ortonoi() {
	    System.out.println("13");
	    driver.findElement(By.id("mat-input-0")).sendKeys("ortoni");

	}

	@Given("user enetrs the password as pass1234")
	public void user_enetrs_the_password_as_pass1234() {
	    System.out.println("14");
	    driver.findElement(By.id("mat-input-1")).sendKeys("pass1234");
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
	    System.out.println("15");
	    driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-raised-button')]")).click();

	}

	@Then("login success")
	public void login_success() {
		String actual = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-button')])[1]")).getText(); 
		System.out.println(actual);
		Assert.assertEquals(actual, "book Book Cart");
	    System.out.println("Login success");
	    

	}

	public void userShouldNavigate() {
		System.out.println("i am here");
	}
}
