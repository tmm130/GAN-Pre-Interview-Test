package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home;
import pages.Registration;

public class RegistrationErrorValidationSteps {

	WebDriver driver = Hooks.driver;
	Home home = new Home(driver);
	Registration registration = new Registration(driver);
	
	@Given("I am on Home Page")
	public void i_am_on_home_page() throws Throwable {
		home.registrationLink.isDisplayed();
	}

	@Given("I navigate to Registration Page")
	public void i_navigate_to_registration_page() throws Throwable {
		home.registrationLink.click();
	}

	@When("I am on Registration Page")
	public void i_am_on_registration_page() throws Throwable {
		registration.title.isDisplayed();
		registration.firstName.isDisplayed();
		registration.surname.isDisplayed();
		registration.termsCheckbox.isDisplayed();
		registration.submitRegistrationForm.isDisplayed();
	}

	@When("I select {string} in the title field")
	public void i_select_in_the_title_field(String title) throws Throwable {
		registration.selectTitle(title);
	}

	@When("I enter {string} in the firstName field")
	public void i_enter_in_the_first_name_field(String firstName) throws Throwable {
		registration.firstName.clear();
		registration.firstName.sendKeys(firstName);
	}

	@When("I enter {string} in the surname field")
	public void i_enter_in_the_surname_field(String lastName) throws Throwable {
		registration.surname.clear();
		registration.surname.sendKeys(lastName);
	}

	@When("I click on termsAndConditions checkbox")
	public void i_click_on_terms_and_conditions_checkbox() throws Throwable {
		registration.termsCheckbox.click();
	}

	@Then("I click on Join Now from submission")
	public void i_click_on_join_now_from_submission() throws Throwable {
		registration.submitRegistrationForm.click();
	}

	@Then("{string} appears under Date of Birth field")
	public void appears_under_date_of_birth_field(String string) throws Throwable {
		registration.dobErrorMessage.isDisplayed();
	}
}
