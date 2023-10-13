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
import pageObjects.RegisterPage;

public class ArraySteps extends BaseClass {	

	

	public HomePage HomePage;
    public RegisterPage RegisterPage;
    public LoginPage LoginPage;
    public ArrayPage ArrayPage;
    public DataStructurePage DataStructurePage;
    public LinkedListPage LinkedListPage;
    public GraphPage GraphPage;

	
    WebDriver driver = Helper.getDriver();


    @When("user clicks array get started button")
	public void user_clicks_array_get_started_button() {

	ArrayPage = new ArrayPage (driver);

	ArrayPage.arrayGetStartedBtn();

	}



	@Then("user navigates to array page")

	public void user_navigates_to_array_page() {

	}



	@When("user clicks arrays in python link")

	public void user_clicks_arrays_in_python_link() {

		ArrayPage.arraysInPythonLink();

	}



	@Then("user should be redirected to arrays in python page")

	public void user_should_be_redirected_to_arrays_in_python_page() {

	}



	@When("user clicks try here button")

	public void user_clicks_try_here_button() {

		ArrayPage.tryEditorBtn();

	}



	@Then("user should be redirected to page with run button")

	public void user_should_be_redirected_to_page_with_run_button() {

	}



	@When("user enters code in the text editor and clicks the run button")

	public void user_enters_code_in_the_text_editor_and_clicks_the_run_button() {

		ArrayPage.textBox();

		ArrayPage.runBtn();

	}



	@Then("the user gets an alert and accepts it")

	public void the_user_gets_an_alert_and_accepts_it() {

		ArrayPage.acceptAlert();

	}



	@When("user clicks the run button")

	public void user_clicks_the_run_button() {

		ArrayPage.runBtn();

	}



	@Then("user should check if there is an alert")

	public void user_should_check_if_there_is_an_alert() {

		ArrayPage.isAlertPresent();

	}



	@When("user clicks arrays using list link")

	public void user_clicks_arrays_using_list_link() {

		ArrayPage.arraysUsingListLink();

	}



	@Then("user should be redirected to arrays using list page")

	public void user_should_be_redirected_to_arrays_using_list_page() {

	}



	@When("user clicks numpyninja tab")

	public void user_clicks_numpyninja_tab() {

		ArrayPage.numpyNinjaTab();

	}



	@Then("user gets redirected to the get started page")

	public void user_gets_redirected_to_the_get_started_page() {

	}



	@When("user clicks basic operations in lists link")

	public void user_clicks_basic_operations_in_lists_link() {

		ArrayPage.basicOperationsLink();

	}



	@Then("user should be redirected to basic operations in lists page")

	public void user_should_be_redirected_to_basic_operations_in_lists_page() {

	}



	@When("user clicks data structures")

	public void user_clicks_data_structures() {

		ArrayPage.dataStructureTab();

	}



	@When("user clicks stack")

	public void user_clicks_stack() {

		ArrayPage.stackTab();

	}



	@Then("user should be redirected to stack page")

	public void user_should_be_redirected_to_stack_page() {

	}



	@When("user clicks practice questions link")

	public void user_clicks_practice_questions_link() {

		ArrayPage.practiceQuestionsLink();

	}



	@Then("user should be redirected to practice questions page")

	public void user_should_be_redirected_to_practice_questions_page() {

	}



	@When("user clicks search the array link")

	public void user_clicks_search_the_array_link() {

		ArrayPage.searchTheArrayQLink();

	}



	@Then("user should be redirected to question page")

	public void user_should_be_redirected_to_question_page() {

	}



	@When("user enters code in the text editor and clicks the submit button")

	public void user_enters_code_in_the_text_editor_and_clicks_the_submit_button() {

		ArrayPage.pracQTextBox();

	}



	@Then("user should see an error message")

	public void user_should_see_an_error_message() {

		ArrayPage.errorMessage();

	}



	@When("user clicks the submit button")

	public void user_clicks_the_submit_button() {

		ArrayPage.submitBtn();

	}



	@When("user clicks max executive ones link")

	public void user_clicks_max_executive_ones_link() {

		ArrayPage.maxConsecutiveOnesQLink();

	}



	@When("user clicks squares of a sorted array link")

	public void user_clicks_squares_of_a_sorted_array_link() {

		ArrayPage.squaresQLink();

	}



	@When("the user clicks the back arrow button")

	public void the_user_clicks_the_back_arrow_button() {

		ArrayPage.navigateBack();

	}



	@When("user clicks graph")

	public void user_clicks_graph() {

		ArrayPage.graphTab();

	}



	@Then("user should be redirected to the graph page")

	public void user_should_be_redirected_to_the_graph_page() {

	}



	@When("the user clicks get started button")

	public void the_user_clicks_get_started_button() {

		ArrayPage.getstarted();

	}



	@Then("the user lands on the homepage")

	public void the_user_lands_on_the_homepage() {

	}



	@When("user clicks linked lists get started button")

	public void user_clicks_linked_lists_get_started_button() {

		ArrayPage.linkedListTab();

	}



	@Then("user lands on the linked lists page")

	public void user_lands_on_the_linked_lists_page() {

	}



	@When("user clicks on applications of array link")

	public void user_clicks_on_applications_of_array_link() {

		ArrayPage.applicationsOfArrayLink();

	}



	@Then("user lands on the applications of array page")

	public void user_lands_on_the_applications_of_array_page() {

	}



	@When("user clicks queue")

	public void user_clicks_queue() {

		ArrayPage.queueTab();

	}



	@Then("user lands on queue page")

	public void user_lands_on_queue_page() {

	}



	@When("user clicks on tree")

	public void user_clicks_on_tree() {

	   ArrayPage.treeTab();

	}



	@Then("user lands on tree page")

	public void user_lands_on_tree_page() {

	}



	@Then("user should be redirected to applications of array page")

	public void user_should_be_redirected_to_applications_of_array_page() {

	}



	@When("the user clicks the sign out link")

	public void the_user_clicks_the_sign_out_link() {

		ArrayPage.signOutTab();

	}



	@Then("user should be logged out and navigated to the homepage")

	public void user_should_be_logged_out_and_navigated_to_the_homepage() {

	}

}

