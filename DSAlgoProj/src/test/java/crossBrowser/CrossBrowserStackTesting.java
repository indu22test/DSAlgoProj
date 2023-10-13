package crossBrowser;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 public class CrossBrowserStackTesting {

WebDriver driver;
@BeforeTest
@Parameters("browser")
public void setup(String browser) throws Exception{

  System.out.println("Browser Name is :" + browser);
     switch(browser.toUpperCase()) {
 case "FIREFOX":
  driver=new FirefoxDriver();
  break;
 case "CHROME":
  driver = new ChromeDriver();
  break;
 case "EDGE":
  driver=new EdgeDriver();
  break;
 default:
  System.out.println("Browser is not correct");
 }

}

  @Test(priority =1)
 public void Login_in() throws InterruptedException {
 
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://dsportalapp.herokuapp.com/");

WebElement getstarted = driver.findElement(By.xpath("//button[text()='Get Started']"));  
getstarted.click();
WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
signin.click();
WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
Username.sendKeys("SheetalKarotiya");  
WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
password.sendKeys("Gill@1234");
WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
login.click();
 
 System.out.println("User login in Dsportal Application");
  }
   

 @Test (priority =2 )
public void  User_Open_The_Stack_Page (){

 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://dsportalapp.herokuapp.com/home");
 
WebElement dropdown = driver.findElement(By.xpath("//div[@class='nav-item dropdown']"));
dropdown.click();
 WebElement stackbutton = driver.findElement(By.xpath("//a[contains(text(),'Stack')]"));
stackbutton.click();  

System.out.println(" user redirected to stack page of dsportal Application");

}

 @Test (priority =3 )
 public void  User_Open_The_Page_Operations_In_Stack (){
 
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   driver.get("https://dsportalapp.herokuapp.com/home");

  WebElement dropdown = driver.findElement(By.xpath("//div[@class='nav-item dropdown']"));
  dropdown.click();
  WebElement stackbutton = driver.findElement(By.xpath("//a[contains(text(),'Stack')]"));
  stackbutton.click();  
  WebElement operationinstack = driver.findElement(By.xpath("//a[contains(text(),'Operations in Stack')]"));
   operationinstack.click();
   
 System.out.println(" user Open the operations-in-stack page of Dsportal Application");
   
 }

  @Test (priority = 4)
 public void Open_the_TryeditorPage_in_Operationpage_of_Stack() throws  InterruptedException {
 
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://dsportalapp.herokuapp.com/home");


  WebElement dropdown = driver.findElement(By.xpath("//div[@class='nav-item dropdown']"));
    dropdown.click();
 WebElement stackbutton = driver.findElement(By.xpath("//a[contains(text(),'Stack')]"));
  stackbutton.click();
   WebElement operationinstack = driver.findElement(By.xpath("//a[contains(text(),'Operations in Stack')]"));
  operationinstack.click();
  WebElement Tryherebutton = driver.findElement(By.xpath("//*[contains(text(),'Try here>>>')]"));
  Tryherebutton.click();
 
 System.out.println("user Open the Try Editor Page in Operations-in-stack of Dsportal Application");
 
 }
 
  @Test (priority =5)
  public void Enters_Message_Run_Test_in_TryEditorBox() throws InterruptedException {
 

 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://dsportalapp.herokuapp.com/home");
 

  WebElement dropdown = driver.findElement(By.xpath("//div[@class='nav-item dropdown']"));
    dropdown.click();
 WebElement stackbutton = driver.findElement(By.xpath("//a[contains(text(),'Stack')]"));
  stackbutton.click();
   WebElement operationinstack = driver.findElement(By.xpath("//a[contains(text(),'Operations in Stack')]"));
  operationinstack.click();  
WebElement Tryherebutton = driver.findElement(By.xpath("//*[contains(text(),'Try here>>>')]"));
 Tryherebutton.click();  
 
 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
input.click();
Actions action = new Actions(driver);
action.keyDown(Keys.COMMAND).sendKeys("print('S,T,A,C,K')").perform();

WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
Runbutton.click();


System.out.println("user enters the print message and test the Try editor box ");


  }
 
@Test (priority = 6)
public void Open_The_ImplementationPage_in_Stack() {

 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://dsportalapp.herokuapp.com/home");
 


  WebElement dropdown = driver.findElement(By.xpath("//div[@class='nav-item dropdown']"));
    dropdown.click();
 WebElement stackbutton = driver.findElement(By.xpath("//a[contains(text(),'Stack')]"));
  stackbutton.click();
   WebElement operationinstack = driver.findElement(By.xpath("//a[contains(text(),'Operations in Stack')]"));
  operationinstack.click();  

WebElement implementation = driver.findElement(By.xpath("//a[contains(text(),'Implementation')]"));
implementation.click();

System.out.println("User Land on implementation page in stack of dsPortal application");

}
 

  @Test (priority = 7)
 
  public void Run_Test_In_TryEditor_of_Implementationpage_in_stack() throws InterruptedException{
 
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  driver.get("https://dsportalapp.herokuapp.com/home");
 
  WebElement dropdown = driver.findElement(By.xpath("//div[@class='nav-item dropdown']"));
  dropdown.click();
  WebElement stackbutton = driver.findElement(By.xpath("//a[contains(text(),'Stack')]"));
  stackbutton.click();
  WebElement implementation =driver.findElement(By.xpath("//a[contains(text(),'Implementation')]"));
  implementation.click();
  WebElement Tryherebutton = driver.findElement(By.xpath("//*[contains(text(),'Try here>>>')]"));
  Tryherebutton.click();
 
  WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
  input.click(); Actions action = new Actions(driver);
  action.keyDown(Keys.COMMAND).sendKeys("print('CROSS BROWSER TESTING')").perform();
 
  WebElement Runbutton = driver.findElement(By.xpath("//button[@type='button']"));
  Runbutton.click();
 
  System.out.println("User run Test and print message in try-editor box");
 
  }
 
    @Test (priority =8 )
 public void Open_The_Applicationspage_In_Stack() {
 
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://dsportalapp.herokuapp.com/home");
 
 WebElement dropdown = driver.findElement(By.xpath("//div[@class='nav-item dropdown']"));
 dropdown.click();
 WebElement stackbutton = driver.findElement(By.xpath("//a[contains(text(),'Stack')]"));
 stackbutton.click();
 WebElement implementation = driver.findElement(By.xpath("//a[contains(text(),'Implementation')]"));
 implementation.click();
 WebElement applicationbutton = driver.findElement(By.xpath("//a[contains(text(),'Applications')]"));
 applicationbutton.click();
 
 System.out.println("user Open the Applications Page in Stack of Dsportal Application");
 
 }
   
 
@Test (priority = 9)
 public void Run_Test_In_TryEditor_of_Applicationspage_in_stack() throws InterruptedException {

driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://dsportalapp.herokuapp.com/home");

 
 WebElement dropdown = driver.findElement(By.xpath("//div[@class='nav-item dropdown']"));
 dropdown.click();
 WebElement stackbutton = driver.findElement(By.xpath("//a[contains(text(),'Stack')]"));
 stackbutton.click();
 WebElement implementation = driver.findElement(By.xpath("//a[contains(text(),'Implementation')]"));
 implementation.click();
 WebElement applicationbutton = driver.findElement(By.xpath("//a[contains(text(),'Applications')]"));
 applicationbutton.click();
 
 WebElement Tryherebutton = driver.findElement(By.xpath("//*[contains(text(),'Try here>>>')]"));
 Tryherebutton.click();
 
 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click(); Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys("print'sheetal,indu,priyanka,vee,soumya'").perform();

 WebElement Runbutton =  driver.findElement(By.xpath("//button[@type='button']"));
 Runbutton.click();

System.out.println("user Run the test in the Try=Editor page ");



}

@Test (priority = 10)
public void Open_Practice_Questions_Page_in_stack() {

  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  driver.get("https://dsportalapp.herokuapp.com/home");
 
  WebElement dropdown = driver.findElement(By.xpath("//div[@class='nav-item dropdown']"));
  dropdown.click();
  WebElement stackbutton = driver.findElement(By.xpath("//a[contains(text(),'Stack')]"));
  stackbutton.click();
  WebElement implementation = driver.findElement(By.xpath("//a[contains(text(),'Implementation')]"));
  implementation.click();
  WebElement applicationbutton = driver.findElement(By.xpath("//a[contains(text(),'Applications')]"));
  applicationbutton.click();
  WebElement practicequestion = driver.findElement(By.xpath("//a[contains(text(),'Practice Questions')]"));
  practicequestion.click();
  WebElement signout = driver.findElement(By.xpath("//a[contains(text(),'Sign out')]"));
signout.click();
 
  System.out.println("user open the Practice question page of DSPortal Application");
  System.out.println("user is signing out ");
 
}
 
 
   @AfterTest
public void browserQuit() {
 driver.quit();
}
}
