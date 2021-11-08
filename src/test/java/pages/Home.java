package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Added only the necessary page elements for the pre-interview test.
	
	private final String header = "//div[@class='header']";
	
	@FindBy(xpath = header + "//div//a[@class='newUser green']")
	public WebElement registrationLink;
}
