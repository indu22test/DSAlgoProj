package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepDefinitions.BaseClass;

public class ArrayPage extends BaseClass {
	
	public WebDriver driver;

	public ArrayPage(WebDriver driver) {
	   
		this.driver = driver;

	  }
	
	By getstarted = By.xpath("//button[text()='Get Started']");
	By signin = By.xpath("//a[contains(text(),'Sign in')]");
	By username = By.name("username");
	By password = By.name("password");
	By login = By.xpath("//input[@value='Login']");
	By arrayGetStarted = By.xpath("//a[@href='array']");
	By arraysInPython = By.xpath("//a[text()='Arrays in Python']");
	By arraysUsingList = By.xpath("//a[text()='Arrays Using List']");
	By basicOperations = By.xpath("//a[text()='Basic Operations in Lists']");
	By applicationsOfArray = By.xpath("//a[text()='Applications of Array']");
	By tryEditor = By.xpath("//a[text()='Try here>>>']");
	By practiceQuestions = By.xpath("//a[text()='Practice Questions']");
	By searchTheArrayQ = By.xpath("//a[text()='Search the array']");
	By maxConsecutiveOnesQ = By.xpath("//a[text()='Max Consecutive Ones']");
	By findNumbersQ = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	By squaresQ = By.xpath("//a[text()='Squares of  a Sorted Array']");
	By textBox = By.xpath("//div[@class='CodeMirror-scroll']");
	By runBtn = By.xpath("//button[@type='button']");
	By numpyNinjaTab = By.xpath("//*[text()='NumpyNinja']");
	By dataStrTab = By.xpath("//*[text()='Data Structures']");
	By stackTab = By.xpath("//a[@href='/stack']");
	By submitBtn = By.xpath("//input[@type='submit']");
	By errorMessage = By.id("output");
	By graphTab = By.xpath("//a[@href='/graph']");
	By signOutTab = By.xpath("//a[@href='/logout']");
	By linkedListTab = By.xpath("//a[@href='linked-list']");
	By queueTab = By.xpath("//a[@href='/queue']");
	By treeTab = By.xpath("//a[@href='/tree']");

	
public void getstarted() {
	driver.findElement(getstarted).click();
}

public void signIn() {
	driver.findElement(signin).click();
}

public void Username(String username) {
WebElement usernameinput= driver.findElement(By.name("username"));
usernameinput.sendKeys(username);
}

public void Password(String password) {
WebElement passwordinput= driver.findElement(By.name("password"));
passwordinput.sendKeys(password);
}

public void loginbutton() {
driver.findElement(login).click();
}

public void arrayGetStartedBtn() {
	driver.findElement(arrayGetStarted).click();
}

public void arraysInPythonLink() {
	driver.findElement(arraysInPython).click();
}

public void arraysUsingListLink() {
	driver.findElement(arraysUsingList).click();
}

public void basicOperationsLink() {
	driver.findElement(basicOperations).click();
}

public void applicationsOfArrayLink() {
	driver.findElement(applicationsOfArray);
}

public void tryEditorBtn() {
	driver.findElement(tryEditor).click();
}

public void practiceQuestionsLink() {
	driver.findElement(practiceQuestions).click();
}

public void searchTheArrayQLink() {
	driver.findElement(searchTheArrayQ).click();
}

public void maxConsecutiveOnesQLink() {
	driver.findElement(maxConsecutiveOnesQ).click();
}

public void findNumbersQLink() {
	driver.findElement(findNumbersQ).click();
}

public void squaresQLink() {
	driver.findElement(squaresQ).click();
}

public void textBox() {
	driver.findElement(textBox).click();
	Actions action = new Actions(driver);
	action.keyDown(Keys.COMMAND).sendKeys("print(x)").perform();
}

public void runBtn() {
	driver.findElement(runBtn).click();
}

public void numpyNinjaTab() {
	driver.findElement(numpyNinjaTab).click();
}

public void dataStructureTab() {
	driver.findElement(dataStrTab).click();
}

public void stackTab() {
	driver.findElement(stackTab).click();
}

public void submitBtn() {
	driver.findElement(submitBtn).click();
}

public void errorMessage() {
	driver.findElement(errorMessage).isDisplayed();
}

public void graphTab() {
	driver.findElement(graphTab).click();
}
public void signOutTab() {
	driver.findElement(signOutTab).click();
}

public void linkedListTab() {
	driver.findElement(linkedListTab).click();
}

public void queueTab() {
	driver.findElement(queueTab).click();
}

public void treeTab() {
	driver.findElement(treeTab).click();
}

public void acceptAlert() {
	Alert alert = driver.switchTo().alert();
	alert.accept();
}

public boolean isAlertPresent() 
{ 
    try 
    { 
        driver.switchTo().alert(); 
        return true; 
    }
    catch (NoAlertPresentException Ex) 
    { 
        return false; 
    } 
}
public void pracQTextBox() {
WebElement edit = driver.findElement(textBox);
Actions action = new Actions(driver);
action.moveToElement(edit, 30, -10).perform();
edit.click();
action.keyDown(Keys.COMMAND).sendKeys("[12, 23, 45, 67, 6, 90] , 12").perform();
driver.findElement(submitBtn).click();
}

public void navigateBack() {
	driver.navigate().back();
}
}
