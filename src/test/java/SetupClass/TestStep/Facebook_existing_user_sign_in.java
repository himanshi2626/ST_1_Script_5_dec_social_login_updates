package SetupClass.TestStep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Facebook_existing_user_sign_in extends Set{
	
	WebDriverWait wait = new WebDriverWait(driver,50);

	@Given("^user is already on Home Page old fb$")
	public void user_is_already_on_Home_Page_old_fb() throws InterruptedException {
		
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(4000);

	    
	}

	@Then("^User click on sign in with facebook button old fb$")
	public void user_click_on_sign_in_with_facebook_button_old_fb() throws InterruptedException  {
		
		Thread.sleep(3000);
		
		
	}

	@Then("^user go to free ppts page old fb$")
	public void user_go_to_free_ppts_page_old_fb() throws InterruptedException  {
	 
		
		Thread.sleep(1000);

	}

	@Then("^user download a free ppt old fb$")
	public void user_download_a_free_ppt_old_fb() throws InterruptedException  {
	 
		Thread.sleep(2000);
		
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
		
	}

}
