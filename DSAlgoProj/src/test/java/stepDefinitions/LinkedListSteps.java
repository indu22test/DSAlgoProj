package stepDefinitions;



import org.openqa.selenium.WebDriver;
import Utilities.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;

import pageObjects.HomePage;

import pageObjects.LoginPage;

import pageObjects.RegisterPage;



 public class LinkedListSteps extends BaseClass{
	

	public HomePage HomePage;

	public RegisterPage RegisterPage;

	public LoginPage LoginPage;

	public LinkedListPage LinkedListPage;

	

	WebDriver driver = Helper.getDriver();

	



	@Then("user click to Get Started button below Linked List")

	public void user_click_to_get_started_button_below_linked_list() {

	    

		LinkedListPage = new LinkedListPage(driver);

		

		LinkedListPage.Linkedgetstarted();

	}



	@When("The user clicks Introduction button of the LinkedList")

	public void the_user_clicks_introduction_button_of_the_linkedlist() {

	    

		LinkedListPage.Introduction();

	}



	@Then("The user should be directed to Introduction of Linked List Page")

	public void the_user_should_be_directed_to_introduction_of_linked_list_page() {

	    

	}



	@When("The user clicks try Here button")

	public void the_user_clicks_try_here_button() {

	    

		LinkedListPage.tryherebtn();

	}



	@Then("The user should be redirected to try Editor page")

	public void the_user_should_be_redirected_to_try_editor_page() {

	    

	}



	@When("user enters message Apple 2023 in the try editor box")

	public void user_enters_message_Apple_2023_in_the_try_editor_box() {

	    	

	}



	@When("user clicks run Button")

	public void user_clicks_run_button() {

	    

		LinkedListPage.Runbtn();

	}



	@Then("user should get an Alert message of Syntx Error")

	public void user_should_get_an_alert_message_of_syntx_error() {

	    

	}



	@Then("user clicks the OK Button")

	public void user_clicks_the_ok_button() {

	    

	}



	@When("user navigates to Created Linked List Button")

	public void user_navigates_to_created_linked_list_button() {

	 

		LinkedListPage.Creatinglinkedlist();

	}



	@Then("user should land to Created Linked List Page")

	public void user_should_land_to_created_linked_list_page() {

	    

	}



	@When("user clicks try here Button")

	public void user_clicks_try_here_button() {

	   

		LinkedListPage.tryherebtn();

	}



	@Then("user should land to tryEditor page")

	public void user_should_land_to_try_editor_page() {

	   

	}



	@When("user enters message print Numpy Ninja in the try editor box")

	public void user_enters_message_print_numpy_ninja_in_the_try_editor_box() {

	   

	}



	@When("user clicks the Run Button")

	public void user_clicks_the_run_button() {

	    

		LinkedListPage.Runbtn();

	}



	@Then("user should see the print message")

	public void user_should_see_the_print_message() {

	    

	}



	@When("user navigates to Types of Linked List Button")

	public void user_navigates_to_types_of_linked_list_button() {

	    

		LinkedListPage.Typesoflinkedlist();

	}



	@Then("user redirected to Types of Linked List Page")

	public void user_redirected_to_types_of_linked_list_page() {

	    

	}



	@When("user clicks the try here Button")

	public void user_clicks_the_try_here_button() {

	    

		LinkedListPage.tryherebtn();

	}



	@Then("user redirected to tryEditor page")

	public void user_redirected_to_try_editor_page() {

	    

	}



	@When("user enter the message SheetalKarotiya in the editor box")

	public void user_enter_the_message_SheetalKarotiya_in_the_editor_box() {

	   

	}



	@When("user navigate the Run Button")

	public void user_navigate_the_run_button() {

	    

		LinkedListPage.Runbtn();

	}



	@Then("user should gets an alert message")

	public void user_should_gets_an_alert_message() {

	    

	}

	

	@Then("user should click ok Button")

	public void user_should_click_ok_button() {

	   

	}

	

	@When("user click to Implement Linked List in Python Button")

	public void user_click_to_implement_linked_list_in_python_button() {

	    

		LinkedListPage.ImplementlinkedlistinPython();

	}



	@Then("user navigates to Implement Linked List in Python page")

	public void user_navigates_to_implement_linked_list_in_python_page() {

	    

	}



	@When("user navigates to try here Button")

	public void user_navigates_to_try_here_button() {

	    

		LinkedListPage.tryherebtn();

	}



	@Then("user navigate to tryEditor Page")

	public void user_navigate_to_try_editor_page() {

	    

	}



	@When("user enters message print python in the try editor box")

	public void user_enters_message_print_python_in_the_try_editor_box() {

	    

	}



	@Then("user enters the run button")

	public void user_enters_the_run_button() {

	    

		LinkedListPage.Runbtn();

	}



	@Then("user gets the print message in tryEditor box")

	public void user_gets_the_print_message_in_try_editor_box() {

	    

	}



	@When("user click to Traversal Button")

	public void user_click_to_traversal_button() {

	    

		LinkedListPage.Traversal();

	}



	@Then("user redirected to Traversal Page")

	public void user_redirected_to_traversal_page() {

	    

	}



	@When("user click to TryHere button")

	public void user_click_to_try_here_button() {

	    

		LinkedListPage.tryherebtn();

	}



	@Then("user should land on TryEditor page")

	public void user_should_land_on_try_editor_page() {

	    

	}



	@When("user enters message cucucumberBDD1234 in the try editor box")

	public void user_Enters_the_message_cucucumberBDD1234_in_the_box() {

	   

	}



	@When("user navigate to Run Button")

	public void user_navigate_to_run_button() {

	   

		LinkedListPage.Runbtn();

	}



	@Then("user should see the Attribute Error message")

	public void user_should_see_the_attribute_error_message() {

	    

	}



	@When("user click to Insertion Button")

	public void user_click_to_insertion_button() {

	    

		LinkedListPage.Insertion();

	}



	@Then("user navigates to Insertion page")

	public void user_navigates_to_insertion_page() {

	    

	}



	@When("user clicks to tryhere button")

	public void user_clicks_to_tryhere_button() {

	    

		LinkedListPage.tryherebtn();

	}



	@Then("user Redirected to TryEditor page")

	public void user_Redirected_to_try_editor_page() {

	    

	}



	@When("user enters message print Mon Tue Wed Thurs in the try editor box")

	public void user_enters_message_print_Mon_Tue_Wed_Thurs_in_the_try_editor_box() {

	    

	}



	@Then("user Enters the Run Button")

	public void user_Enters_the_run_button() {

	   

		LinkedListPage.Runbtn();

	}



	@Then("user should see the print message in the box")

	public void user_should_see_the_print_message_in_the_box() {

	    

	}



	@When("user clicks to Deletion Button")

	public void user_clicks_to_deletion_button() {

	    

		LinkedListPage.Deletion();

	}



	@Then("user redirected to Deletion page")

	public void user_redirected_to_deletion_page() {



	}



	@When("user click the try here Button")

	public void user_click_the_try_here_button() {



		LinkedListPage.tryherebtn();

	}



	@Then("user land on TryEditor page")

	public void user_land_on_try_editor_page() {



	}



	@When("user enters message Automationtester in the try editor box")

	public void user_Enters_message_Automationtester_in_the_try_editor_box() {



	}



	@When("user hits the Run Button")

	public void user_hits_the_Run_button() {



		LinkedListPage.Runbtn();

	}



	@Then("user get the TypeError message")

	public void user_get_the_type_error_message() {



	}





	@When("The user clicks Introduction button of LinkedList")

	public void the_user_clicks_introduction_button_of_linkedlist() {



		LinkedListPage.Introduction();

	}



	@Then("user clicks the Practice Question button")

	public void user_clicks_the_practice_question_button() {



		LinkedListPage.PracticeQuestions();

	}



	@Then("user redirected to the blank page of Practice Questions")

	public void user_redirected_to_the_blank_page_of_practice_questions() {



	}



	@When("user click the sign out link")

	public void user_click_the_sign_out_link() {

		

		LinkedListPage.Signout();

		

	}



	@Then("user logged out and navigated to the homepage")

	public void user_logged_out_and_navigated_to_the_homepage() {

		

	}

}