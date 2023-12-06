package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendTeamMembersPage {
WebDriver driver;

@FindBy(xpath="(//a[@class='btn btn-default'])[2]")
WebElement addMemberBtn;
@FindBy(xpath="//h4[text()='Add member']")
WebElement AddMemberPageOpen;
@FindBy(xpath="//a[text()=' Send invitation']")
WebElement SendInvitation;
@FindBy(xpath="//input[@name='email[]']")
WebElement Emailsend;
@FindBy(xpath="//button[@type='submit']")
WebElement SaveSend;
@FindBy(xpath="//a[@id='add-more-invitation']")
WebElement Addmore;
@FindBy(xpath="(//input[@id='email'])[2]")
WebElement Emailsend2;
@FindBy(xpath="(//td[text()='tester'])[2]")
WebElement SendTInvitationPage;









public qalegendTeamMembersPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void addMemberButton() {
	
 page_utility.clickOnElement(addMemberBtn); 
}
public Boolean addMemberPage() {
	return(page_utility.isElementDisplayed(AddMemberPageOpen));
}

	public void sendInvitationButton() {
		page_utility.clickOnElement(SendInvitation); 
	}
	
	public void emailsendTextBox(String email) {
		page_utility.enterText(Emailsend, email); 
	}
	public void saveSendButton() {
		page_utility.clickOnElement(SaveSend); 
	}
	public void AddmoreOption() {
		page_utility.clickOnElement(Addmore); 
	}
	public void Emailsend2TextBox(String email2) {
		page_utility.enterText(Emailsend2, email2);  
	}
	public Boolean sendInvitationPageOpen() {
		return(page_utility.isElementDisplayed(SendTInvitationPage));
	}
	
	
	
	
	
	}
	
	
                            







	


