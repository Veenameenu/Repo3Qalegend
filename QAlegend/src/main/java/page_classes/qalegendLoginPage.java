package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendLoginPage {
WebDriver driver;
@FindBy(name="email")
WebElement username_field ;
@FindBy(name="password")
WebElement password_field;
@FindBy(xpath="//button[text()='Sign in']")
WebElement Sign_in_btn;
@FindBy(xpath="//span[text()='Authentication failed!']")
WebElement LoginError;
@FindBy(xpath="//a[text()='Forgot password?']")
WebElement forgotpassword;
@FindBy(xpath="//input[@name='email']")
WebElement forgotpasswordPage;

public qalegendLoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public Boolean LoginErrorMessageVarification() {
	return (page_utility.isElementDisplayed(LoginError));
}
public void loginUsernameField(String username) {
	page_utility.enterText(username_field, username);
}
public void loginPasswordField(String password) {
     page_utility.enterText(password_field, password);
}
public void signinButton() {
	  page_utility.clickOnElement( Sign_in_btn);
}
	public void forgotPwdField() {
	page_utility.clickOnElement(forgotpassword); 
}
	public Boolean forgotPwdPageField() {
		return (page_utility.isElementDisplayed(forgotpasswordPage));
	}

}
