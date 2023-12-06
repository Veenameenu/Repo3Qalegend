package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendItemPage {
WebDriver driver;
@FindBy(xpath="//a[@class='btn btn-default']")
WebElement AddItem;
@FindBy(xpath="//h4[text()='Add item']")
WebElement AdditemPage;
@FindBy(xpath="//input[@name='title']")
WebElement Title;
@FindBy(xpath="//textarea[@name='description']")
WebElement Description;
@FindBy(xpath="//input[@name='unit_type']")
WebElement UnitType;
@FindBy(xpath="//input[@name='item_rate']")
WebElement Rate;
@FindBy(xpath="//button[text()=' Save']")
WebElement Save4;
@FindBy(xpath="//input[@type='search']")
WebElement ItemPage2;










public qalegendItemPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void addItemButton() {
	page_utility.clickOnElement(AddItem); 
}
public Boolean additemPageButton() {
	return page_utility.isElementDisplayed(AdditemPage);

}
public void titleTextBox(String title) {
	page_utility.enterText(Title, title); 
}
public void descriptionTextBox(String discription) {
	page_utility.enterText(Description, discription);
}
public void unitTypeTextBox(String unittype) {
	page_utility.enterText(UnitType, unittype); 
}
public void rateTextBox(String rate) {
	page_utility.enterText(Rate, rate); 
}
public void save4Button() {
	page_utility.clickOnElement(Save4); 
}
public Boolean testerDisplayPage() {
	return page_utility.isElementDisplayed(ItemPage2);
}
}




