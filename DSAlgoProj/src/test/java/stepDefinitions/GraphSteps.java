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

public class GraphSteps extends BaseClass{





		public HomePage HomePage;

	    public 	RegisterPage RegisterPage;

	    public LoginPage LoginPage;

	    public DataStructurePage DataStructurePage;

	    public ArrayPage ArrayPage;

	    public LinkedListPage LinkedListPage;

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







		@When("user clicks the Try Here button")



		public void user_clicks_the_try_here_button() {



		    



			 GraphPage.tryherebtn();



		

		}		 

			 

		



		@Then("user should be redirected to try Editor page")



		public void user_should_be_redirected_to_try_editor_page() {



		    



			



		}

			 @When("user Enters the message {string} in the tryEditor box")

			 public void user_enters_the_message_in_the_try_editor_box(String string) {

				 

				 GraphPage.Print_message1(string);

			     

			 }









		@When("user hits the run button")



		public void user_hits_the_run_button() {



		    



			 GraphPage.runbtn();



		}



	

		



		@Then("user should be able to see the print message")



		public void user_should_be_able_to_see_the_print_message() {



		    



		}







		@When("user clicks the Graph Representations button")



		public void user_clicks_the_graph_representations_button() {







			 GraphPage.Graphrepresentations();



			



		}







		@Then("user navigate to the Graph Representations page")



		public void user_navigate_to_the_graph_representations_page() {



		    



		}





		  



@When("user enters the message {string} in try editor box")

public void user_enters_the_message_in_try_editor_box(String string) {

    

	GraphPage.Print_message2(string);

}







		@Then("user gets the SyntaxError message")



		public void user_gets_the_syntax_error_message() {



		    



			



		}







		@Then("user should click the OK Button")



		public void user_should_click_the_ok_button() throws InterruptedException {



		    

			GraphPage.Alert_Message_click_OK();



			



		}







		@Then("user click the Practice Question tab")



		public void user_click_the_practice_question_tab() {



		   



			 GraphPage.PracticeQuestions();



		}







		@Then("user navigate to the blank page of Practice Questions")



		public void user_navigate_to_the_blank_page_of_practice_questions() {



		    







		}



		

		@Then("User Sign Out")

		public void user_sign_out() {

		   

			

			GraphPage.Sign_Out();

		}



		



		



		



	}

