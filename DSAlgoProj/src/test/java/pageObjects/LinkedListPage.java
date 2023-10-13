package pageObjects;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;



import stepDefinitions.BaseClass;



 public class LinkedListPage extends BaseClass {



	WebDriver driver;

	

	public LinkedListPage(WebDriver driver) {

		

		this.driver = driver;	

	}

	

	By linkedgetstarted = By.xpath("//*[@class='card-title'][contains(text(),'Linked List')]/../../..//a");

	

	By Introduction = By.xpath("//*[contains(text(),'Introduction')]");

	

	By tryherebtn = By.xpath("//*[contains(text(),'Try here>>>')]");

	By Runbtn = By.xpath("//button[@type='button']");

	

	By Creatinglinkedlist = By.xpath("//a[contains(text(),'Creating Linked LIst')]");

	

	By Typesoflinkedlist = By.xpath("//a[contains(text(),'Types of Linked List')]");

	

	By ImplementlinkedlistinPython = By.xpath("//a[contains(text(),'Implement Linked List in Python')]");

	

	By Traversal = By.xpath("//a[contains(text(),'Traversal')]");

	

	By Insertion = By.xpath("//a[contains(text(),'Insertion')]");

	

	By Deletion = By.xpath("//a[contains(text(),'Deletion')]");

	

	By PracticeQuestions = By.xpath("//a[contains(text(),'Practice Questions')]");

	

	By Signout = By.xpath("//a[contains(text(),'Sign out')]");

	 	

	 		public void Linkedgetstarted() {

	 			

	 			driver.findElement(linkedgetstarted).click();

	 			

	 		} 

	 		

	 		public void Introduction() {

	 			

	 			driver.findElement(Introduction).click();

	 			

	 		}

	 		

	 		public void tryherebtn() {

	 			

	 			driver.findElement(tryherebtn).click();

	 			

	 		}

	 		

	 		public void Print_Message() {

				 

				 

				 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));

				 input.click();

				 Actions action = new Actions(driver);

				 action.keyDown(Keys.COMMAND).sendKeys("Apple 2023").perform();

				 

		    }

	 		

	 		public void Runbtn() {

	 			

	 			driver.findElement(Runbtn).click();

	 			

	 		}

	 		

	 		public void Alert_Message() throws InterruptedException{

				 

				Alert alert = driver.switchTo().alert();

				System.out.println(alert.getText());

				Thread.sleep(1000);

				alert.accept();//click OK button

				

			}

	 		

	 		public void Creatinglinkedlist() {

	 			

	 			driver.findElement(Creatinglinkedlist).click();

	 			

	 		}	

	 		

	 		public void Print_Message2() {

				 

				 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));

				 input.click();

				 Actions action = new Actions(driver);

				 action.keyDown(Keys.COMMAND).sendKeys("print('Numpy,Ninja')").perform();

				 

		    }

	 		

	 		public void Typesoflinkedlist() {

	 			

	 			driver.findElement(Typesoflinkedlist).click();

	 			

	 		}

	 		

	 		public void Print_Message3() {

				 

				 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));

				 input.click();

				 Actions action = new Actions(driver);

				 action.keyDown(Keys.COMMAND).sendKeys("SheetalKarotiya").perform();

				 

		    }

	 		

	 		public void Alert_Message1() throws InterruptedException{

				 

				Alert alert = driver.switchTo().alert();

				System.out.println(alert.getText());

				Thread.sleep(1000);

				alert.accept();//click ok button

				

			}

	 		

	 		public void ImplementlinkedlistinPython() {

	 			

	 			driver.findElement(ImplementlinkedlistinPython).click();

	 			

	 		}

	 		

	 		public void Print_Message4() {

				 

				 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));

				 input.click();

				 Actions action = new Actions(driver);

				 action.keyDown(Keys.COMMAND).sendKeys("print('python')").perform();

				 

		    }

	 		

	 		public void Traversal() {

	 			

	 			driver.findElement(Traversal).click();

	 			

	 		}

	 		

	 		public void Print_Message5() {

				 

				 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));

				 input.click();

				 Actions action = new Actions(driver);

				 action.keyDown(Keys.COMMAND).sendKeys("cucucumberBDD1234").perform();

				 

		    }

	 		

	 		public void Alert_Message2() throws InterruptedException{

				 

				Alert alert = driver.switchTo().alert();

				System.out.println(alert.getText());

				Thread.sleep(1000);

				alert.accept();//click ok button

				

			}

	 		

	 		public void Insertion() {

	 			

	 			driver.findElement(Insertion).click();

	 			

	 		}

	 		

	 		public void Print_Message6() {

				 

				 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));

				 input.click();

				 Actions action = new Actions(driver);

				 action.keyDown(Keys.COMMAND).sendKeys("print('Mon,Tue,Wed,Thurs')").perform();

				 

		    }

	 		

	 		public void Deletion() {

	 			

	 			driver.findElement(Deletion).click();

	 			

	 		}

	 		

	 		public void Print_Message7() {

				 

				 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));

				 input.click();

				 Actions action = new Actions(driver);

				 action.keyDown(Keys.COMMAND).sendKeys("Automationtester").perform();

				 

		    }

	 		

	 		public void Alert_Message3() throws InterruptedException{

				 

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

