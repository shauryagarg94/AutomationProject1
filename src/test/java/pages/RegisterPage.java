package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {

		this.driver = driver;

	}
	
	By firstName = By.id("input-firstname");
	By lastName  = By.id("input-lastname");
	
	public void enterFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }
	
	public void enterLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);

    }
}
