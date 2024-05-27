package testCases;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Browser.Activity.BrowserActivity;
import page.object.model.ApplyLeave;
import page.object.model.loginPageObjects;

public class ApplyVerifyLeave {

	public WebDriver driver;

	@Test
	public void loginApplyLeave() throws InterruptedException {

		driver = BrowserActivity.startBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		loginPageObjects.user_name(driver).sendKeys("Admin");
		loginPageObjects.pass_word(driver).sendKeys("admin123");
		loginPageObjects.loginButton(driver).click();

		Thread.sleep(2000);
		PageFactory.initElements(driver, ApplyLeave.class);
		ApplyLeave.applyLeaveIcon.click();
		Thread.sleep(2000);
		String headerName = ApplyLeave.checkApplyLeaveHeader.getText();
		boolean headerNameContains = headerName.contains("Apply Leave");
		System.out.println(headerNameContains);

		ApplyLeave.clickLeaveType.click();
		Thread.sleep(1000);
		ApplyLeave.leaveTypeOption.click();

		String selectedLeaveType = ApplyLeave.verifyLeaveType.getText();
		System.out.println("Selected Leave type is: " + selectedLeaveType);
		Thread.sleep(1000);

		// Selecting FROM Date for leave
		ApplyLeave.clickFromDate.click();
		int dateCount = 1;
		for (int i = 0; i < dateCount; i++) {
			ApplyLeave.clickPreviousMonth1.click();
		}
		
		int selectFromDate = 10;
		List<WebElement> fromDateLits = ApplyLeave.iterateDate1;
		int totalDates = fromDateLits.size();
		System.out.println(totalDates);
		for (WebElement eachDate : fromDateLits) {
			String fetchDate = eachDate.getText();
			if (fetchDate.equals(String.valueOf(selectFromDate))) {
				eachDate.click();
				System.out.println("You FROM selected Date is: " + fetchDate);
				break;
			}
		}
		Thread.sleep(1000);
		String selectedFromDate= ApplyLeave.fromDateAfterSelected.getAttribute("value");
		System.out.println(selectedFromDate);
		
		// TO Date for leave
		int selectToDate = 12;
		ApplyLeave.clickToDate.click();
		
//		ApplyLeave.clickPreviousMonth2.click();
		List<WebElement> toDatesList = ApplyLeave.iterateDate2;
		int totalDates2 = toDatesList.size();
		System.out.println(totalDates2);
		for (WebElement eachDate : toDatesList) {
			String fetchDate = eachDate.getText();
			if (fetchDate.equals(String.valueOf(selectToDate))) {
				eachDate.click();
				System.out.println("You TO selected Date is: " + fetchDate);
				break;
			}
		}
		Thread.sleep(1000);
		String selectedTODate = ApplyLeave.toDateAfterSelected.getAttribute("value");
		System.out.println(selectedTODate);
		
		ApplyLeave.partialDaysDropDown.click();
		ApplyLeave.selectAllDays.click();
		
		Thread.sleep(1000);
		ApplyLeave.durationDropDown.click();
		ApplyLeave.halfDayMorningOption.click();
		
		Thread.sleep(1000);
		ApplyLeave.commentBox.sendKeys("Applyed for Sick Leave");
		ApplyLeave.applyButton.click();
		Thread.sleep(1000);
		String ActionBarMsg = ApplyLeave.actionBar.getText();
		boolean successPopUp = ActionBarMsg.contains("Success");
		System.out.println(ActionBarMsg);
		System.out.println(successPopUp);
		Thread.sleep(1500);
//		driver.quit();
		
		ApplyLeave.myLeave.click();
		Thread.sleep(3000);
		List<WebElement> commentText = ApplyLeave.verifyTheTable;
		int numberOfIteration = commentText.size();
		System.out.println(numberOfIteration);
		for (WebElement webElement : commentText) {
			String iteratText = webElement.getText();
			if (iteratText.equals("Applyed for Sick Leave")) {
				System.out.println("Your comment is applyed in the leave form ");
				break;
			}
		}
		
		

	}

}
