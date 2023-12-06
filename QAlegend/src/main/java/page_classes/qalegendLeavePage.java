package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendLeavePage {
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Pending approval']")
	WebElement PendingApproval;
	@FindBy(xpath="//a[text()='All applications']")
	WebElement AllApplications;
	@FindBy(xpath="//a[text()='Summary']")
	WebElement Summary;
	@FindBy(xpath = "//a[@title='Apply leave']")

	WebElement Applyleave_opt;
	@FindBy(xpath = "//div[@class='select2-container select2 validate-hidden']")
	WebElement leavetype_field;
	@FindBy (xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
	WebElement casual_leave;

	@FindBy(xpath = "//label[@class='mr15']")

	WebElement duration_field;

	@FindBy(xpath =  "//input[@name='single_date']")

	WebElement date_field;

	@FindBy(xpath = "//td[text()='30']")

	WebElement date_select;

	@FindBy (xpath = "//textarea[@class='form-control']")

	WebElement reason_field;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement ApplyLeave2;
	@FindBy(xpath="(//input[@type='search'])[1]")
	WebElement SearchPage;
	
	
	
public qalegendLeavePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

public Boolean pendingApprovalOption() {
   return (page_utility.isElementDisplayed(PendingApproval));
}
   public Boolean allApplicationsOption() {
	   return(page_utility.isElementDisplayed(AllApplications));
   }
   public Boolean summayOption() {
	   return(page_utility.isElementDisplayed(Summary));
   }
   public void applyLeaveoption() {

		page_utility.clickOnElement(Applyleave_opt); 

	}
   public void leaveTypeField() {

		page_utility.clickOnElement(leavetype_field); 

	}
   public void casualLeave() {

		page_utility.clickOnElement(casual_leave);

	}
   public void durationField1() {

		page_utility.clickOnElement(duration_field); 

	}
   public void dateField() {

		page_utility.clickOnElement(date_field); 

	}
   public void dateSelect() {

		page_utility.clickOnElement(date_select); 

	}
   public void reasonField(String reason) {

		page_utility.enterText(reason_field, reason);

	}
   public void applyLeaveButton() {
	   page_utility.clickOnElement(ApplyLeave2);
   }
   public Boolean searchPageButton() {
	   return page_utility.isElementDisplayed(SearchPage);
   }
   
   
   
   
   
   
   
}

