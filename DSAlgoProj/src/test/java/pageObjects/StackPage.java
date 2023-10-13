package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepDefinitions.BaseClass;

public class StackPage extends BaseClass {

	WebDriver driver;
	
	public StackPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By Stackgetstarted = By.xpath("//*[@class='card-title'][contains(text(),'Stack')]/../../..//a");
	
	By Operationsinstack = By.xpath("//a[contains(text(),'Operations in Stack')]");
	
	By tryherebtn = By.xpath("//*[contains(text(),'Try here>>>')]");
	
	By Runbtn = By.xpath("//button[@type='button']");
	
	By Implementation = By.xpath("//a[contains(text(),'Implementation')]");
	
	By Applications = By.xpath("//a[contains(text(),'Applications')]");
	
    By PracticeQuestions = By.xpath("//a[contains(text(),'Practice Questions')]");
	
	By Signout = By.xpath("//a[contains(text(),'Sign out')]");
	
	
	
	public void Stackgetstarted() {
		
		driver.findElement(Stackgetstarted);	
	}
	
	public void Operationsinstack() {
		
		driver.findElement(Operationsinstack);
	}
	
	public void tryherebtn() {
		
		driver.findElement(tryherebtn);
	}
	
	public void Print_Message() {
		 
		 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
		 input.click();
		 Actions action = new Actions(driver);
		 action.keyDown(Keys.COMMAND).sendKeys("print('HelloWorld')").perform();
	}
	
	public void Runbtn() {
		
		driver.findElement(Runbtn);
	}
	
	public void Implementation() {
		
		driver.findElement(Implementation);
	}
	
	public void Print_Message1() {
		 
		 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
		 input.click();
		 Actions action = new Actions(driver);
		 action.keyDown(Keys.COMMAND).sendKeys("hello").perform();
	}
	
	public void Alert_Message()throws InterruptedException{
		 
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		alert.accept();//click OK button
	}
	
	public void Applications() {
		
		driver.findElement(Applications);
	}
	
	public void Print_Message2() {
		 
		 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
		 input.click();
		 Actions action = new Actions(driver);
		 action.keyDown(Keys.COMMAND).sendKeys("print('HelloWorld')").perform();
	}
	
	public void PracticeQuestions() {
		
		driver.findElement(PracticeQuestions);
	}

	public void Signout() {
		
		driver.findElement(Signout);
	}
	
}
 