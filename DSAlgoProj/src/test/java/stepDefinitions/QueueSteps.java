package stepDefinitions;


import org.openqa.selenium.WebDriver;

import Utilities.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.DataStructurePage;
import pageObjects.GraphPage;
import pageObjects.HomePage;
import pageObjects.LinkedListPage;
import pageObjects.LoginPage;
import pageObjects.QueuePage;
import pageObjects.RegisterPage;



public class QueueSteps extends BaseClass{

public HomePage HomePage;
    public RegisterPage RegisterPage;
    public LoginPage LoginPage;
    public DataStructurePage DataStructurePage;
    public ArrayPage ArrayPage;
    public LinkedListPage LinkedListPage;
    public GraphPage GraphPage;
    public QueuePage QueuePage;
   
   
    WebDriver driver = Helper.getDriver();




@When("user navigate to dropdown of data-structures")
public void user_navigate_to_dropdown_of_data_structures() {
   
       QueuePage = new QueuePage(driver);
       QueuePage.dropdown();

 
}
@When("user click the queue button")
public void user_click_the_queue_button() {
   
QueuePage.queuebutton();
 
}
@Then("User should redirected to Queue page")
public void user_should_redirected_to_queue_page() {
   
 
}

@When("user click on Implementation of Queue in Python link")
public void user_click_on_implementation_of_queue_in_python_link() {
   
QueuePage.pythonqueueimplementation();
 
}
@Then("user should land on Implementation of Queue in Python page")
public void user_should_land_on_implementation_of_queue_in_python_page() {
   
 
}

@When("user click the Try here button")
public void user_click_the_try_here_button() {
   
QueuePage.tryhere();
}


@When("user enters the {string} in the test page")
public void user_enters_the_in_the_test_page(String string) {
   
QueuePage.Print_Message(string);


}

@When("user clicks on Run button")
public void user_clicks_on_run_button() {
   
   
QueuePage.runbtn();

}
@Then("user should get an AlertMessage")
public void user_should_get_an_alert_message() {
   
   
}
@Then("user clicks ok button")
public void user_clicks_ok_button() throws InterruptedException {
   
QueuePage.Alert_Message();

}

@Then("user click on Implementation using collections.deque")
public void user_click_on_implementation_using_collections_deque() {
   
   
QueuePage.dequeueimplementation();
}
@Then("user should land on Implementation using collections.deque Page")
public void user_should_land_on_implementation_using_collections_deque_page() {
   
   
}


@Then("user should land on Implementation using collections.deque")
public void user_should_land_on_implementation_using_collections_deque() {
   
   
}

@When("user enters the {string} in the Editor")
public void user_enters_the_in_the_editor(String queue12345) {
   
QueuePage.Print_Message1(queue12345);
}
@Then("user should see print message in the try editor")
public void user_should_see_print_message_in_the_try_editor() {
   
   
}


@When("user click on Implementation using Array")
public void user_click_on_implementation_using_array() {
   
   

}
@Then("user should land on Implementation using Array")
public void user_should_land_on_implementation_using_array() {
   
QueuePage.arrayimplementation();
}

@When("user clicks on Queue Operations")
public void user_clicks_on_queue_operations() {
   
QueuePage.queueoperation();
}
@Then("user should land on Queue Operations")
public void user_should_land_on_queue_operations() {
   
   
}
@When("user clicks to the Practice Questions Button")
public void user_clicks_to_the_practice_questions_button() {
   
QueuePage.practicequestion();


}


@Then("user redirected to the practice questions page")
public void user_redirected_to_the_practice_questions_page() {
   
   
}
@Then("user will Sign out")
public void user_will_sign_out() {
   
   
}


























}

