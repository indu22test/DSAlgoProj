package pageObjects;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepDefinitions.BaseClass;

 public class TreePage extends BaseClass{

	WebDriver driver;
	
	public TreePage(WebDriver driver) {
		this.driver=driver;		
	}
	
	
	By treebtn = By.xpath("//h5[contains(text(),'Tree')]/../a");

	By overviewbtn = By.xpath("//a[contains(text(),'Overview of Trees')]");

	By practicebtn = By.xpath("//a[contains(text(),'Practice Questions')]");

	By terminologybtn = By.xpath("//a[contains(text(),'Terminologies')]");

	By trybtn = By.xpath("//a[contains(text(),'Try here>>>')]");

	By typesofTreesbtn = By.xpath("//a[text()='Types of Trees']");

	By Run  = By.xpath("//button[@type='button']");

	By traversalbtn  = By.xpath("//a[text()=\"Tree Traversals\"]");

	By traversalIllustrationsbtn  = By.xpath("//a[text()=\"Traversals-Illustration\"]");

	By binaryTreesbtn = By.xpath("//a[text()=\"Binary Trees\"]");

	By typesOfBinaryTreesbtn = By.xpath("//a[text()=\"Types of Binary Trees\"]");

	By implementationInPython = By.xpath("//a[text()=\"Implementation in Python\"]");

	By binaryTreesTraversalsbtn = By.xpath("//a[text()=\"Binary Tree Traversals\"]");

	By implementationOfBinarybtn   = By.xpath("//a[text()=\"Implementation of Binary Trees\"]");

	By applicationOfBinarybtn = By.xpath("//a[text()=\"Applications of Binary trees\"]");

	By binarySearchTreesbtn = By.xpath("//a[text()=\"Binary Search Trees\"]");

	By implementationOfBSTbtn = By.xpath("//a[text()=\"Implementation Of BST\"]");
	
	By practiceQuestion = By.xpath("//a[text()='Practice Questions']");
	
	
	public void TreeBtn() {
		driver.findElement(treebtn).click();
		}
	
	public void OverViewBtn(){
		driver.findElement(overviewbtn).click();		
	}
			
	public void PracticeBtn(){
		driver.findElement(practicebtn).click();		
	}
		
	public void TerminologyBtn() {
		driver.findElement(terminologybtn).click();
		}
	
	public void TryHereBtn(){
		driver.findElement(trybtn).click();		
	}
			
	public void TypesOfTreesBtn(){
		driver.findElement(typesofTreesbtn).click();		
	}
	public void RunBtn() {
		driver.findElement(Run).click();
		}
	
	public void TraversalBtn(){
		driver.findElement(traversalbtn).click();		
	}
			
	public void TraversalIllustrationsBtn(){
		driver.findElement(traversalIllustrationsbtn).click();		
	}
		
	public void BinaryTreesBtn() {
		driver.findElement(binaryTreesbtn).click();
		}
	
	public void TypesOfBinaryTreesBtn(){
		driver.findElement(typesOfBinaryTreesbtn).click();		
	}
			
	public void ImplementationInPython(){
		driver.findElement(implementationInPython).click();		
	}
	public void BinaryTreesTraversalBtn(){
		driver.findElement(binaryTreesTraversalsbtn).click();		
	}
			
	public void ImplementationOfBinaryBtn(){
		driver.findElement(implementationOfBinarybtn).click();		
	}
		
	public void ApplicationOfBinaryBtn() {
		driver.findElement(applicationOfBinarybtn).click();
		}
	
	public void BinarySearchTreesBtn(){
		driver.findElement(binarySearchTreesbtn).click();		
	}
			
	public void ImplementationOfBSTBtn(){
		driver.findElement(implementationOfBSTbtn).click();		
	}
		
	public void textBoxfield() {

		 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
		 input.click();
		 Actions action = new Actions(driver);
		 action.keyDown(Keys.COMMAND).sendKeys("print('helloworld')").perform();
				
	}
	
	public void practiceQuestionLink() {

		driver.findElement(practiceQuestion).click();
	
   }

	public void Alert_Msg() throws InterruptedException {
		 
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		alert.accept(); //click ok button

		 
		 }

	public void Printmsg(String hello) {
		
		WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
		input.click();
		Actions action = new Actions(driver);
		action.keyDown(Keys.COMMAND).sendKeys(hello).perform();
			
		}


}
	

