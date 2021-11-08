package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
	public Registration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Added only the necessary page elements for the pre-interview test.
	
	@FindBy(id = "title")
	public WebElement title;
	
	public void selectTitle(String titleInput) {
		Select titleSelect = new Select(title);
		titleSelect.selectByVisibleText(titleInput);
	}
	
	@FindBy(id = "forename")
	public WebElement firstName;
	
	@FindBy(name = "map(lastName)")
	public WebElement surname;
	
	@FindBy(xpath = "//input[@class='required checkbox terms']")
	public WebElement termsCheckbox;
	
	@FindBy(id = "form")
	public WebElement submitRegistrationForm;
	
	@FindBy(xpath = "//label[@for='dob']")
	public WebElement dobErrorMessage;
}
