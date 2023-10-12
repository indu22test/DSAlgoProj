package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepDefinitions.BaseClass;

public class GraphPage extends BaseClass {

	
	WebDriver driver;
	
	public GraphPage(WebDriver driver)  {
		
		this.driver = driver;
	    }
	
	
	By Graphgetstarted = By.xpath("//*[@class='card-title'][contains(text(),'Graph')]/../../..//a");
	
	By Graph = By.xpath("//a[contains(text(),'Graph') and @class='list-group-item']");
	
	By tryherebtn = By.xpath("//*[contains(text(),'Try here>>>')]");
	
	By Runbtn = By.xpath("//button[@type='button']");
	
	By Graphrepresentations = By.xpath("//a[contains(text(),'Graph Representations')]");
	
	By PracticeQuestions = By.xpath("//a[contains(text(),'Practice Questions')]");
			
	By Signout = By.xpath("//a[contains(text(),'Sign out')]");
	
	
	   public void Graphgetstarted() {
			
			driver.findElement(Graphgetstarted).click();
		}
	
		public void Graph() {
			
			driver.findElement(Graph).click();
		}
		
		public void tryherebtn() {
			
			driver.findElement(tryherebtn).click();
		}
		
		 public void Print_Message() {
			 
			 
			 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
			 input.click();
			 Actions action = new Actions(driver);
			 action.keyDown(Keys.COMMAND).sendKeys("print('helloworld')").perform();
			 
			   }
		 
		public void runbtn() {
			
			driver.findElement(Runbtn).click();
		}
		
		public void Graphrepresentations() {
			
			driver.findElement(Graphrepresentations).click();
		}
		
		 public void Alert_Message() throws InterruptedException{
			 
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			alert.accept();//click ok button
			
		}
		 
		public void PracticeQuestions() {
			
			driver.findElement(PracticeQuestions).click();
		}
		
		public void Signout() {
			
			driver.findElement(Signout).click();
		}
}
