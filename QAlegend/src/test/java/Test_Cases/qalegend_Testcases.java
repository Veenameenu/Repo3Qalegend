package Test_Cases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Automation_Core.Base_Class;
import page_classes.qalegendHomePage;
import page_classes.qalegendItemPage;
import page_classes.qalegendLeavePage;
import page_classes.qalegendLoginPage;
import page_classes.qalegendTeamMembersPage;
import utilities.ExcelUtility;
import utilities.WaitUtility;
import utilities.page_utility;

public class qalegend_Testcases extends Base_Class {
	public WebDriver driver; 
	qalegendLoginPage login_page;
	qalegendHomePage homePage;
	qalegendTeamMembersPage teamMembersPage;
	qalegendItemPage  ItemPage;
	qalegendLeavePage LeavePage;
	public static Properties prop;
	String excelFilePath="/src/main/resources/Test_Data/Users_details.xlsx";
	FileInputStream fs;
	@BeforeMethod
	@Parameters  ({"browser"})
	public void intialization(String browserName) throws Exception{
		driver=browserinstialization(browserName);
		 login_page=new qalegendLoginPage(driver); 
		 homePage=new qalegendHomePage(driver);
		 teamMembersPage=new qalegendTeamMembersPage(driver);
		 ItemPage=new qalegendItemPage(driver);
		 LeavePage=new 	qalegendLeavePage(driver);
		prop =new Properties();
		//fs=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\QAlegend\\src\\main\\resources\\Test_Data\\TestData.properties");
		fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Test_Data\\TestData.properties");
		prop.load(fs);
		driver.get(prop.getProperty("URL"));
		
		
}
	@Test
	public void tc01() throws IOException
	{
		//login_page.userLogin(ExcelUtility.getString(1, 0, excelFilePath, "Users"),ExcelUtility.getString(1, 1, excelFilePath, "Users"));
		
		
		login_page.loginUsernameField(prop.getProperty("UserNameValue"));
		login_page.loginPasswordField(prop.getProperty("PassWordValue"));
		login_page.signinButton();
		Assert.assertEquals(homePage.dashBoardButton(), true);
		
	}
	@Test
	public void tc02() throws IOException {
		login_page.loginUsernameField(ExcelUtility.getString(2, 0, excelFilePath, "Users"));
		login_page.loginPasswordField(ExcelUtility.getNumeric(2, 1, excelFilePath, "Users"));
		
		login_page.signinButton();
				Assert.assertEquals(login_page.LoginErrorMessageVarification(),true) ;
	}
	@Test
	public void tc03() {
	login_page.forgotPwdField();
	Assert.assertEquals(login_page.forgotPwdPageField(),true);
	}
	
	@Test
	public void tc04() throws IOException {
		login_page.loginUsernameField(ExcelUtility.getString(1, 0, excelFilePath, "Users"));
		login_page.loginPasswordField(ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
		login_page.signinButton();
		Assert.assertEquals(homePage.dashBoardButton(), true);
		homePage.teamMembersButton();
		teamMembersPage.addMemberButton();
		Assert.assertEquals(teamMembersPage.addMemberPage(),true);
		
	}
	
		@Test
		public void tc05() throws IOException {
			login_page.loginUsernameField(ExcelUtility.getString(1, 0, excelFilePath, "Users"));
			login_page.loginPasswordField(ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
			login_page.signinButton();
			Assert.assertEquals(homePage.dashBoardButton(), true);
			homePage.teamMembersButton();
			teamMembersPage.sendInvitationButton();
			
			teamMembersPage.emailsendTextBox(ExcelUtility.getString(9, 1, excelFilePath,"TeamMembers" ));
			teamMembersPage.saveSendButton();
			Assert.assertEquals(teamMembersPage.sendInvitationPageOpen(),true);
		}
		@Test
		public void tc06() throws IOException {
			login_page.loginUsernameField(ExcelUtility.getString(1, 0, excelFilePath, "Users"));
			login_page.loginPasswordField(ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
			login_page.signinButton();
			Assert.assertEquals(homePage.dashBoardButton(), true);
			homePage.teamMembersButton();
			teamMembersPage.sendInvitationButton();
			
			teamMembersPage.emailsendTextBox(ExcelUtility.getString(9, 1, excelFilePath,"TeamMembers" ));
			teamMembersPage.AddmoreOption();
			teamMembersPage.Emailsend2TextBox(ExcelUtility.getString(13,1, excelFilePath,"TeamMembers" ));
			teamMembersPage.saveSendButton();
			Assert.assertEquals(teamMembersPage.sendInvitationPageOpen(),true);
		}
		@Test
		public void tc07() throws IOException {
			login_page.loginUsernameField(ExcelUtility.getString(1, 0, excelFilePath, "Users"));
			login_page.loginPasswordField(ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
			login_page.signinButton();
			Assert.assertEquals(homePage.dashBoardButton(),true); 
			homePage.itemPageButton();
			ItemPage.addItemButton();
			Assert.assertEquals(ItemPage.additemPageButton(),true);
		}
		@Test
		public void tc08() throws IOException {
			login_page.loginUsernameField(ExcelUtility.getString(1, 0, excelFilePath, "Users"));
			login_page.loginPasswordField(ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
			login_page.signinButton();
			Assert.assertEquals(homePage.dashBoardButton(),true);
			homePage.itemPageButton();
			ItemPage.addItemButton();
			Assert.assertEquals(ItemPage.additemPageButton(),true);
		    ItemPage.titleTextBox(ExcelUtility.getString(0, 1, excelFilePath, "Items"));
		    ItemPage.descriptionTextBox(ExcelUtility.getString(1, 1, excelFilePath,"Items" ));
		    ItemPage.unitTypeTextBox(ExcelUtility.getNumeric(2, 1, excelFilePath,"Items"  ));
		    ItemPage.rateTextBox(ExcelUtility.getNumeric(3, 1, excelFilePath,"Items"  ));
		    ItemPage.save4Button();
		    Assert.assertEquals(ItemPage.testerDisplayPage(),true);
		}
		@Test
		public void tc09() throws IOException {
			login_page.loginUsernameField(ExcelUtility.getString(1, 0, excelFilePath, "Users"));
			login_page.loginPasswordField(ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
			login_page.signinButton();
			Assert.assertEquals(homePage.dashBoardButton(),true);
			homePage.navigateToLeavePage(prop.getProperty("LeavePageURL"));
			Assert.assertEquals(LeavePage.pendingApprovalOption(), true);
			Assert.assertEquals(LeavePage.allApplicationsOption(),true);
			Assert.assertEquals(LeavePage.summayOption(),true);
		}
		
		@Test
		public void tc10() throws IOException {
			login_page.loginUsernameField(ExcelUtility.getString(1, 0, excelFilePath, "Users"));
			login_page.loginPasswordField(ExcelUtility.getNumeric(1, 1, excelFilePath, "Users"));
			login_page.signinButton();
			Assert.assertEquals(homePage.dashBoardButton(),true);
			homePage.navigateToLeavePage(prop.getProperty("LeavePageURL"));
			Assert.assertEquals(LeavePage.pendingApprovalOption(), true);
			Assert.assertEquals(LeavePage.allApplicationsOption(),true);
			Assert.assertEquals(LeavePage.summayOption(),true);
			LeavePage.applyLeaveoption();	
			LeavePage.leaveTypeField();
			LeavePage.casualLeave();
			LeavePage.durationField1();
			LeavePage.dateField();
            LeavePage.dateSelect();
            LeavePage.reasonField(ExcelUtility.getString(3, 1, excelFilePath,"Leave"));
            LeavePage.applyLeaveButton();
            Assert.assertEquals(LeavePage.searchPageButton(),true);
		}
		
	} 






