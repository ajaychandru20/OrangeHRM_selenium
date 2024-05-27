package page.object.model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ApplyLeave {
	
	@FindBy(how = How.XPATH,xpath = "//*[@id='app']"
			+ "/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[4]/button")
	public static WebElement applyLeaveIcon;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6")
	public static WebElement checkApplyLeaveHeader;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/"
			+ "form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	public static WebElement clickLeaveType;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/"
			+ "form/div[1]/div/div[1]/div/div[2]/div/div[2]/div/span")
	public static WebElement leaveTypeOption;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	public static WebElement verifyLeaveType;
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[1]/input")
	public static WebElement clickFromDate;	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/button[1]")
	public static WebElement clickPreviousMonth1;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/button[2]")
	public static WebElement clickNextMonth1;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div")
	public static List<WebElement> iterateDate1;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input")
	public static WebElement fromDateAfterSelected;
	
	// To Date
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[1]/input")
	public static WebElement clickToDate;
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/button[1]")
	public static WebElement clickPreviousMonth2;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/button[2]")
	public static WebElement clickNextMonth2;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[3]/div")
	public static List<WebElement> iterateDate2;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input")
	public static WebElement toDateAfterSelected;
	
	
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div/div[1]")
	public static WebElement partialDaysDropDown;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div[2]/div[2]/span")
	public static WebElement selectAllDays;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div/div[1]")
	public static WebElement durationDropDown;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div[2]/div[2]/span")
	public static WebElement halfDayMorningOption;
	
	@FindBy(tagName = "textarea")
	public static WebElement commentBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement applyButton;
	
	
	@FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[1]")
	public static WebElement actionBar;
	
	
	// Verify the Leave in the table 
	
	@FindBy(linkText = "My Leave")
	public static WebElement myLeave;
	
	@FindBy(xpath = "//div[2][@class=\"oxd-table-body\"]/div/div/div")
	public static List<WebElement> verifyTheTable;
	
	
	
	
	
	
	
	

}
