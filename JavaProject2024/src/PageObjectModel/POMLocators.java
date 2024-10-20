package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLocators {
	POMLocators(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "email")
	private WebElement eamil;

	public WebElement getEamil() {
		return eamil;
	}

}
