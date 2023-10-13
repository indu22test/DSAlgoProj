package pageObjects;


import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepDefinitions.BaseClass;




public class GraphPage extends BaseClass {



public WebDriver driver;



public GraphPage(WebDriver driver)  {



this.driver = driver;



}


By Graphgetstarted = By.xpath("//*[@class='card-title'][contains(text(),'Graph')]/../../..//a");

//@test001

By Graph = By.xpath("//a[contains(text(),'Graph') and @class='list-group-item']");

//@test002

By tryherebtn = By.xpath("//*[contains(text(),'Try here>>>')]");

//@test003

By Runbtn = By.xpath("//button[@type='button']");

//@test004

By Graphrepresentations = By.xpath("//a[contains(text(),'Graph Representations')]");

//@test007

By PracticeQuestions = By.xpath("//a[contains(text(),'Practice Questions')]");

 By signout = By.xpath("//a[contains(text(),'Sign out')]");



 public void Graphgetstarted() {



driver.findElement(Graphgetstarted).click();

}


public void Graph() {



driver.findElement(Graph).click();

}



 public void tryherebtn() {



driver.findElement(tryherebtn).click();

}



public void runbtn() {



driver.findElement(Runbtn).click();

}



public void Graphrepresentations() {



driver.findElement(Graphrepresentations).click();

}


public void PracticeQuestions() {



driver.findElement(PracticeQuestions).click();

}


public void Print_message1(String string) {

WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys(string).perform();
}


public void Print_message2(String string) {

WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys(string).perform();
}



public void Alert_Message_click_OK () throws InterruptedException {

 
 Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
Thread.sleep(1000);
alert.accept(); //click ok button

}


public void Sign_Out () {

driver.findElement(signout).click();
}


}
