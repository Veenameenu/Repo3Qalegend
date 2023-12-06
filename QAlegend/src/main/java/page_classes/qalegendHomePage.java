package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendHomePage {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Dashboard']")
   WebElement dashBoardBtn;
	@FindBy(xpath="//span[text()='Team members']")
	WebElement teamMembersBtn;
	@FindBy(xpath=("//span[text()='Items']"))
	WebElement ItemPage;
	@FindBy(xpath="//div[@id='sidebar-scroll']")
	WebElement Scrolldashborad;
	@FindBy(xpath=("//span[text()='Leave']"))
	WebElement LeavePage;
	@FindBy(xpath="//span[text()='Time cards']")
	WebElement TimeCardBtn;
	
   
   public qalegendHomePage(WebDriver driver) {
		this.driver=driver;
	   PageFactory.initElements(driver,this);
	}
   public void scrollTillTimeCardButton() {
		page_utility.scrollToFindElement(driver, TimeCardBtn);
	}
public void navigateToLeavePage(String value) {
	page_utility.navigateto(driver, value);
}
public Boolean dashBoardButton()
   {
	   return page_utility.isElementDisplayed( dashBoardBtn);
   }
public void teamMembersButton()
{
	page_utility.clickOnElement(teamMembersBtn);
}
public void itemPageButton() {
	page_utility.clickOnElement(ItemPage); 
	}

public void LeavePageButton() {
	page_utility.clickOnElement(LeavePage); 
}
}

	
	
	


