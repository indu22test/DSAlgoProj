package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepDefinitions.BaseClass;



public class QueuePage extends BaseClass{


public WebDriver driver;



public QueuePage(WebDriver driver)  {


this.driver = driver;

}

 By dropdown = By.xpath("//div[@class='nav-item dropdown']");
 
 By queuebutton = By.xpath("//a[contains(text(),'Queue')]");
 
 By pythonQueueImplmentation = By.xpath("//a[contains(text(),'Implementation of Queue in Python')]");
 
 By tryherebtn = By.xpath("//a[contains(text(),'Try here>>>')]");
 
 By runbtn = By.xpath("//button[@type='button']");
 
By dequeImplmentation = By.xpath("//a[contains(text(),'Implementation using collections.deque')]");

 By arrayImplmentation = By.xpath("//a[contains(text(),'Implementation using array')]");
 
 By queueOperation = By.xpath("//a[contains(text(),'Queue Operations')]");

 By practicequestnbtn = By.xpath("//a[contains(text(),'Practice Questions')]");
 
 By signout = By.xpath("//a[contains(text(),'Sign out')]");

 
 public void dropdown ()
 {

driver.findElement(dropdown).click();

 }

public void queuebutton() {


driver.findElement(queuebutton).click();
}


public void pythonqueueimplementation() {

driver.findElement(pythonQueueImplmentation).click();
}

public void tryhere() {

driver.findElement(tryherebtn).click();
}

public void runbtn () {

driver.findElement(runbtn).click();
}

public void dequeueimplementation() {

driver.findElement(dequeImplmentation).click();
}

public void arrayimplementation() {

driver.findElement(arrayImplmentation).click();
}


public void queueoperation() {

driver.findElement(queueOperation).click();
}

public void practicequestion() {

driver.findElement(practicequestnbtn).click();
}

public void Print_Message(String string) {

WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys(string).perform();
}


public void Print_Message1(String queue12345) {

WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys(queue12345).perform();

}





public void Alert_Message() throws InterruptedException {

Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
Thread.sleep(1000);
alert.accept(); //click ok button
}

public void Sign_Out () {

driver.findElement(signout).click();
}






}
