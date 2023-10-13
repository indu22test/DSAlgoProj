package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Utilities.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import pageObjects.StackPage;

public class StackPageSteps extends BaseClass{
	
	public HomePage HomePage;
	public RegisterPage RegisterPage;
	public LoginPage LoginPage;
	public StackPage StackPage;
	
	WebDriver driver = Helper.getDriver();

	@When("user hits the get started Button below Stack")
	public void user_hits_the_get_started_button_below_stack() {
	    
		StackPage = new StackPage(driver);
		
		StackPage.Stackgetstarted();
	}

	@Then("User should redirected to Stack page")
	public void user_should_redirected_to_stack_page() {
	    
	}
	
	@Then("user clicks on Operations in Stack")
	public void user_clicks_on_operations_in_stack() {
	 
		StackPage.Operationsinstack();
	}

	@Then("user redirected to Operations in Stack Page")
	public void user_redirected_to_operations_in_stack_page() {
	  
	}

	@Then("user click Try here Button")
	public void user_click_try_here_button() {
	   
		StackPage.tryherebtn();
	}

	@Then("user lands to try editor page")
	public void user_lands_to_try_editor_page() {
	    
	}

	@When("user enters the message Hello World in the box")
	public void user_enters_the_message_hello_world_in_the_box() {
	    
		StackPage.Print_Message();
	}

	@When("user clicks Run Button")
	public void user_clicks_run_button() {
	    
		StackPage.Runbtn();
	}

	@Then("user should be able see the print message")
	public void user_should_be_able_see_the_print_message() {
	       
	}

	@Then("user clicks on Implementation in Stack Page")
	public void user_clicks_on_implementation_in_stack_page() {
	 
		StackPage.Implementation();
	}

	@Then("user redirected to Implementation in Stack Page")
	public void user_redirected_to_implementation_in_stack_page() {
	   
	}

	@Then("use should land to Implementation in Stack Page")
	public void use_should_land_to_implementation_in_stack_page() {
	    
	}

	@When("user enters the message hello in the box")
	public void user_enters_the_message_hello_in_the_box() {
	    
		StackPage.Print_Message1();
	}

	@Then("user gets the SyntaxError")
	public void user_gets_the_syntax_error() throws InterruptedException {
	   
		StackPage.Alert_Message();
	}

	@Then("user click OK Button")
	public void user_click_ok_button() {
	    
	}

	@Then("user clicks on Applications in Stack Page")
	public void user_clicks_on_applications_in_stack_page() {
	 
		StackPage.Applications();
	}

	@Then("user redirected to Applications in Stack Page")
	public void user_redirected_to_applications_in_stack_page() {
	   
	}
	
	@When("user enters the message Priyanka in the box")
	public void user_enters_the_message_priyanka_in_the_box() {
	    
		StackPage.Print_Message2();
	}


	@When("user clicks the Practice Questions button")
	public void user_clicks_the_practice_questions_button() {
	    
		StackPage.PracticeQuestions();
	}

	@Then("user navigated to the blank page of Practice Questions")
	public void user_navigated_to_the_blank_page_of_practice_questions() {
	    
	}

	@When("user hits the sign out link")
	public void user_hits_the_sign_out_link() {
	    
		StackPage.Signout();
	}

	@Then("user should logged out and navigated to the homepage")
	public void user_should_logged_out_and_navigated_to_the_homepage() {
	    
	}


	
}
