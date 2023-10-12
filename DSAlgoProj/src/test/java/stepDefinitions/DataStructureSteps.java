package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Utilities.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

public class DataStructureSteps extends BaseClass{

public HomePage HomePage;
    public RegisterPage RegisterPage;
    public LoginPage LoginPage;
    public DataStructurePage DataStructurePage;
   
    WebDriver driver = Helper.getDriver();
   
   

@When("user click to Get Started button below Data Structure")
public void user_click_to_get_started_button_below_data_structure() {
   

DataStructurePage = new DataStructurePage (driver);

DataStructurePage.DataStructurebtn();


}
@Then("User should land on DataStructures-Introducti-on-Introduction page")
public void user_should_land_on_data_structures_introducti_on_introduction_page() {
 

}

@When("user click to time complexity button")
public void user_click_to_time_complexity_button() {

DataStructurePage.timecomplexity();

}
@Then("user should redirected to time complexity page")
public void user_should_redirected_to_time_complexity_page() {
 

}

@When("user navigate to practice questions button")
public void user_navigate_to_practice_questions_button() {

DataStructurePage.practicequestion();

}
@Then("User should land on the blank practice page")
public void user_should_land_on_the_blank_practice_page() {
 

}


@When("user click the try here button")
public void user_click_the_try_here_button() {

DataStructurePage.tryhere();
   
}
@Then("user should be redirected to the try editor page")
public void user_should_be_redirected_to_the_try_editor_page() {
 
   
}

@When("user enters the Print Message HelloWorld in the Editor box")
public void user_enters_the_print_message_HelloWorld_in_the_editor_box() {
 
DataStructurePage.Print_Message();

}
@When("user click the run Button")
public void user_click_the_run_button() {
 
DataStructurePage.run();
   
}
@Then("user able to see the print message hello world")
public void user_able_to_see_the_print_message_hello_world() {
 
   
}

@When("user enters the Print Message in Editor box")
public void user_enters_the_print_message_in_editor_box() {
 
DataStructurePage.Print_Message2();
   
}
@Then("user able to see the Alert message of Syntx Error")
public void user_able_to_see_the_alert_message_of_syntx_error() {


 
   
}
@Then("user clicks ok Button")
public void user_clicks_ok_button() throws InterruptedException {

DataStructurePage.Alert_Message();
   
}




}

