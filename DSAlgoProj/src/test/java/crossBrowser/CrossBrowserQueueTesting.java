package crossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





 public class CrossBrowserQueueTesting {

	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	
	public void Lunchbrowser(String browser) throws Exception{
		System.out.println("Browser Name is :" + browser);
		 
		 if(browser.equalsIgnoreCase("firefox")){
			   driver = new FirefoxDriver();
			  }
			  else if(browser.equalsIgnoreCase("chrome")){
			    driver = new ChromeDriver();
			  }
			  else if(browser.equalsIgnoreCase("Edge")){
			   driver = new EdgeDriver();
			  }
			  else{
			   throw new Exception("Browser is not correct");
			 }
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 }
	 
	
	@Test(priority =1)
	public void login() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();		 
			 
		 System.out.println("Login Successfully");
		 }
	
	@Test (priority =2)	
	public void QueuePage() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();			  
			  WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
			  		queuegetstartedbtn.click();		 
			 
		 System.out.println("User Should navigate to Queue Page");
		 }
	
	@Test (priority =3)	
	public void pythonQueueImplmentationPage() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();			  
			  WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
			  		queuegetstartedbtn.click();
			  WebElement pythonQueueImplmentation = driver.findElement(By.xpath("//a[contains(text(),'Implementation of Queue in Python')]"));
			  		pythonQueueImplmentation.click();			  		
			 
		 System.out.println("User Should navigate to Python Queue Implementation Page");
		 }
	
	@Test (priority =4)	
	public void tryHerePythonImplmentation() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();			  
			  WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
			  		queuegetstartedbtn.click();
			  WebElement pythonQueueImplmentation = driver.findElement(By.xpath("//a[contains(text(),'Implementation of Queue in Python')]"));
			  		pythonQueueImplmentation.click();		
			  WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
			  		trybtn.click();
			  		
			 
		 System.out.println("User Should navigate to Try Editor Page");
		 }
		
	
	@Test (priority =5)	
	public void ErrormsgOnPythonImplmentation() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  
		 	WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
		 		getstartedbtn.click();
			WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	  			SignInbtn.click();
	  		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	  			userName.sendKeys("SheetalKarotiya");
	  		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  			password.sendKeys("Gill@1234");
	  		WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	  			Loginbtn.click();			  
	  		WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
	  			queuegetstartedbtn.click();
	  		WebElement pythonQueueImplmentation = driver.findElement(By.xpath("//a[contains(text(),'Implementation of Queue in Python')]"));
	  			pythonQueueImplmentation.click();		
	  		WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
	  			trybtn.click();
	  		WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
	  			 input.click();
	  			 Actions action = new Actions(driver);
	  			 action.keyDown(Keys.COMMAND).sendKeys("queue12345").perform();
            WebElement Runbtn = driver.findElement(By.xpath("//button[@type='button']"));
            	  Runbtn.click();
            	  
	  			 Alert alert = driver.switchTo().alert();
	  			 System.out.println(alert.getText());
	  			 Thread.sleep(1000);
	  			 alert.accept(); //click ok button
			  					 
		 System.out.println("User Should get an error massage");
		 }

	@Test (priority =5)	
	public void PrintmsgOnPythonImplmentation() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  
		 	WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
		 		getstartedbtn.click();
			WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	  			SignInbtn.click();
	  		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	  			userName.sendKeys("SheetalKarotiya");
	  		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  			password.sendKeys("Gill@1234");
	  		WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	  			Loginbtn.click();			  
	  		WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
	  			queuegetstartedbtn.click();
	  		WebElement pythonQueueImplmentation = driver.findElement(By.xpath("//a[contains(text(),'Implementation of Queue in Python')]"));
	  			pythonQueueImplmentation.click();		
	  		WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
	  			trybtn.click();
	  		WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
	  			 input.click();
	  			 Actions action = new Actions(driver);
	  			 action.keyDown(Keys.COMMAND).sendKeys("print('helloworld')").perform();
            WebElement Runbtn = driver.findElement(By.xpath("//button[@type='button']"));
            	  Runbtn.click();
			  					 
		 System.out.println("User Should get an print massage");
		 }
	
	
	
	@Test (priority =6)	
	public void DequePage() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();			  
			  WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
			  		queuegetstartedbtn.click();
			  WebElement Dequebtn = driver.findElement(By.xpath("//a[contains(text(),'Implementation using collections.deque')]"));
			  		Dequebtn.click();			  		
			 
		 System.out.println("User Should navigate to Implementation using collections deque Page");
		 }
	
	@Test (priority =7)	
	public void tryHereDeque() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();			  
			  WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
			  		queuegetstartedbtn.click();
			  WebElement Dequebtn = driver.findElement(By.xpath("//a[contains(text(),'Implementation using collections.deque')]"));
			  		Dequebtn.click();		
			  WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
			  		trybtn.click();
			  		
			 
		 System.out.println("User Should navigate to Try Editor Page");
		 }
		
	
	@Test (priority =8)	
	public void ErrormsgOnDeque() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  
		 		WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
		 			getstartedbtn.click();
		 		WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		 			SignInbtn.click();
		 		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	  				userName.sendKeys("SheetalKarotiya");
	  			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  				password.sendKeys("Gill@1234");
	  			WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	  				Loginbtn.click();			  
	  			WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
	  				queuegetstartedbtn.click();
	  			WebElement Dequebtn = driver.findElement(By.xpath("//a[contains(text(),'Implementation using collections.deque')]"));
		  			Dequebtn.click();		
		  		WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
	  				trybtn.click();
	  			WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
	  			 	input.click();
	  			 	Actions action = new Actions(driver);
	  			 	action.keyDown(Keys.COMMAND).sendKeys("queue12345").perform();
	  			WebElement Runbtn = driver.findElement(By.xpath("//button[@type='button']"));
            	    Runbtn.click();
	
            	System.out.println("User Should get an error massage + NameError: name 'queue12345' is not defined on line 1");
	 }   

	
	@Test (priority =9)	
	public void PrintmsgOnDeque() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  
		 	WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
		 		getstartedbtn.click();
			WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	  			SignInbtn.click();
	  		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	  			userName.sendKeys("SheetalKarotiya");
	  		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  			password.sendKeys("Gill@1234");
	  		WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	  			Loginbtn.click();			  
	  		WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
	  			queuegetstartedbtn.click();
	  		WebElement Dequebtn = driver.findElement(By.xpath("//a[contains(text(),'Implementation using collections.deque')]"));
	  			Dequebtn.click();		
	  		WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
	  			trybtn.click();
	  		WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
	  			 input.click();
	  			 Actions action = new Actions(driver);
	  			 action.keyDown(Keys.COMMAND).sendKeys("print('helloworld')").perform();
            WebElement Runbtn = driver.findElement(By.xpath("//button[@type='button']"));
            	  Runbtn.click();
			  					 
		 System.out.println("User Should get an print massage");
		 }

	@Test (priority =10)	
	public void OnImplementationArrayPage() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();			  
			  WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
			  		queuegetstartedbtn.click();
			  WebElement ImplmentationArrayBtn = driver.findElement(By.xpath("//a[contains(text(),'Implementation using array')]"));
			  		ImplmentationArrayBtn.click();			  		
			 
		 System.out.println("User Should navigate to Implementation using Array Page");
		 }
	
	@Test (priority =11)	
	public void tryHereOnImplementationArray() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();			  
			  WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
			  		queuegetstartedbtn.click();
			  WebElement ImplmentationArrayBtn = driver.findElement(By.xpath("//a[contains(text(),'Implementation using array')]"));
			  		ImplmentationArrayBtn.click();		
			  WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
			  		trybtn.click();
			  		
			 
		 System.out.println("User Should navigate to Try Editor Page");
		 }
		
	
	@Test (priority =12)	
	public void ErrormsgOnPrintmsgOnImplementationArray() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  
		 		WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
		 			getstartedbtn.click();
		 		WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		 			SignInbtn.click();
		 		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	  				userName.sendKeys("SheetalKarotiya");
	  			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  				password.sendKeys("Gill@1234");
	  			WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	  				Loginbtn.click();			  
	  			WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
	  				queuegetstartedbtn.click();
	  			WebElement ImplmentationArrayBtn = driver.findElement(By.xpath("//a[contains(text(),'Implementation using array')]"));
			  		ImplmentationArrayBtn.click();		
		  		WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
	  				trybtn.click();
	  			WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
	  			 	input.click();
	  			 	Actions action = new Actions(driver);
	  			 	action.keyDown(Keys.COMMAND).sendKeys("queue12345").perform();
	  			WebElement Runbtn = driver.findElement(By.xpath("//button[@type='button']"));
            	    Runbtn.click();
	
            	System.out.println("User Should get an error massage + NameError: name 'queue12345' is not defined on line 1");
	 }   

	
	@Test (priority =13)	
	public void PrintmsgOnImplementationArray() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  
		 	WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
		 		getstartedbtn.click();
			WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	  			SignInbtn.click();
	  		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	  			userName.sendKeys("SheetalKarotiya");
	  		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  			password.sendKeys("Gill@1234");
	  		WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	  			Loginbtn.click();			  
	  		WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
	  			queuegetstartedbtn.click();
	  		WebElement ImplmentationArrayBtn = driver.findElement(By.xpath("//a[contains(text(),'Implementation using array')]"));
		  		ImplmentationArrayBtn.click();		
	  		WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
	  			trybtn.click();
	  		WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
	  			 input.click();
	  			 Actions action = new Actions(driver);
	  			 action.keyDown(Keys.COMMAND).sendKeys("print('helloworld')").perform();
            WebElement Runbtn = driver.findElement(By.xpath("//button[@type='button']"));
            	  Runbtn.click();
	}	  					 


	@Test (priority =14)	
	public void QueueOperationsPage() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();			  
			  WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
			  		queuegetstartedbtn.click();
			  WebElement QueueOperationBtn = driver.findElement(By.xpath("//a[contains(text(),'Queue Operations')]"));
			  		QueueOperationBtn.click();			  		
			 
		 System.out.println("User Should navigate to Queue Operation Page");
		 }
	
	@Test (priority =15)	
	public void tryHereOnQueueOperations() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();			  
			  WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
			  		queuegetstartedbtn.click();
			  WebElement QueueOperationBtn = driver.findElement(By.xpath("//a[contains(text(),'Queue Operations')]"));
			  		QueueOperationBtn.click();		
			  WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
			  		trybtn.click();
			  		
			 
		 System.out.println("User Should navigate to Try Editor Page");
		 }
		
	
	@Test (priority =16)	
	public void ErrormsgOnQueueOperations() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  
		 		WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
		 			getstartedbtn.click();
		 		WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		 			SignInbtn.click();
		 		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	  				userName.sendKeys("SheetalKarotiya");
	  			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  				password.sendKeys("Gill@1234");
	  			WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	  				Loginbtn.click();			  
	  			WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
	  				queuegetstartedbtn.click();
	  			WebElement QueueOperationBtn = driver.findElement(By.xpath("//a[contains(text(),'Queue Operations')]"));
			  		QueueOperationBtn.click();		
		  		WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
	  				trybtn.click();
	  			WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
	  			 	input.click();
	  			 	Actions action = new Actions(driver);
	  			 	action.keyDown(Keys.COMMAND).sendKeys("queue12345").perform();
	  			WebElement Runbtn = driver.findElement(By.xpath("//button[@type='button']"));
            	    Runbtn.click();
	
            	System.out.println("User Should get an error massage + NameError: name 'queue12345' is not defined on line 1");
	 }   
           		
            		
	@Test (priority =17)	
	public void PrintmsgOnQueueOperations() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  
		 	WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
		 		getstartedbtn.click();
			WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	  			SignInbtn.click();
	  		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	  			userName.sendKeys("SheetalKarotiya");
	  		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  			password.sendKeys("Gill@1234");
	  		WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	  			Loginbtn.click();			  
	  		WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
	  			queuegetstartedbtn.click();
	  		WebElement QueueOperationBtn = driver.findElement(By.xpath("//a[contains(text(),'Queue Operations')]"));
		  		QueueOperationBtn.click();		
	  		WebElement trybtn = driver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
	  			trybtn.click();
	  		WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
	  			 input.click();
	  			 Actions action = new Actions(driver);
	  			 action.keyDown(Keys.COMMAND).sendKeys("print('helloworld')").perform();
            WebElement Runbtn = driver.findElement(By.xpath("//button[@type='button']"));
            	  Runbtn.click();            	             	              	  
            	  
		 System.out.println("User Should get an print massage");
		 }

	@Test (priority =18)	
	public void PracticePage() throws InterruptedException{
		 driver.get("https://dsportalapp.herokuapp.com/");		
		 driver.manage().window().maximize();
			  WebElement getstartedbtn = driver.findElement(By.xpath("//button[text()='Get Started']"));
					getstartedbtn.click();
			  WebElement SignInbtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			  		SignInbtn.click();
			  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
			  		userName.sendKeys("SheetalKarotiya");
			  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			  		password.sendKeys("Gill@1234");
			  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			  		Loginbtn.click();			  
			  WebElement queuegetstartedbtn = driver.findElement(By.xpath("//h5[contains(text(),'Queue')]/../a"));
			  		queuegetstartedbtn.click();		 
			  WebElement practicequestion = driver.findElement(By.xpath("//a[contains(text(),'Practice Questions')]"));
			  	  practicequestion.click();
			  WebElement signout = driver.findElement(By.xpath("//a[contains(text(),'Sign out')]"));
			  	signout.click();
			  	 
			  	  System.out.println("user open the Practice question page ");
			  	  System.out.println("user is signing out ");
			  	 
			  	}
			  	 
	
		 @AfterMethod
		 public void browserQuit() {
			 driver.quit();
		 }
}