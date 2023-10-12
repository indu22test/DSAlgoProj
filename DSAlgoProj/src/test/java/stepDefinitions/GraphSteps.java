package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import pageObjects.GraphPage;

import org.openqa.selenium.WebDriver;

import Utilities.Helper;

public class GraphSteps extends BaseClass{
	
	public HomePage HomePage;
	public RegisterPage RegisterPage;
	public LoginPage LoginPage;
	public GraphPage GraphPage;

	WebDriver driver = Helper.getDriver();
	
	@Then("user click to Get Started button below the Graph")
	public void user_click_to_get_started_button_below_the_graph() {
	    
		GraphPage = new GraphPage(driver);
		
		GraphPage.Graphgetstarted();
		
	}

	@When("user clicks the Graph button")
	public void user_clicks_the_graph_button() {
		
		GraphPage.Graph();
	   
	}

	@Then("user should be directed to Graph Page")
	public void user_should_be_directed_to_graph_page() {
	    
	}

	@When("user hits the Try Here button")
	public void user_hits_the_Try_Here_button() {
	    
		GraphPage.tryherebtn();
		
	}

	@Then("user should be redirected to try Editor page")
	public void user_should_be_redirected_to_try_editor_page() {
	    
		
	}

	@When("user Enters the helloworld message in the tryEditor box")
	public void user_enters_the_helloworld_message_in_the_try_editor_box() {
	    
		
	}

	@When("user hits the run button")
	public void user_hits_the_run_button() {
	    
		GraphPage.runbtn();
	}

	@Then("user should be able to see the print message helloworld")
	public void user_should_be_able_to_see_the_print_message_helloworld() {
	    
	}

	@When("user clicks the Graph Representations button")
	public void user_clicks_the_graph_representations_button() {

		GraphPage.Graphrepresentations();
		
	}

	@Then("user navigate to the Graph Representations page")
	public void user_navigate_to_the_graph_representations_page() {
	    
	}

	@Then("user navigate to the tryEditor page")
	public void user_navigate_to_the_try_editor_page() {
	   
	}

	@When("user enters the message in try editor box")
	public void user_enters_the_message_in_try_editor_box() {
	 
		
	}

	@Then("user gets the SyntaxError message")
	public void user_gets_the_syntax_error_message() {
	    
		
	}

	@Then("user should click the OK Button")
	public void user_should_click_the_ok_button() {
	    
		
	}

	@When("user click the Graph tab")
	public void user_click_the_graph_tab() {
	    
		GraphPage.Graph();
		
	}

	@Then("user click the Practice Question tab")
	public void user_click_the_practice_question_tab() {
	   
	   GraphPage.PracticeQuestions();
	   
	}

	@Then("user navigate to the blank page of Practice Questions")
	public void user_navigate_to_the_blank_page_of_practice_questions() {
	    

	}
	
	@When("user clicks the sign out link")
	public void user_clicks_the_sign_out_link() {
		
		GraphPage.Signout();
		
	}

	@Then("user should be logged out and navigated to the homepage")
	public void user_should_be_logged_out_and_navigated_to_the_homepage() {
		
	}
	
	
}
