package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepDefinitions.BaseClass;

public class DataStructurePage  extends BaseClass{

WebDriver driver;

public DataStructurePage( WebDriver driver) {

this.driver = driver;
}


By datastructurebtn = By.xpath("//*[contains(text(),'Data Structures-Introduction')]/../..//a");

By timecomplexitybtn = By.xpath("//a[contains(text(),'Time Complexity')]");

By practicequestnbtn = By.xpath("//a[contains(text(),'Practice Questions')]");

By tryherebtn = By.xpath("//a[contains(text(),'Try here>>>')]");

By Run   = By.xpath("//button[@type='button']");


public void DataStructurebtn() {

driver.findElement(datastructurebtn).click();

}

public void timecomplexity () {

driver.findElement(timecomplexitybtn).click();
}



public void practicequestion() {

driver.findElement(practicequestnbtn).click();

}


public void tryhere() {

driver.findElement(tryherebtn).click();
}

public void run() {

driver.findElement(Run).click();

}

 public void Print_Message() {
 
 
 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys("print('helloworld')").perform();
 
   }
 
 public void Alert_Message() throws InterruptedException {
 
 Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
Thread.sleep(1000);
alert.accept(); //click ok button

 
 }

 public void Print_Message2() {
 
 
 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys("helloworld").perform();
 
   }

 
 

}
