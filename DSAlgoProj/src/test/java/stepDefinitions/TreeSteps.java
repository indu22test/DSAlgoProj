package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Utilities.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import pageObjects.TreePage;

 public class TreeSteps extends BaseClass{
	public HomePage HomePage;
    public RegisterPage RegisterPage;
    public LoginPage LoginPage;
    public TreePage TreePage;
    
	
	WebDriver driver = Helper.getDriver();
	
	      @When("user clicks Tree get started button")
	      public void user_clicks_tree_get_started_button() {
		    TreePage = new TreePage (driver);
	        TreePage.TreeBtn();
	      }

	      @When("user navigates to Tree page")
	      public void user_navigates_to_tree_page() {
       
	       }

	      @When("user clicks overview of Trees link")
	      public void user_clicks_overview_of_trees_link() {
		    TreePage.OverViewBtn();
	    
		  }

		  @Then("user should be redirected to overview of Tree page")
		  public void user_should_be_redirected_to_overview_of_tree_page() {	    
	    
		  }

		  @When("user clicks on the try here button")
		  public void user_clicks_on_the_try_here_button() {
			TreePage.TryHereBtn();

		  }
		  @Then("user should be navigate to the try editor page")
		  public void user_should_be_navigate_to_the_try_editor_page() {
	 	   
	      }
	
	      @When("user enters the Print Message {string} in the Editor box")
	      public void user_enters_the_print_message_in_the_editor_box(String string) {
	        TreePage.textBoxfield();
	    
		  }
	
	      @When("user clicks the run Button") 
  	      public void user_clicks_the_run_button() {
		    TreePage.RunBtn();
	  
	      }
	       
	      @When("user enters the printmsg {string} in Editor box")
	      public void user_enters_the_printmsg_in_editor_box(String hello) {
		  	TreePage.Printmsg(hello);
	      }	
	 
	      @Then("user should able to see the print message")
	      public void user_should_able_to_see_the_print_message() {
	     
	 	  }
				  	
	      @When("user clicks the practice questions button under overview of Tree page")
		  public void user_clicks_the_practice_questions_button_under_overview_of_tree_page() {
		      TreePage.practiceQuestionLink();
		  }
	      
		  @Then("User should land on the blank practice page under overview of Tree page")
		  public void user_should_land_on_the_blank_practice_page_under_overview_of_tree_page() {
		      
		  }					  
		  
		  @Then("user get the SyntaxError message")
		  public void user_get_the_SyntaxError_message() {		   
		     
		  }
		  
		  @Then("user should clicks the OK Button")
		  public void user_should_clicks_the_OK_Button() throws InterruptedException {
		  TreePage.Alert_Msg();
		     
		  }
			
		  @When("user clicks Terminologies")
		  public void user_clicks_terminologies() {
		      TreePage.TerminologyBtn();
		  }
		  
		  @Then("user should be redirected to Terminologies page")
		  public void user_should_be_redirected_to_terminologies_page() {
		      
		  }

		  @When("user clicks Types of Trees")
		  public void user_clicks_types_of_trees() {
			  TreePage.TypesOfTreesBtn();
			  
		  }
		  @Then("user should be redirected to Types of Trees page")
		  public void user_should_be_redirected_to_types_of_trees_page() {
   
		  }

		  @When("user clicks Tree Traversals")
		  public void user_clicks_tree_traversals() {
		      TreePage.TraversalBtn();
		      
		  }
		  
          @When("user clicks Traversals Illustration")
          public void user_clicks_traversals_illustration() {
        	  TreePage.TraversalIllustrationsBtn();
        	  
          }
          
          @Then("user should be redirected to Traversals Illustration page")
          public void user_should_be_redirected_to_traversals_illustration_page() {
    
          }

		  
		  @Then("user should be redirected to Tree Traversals page")
		  public void user_should_be_redirected_to_tree_traversals_page() {
		      
		  }
		  
		  @When("user clicks Binary Trees")
		  public void user_clicks_binary_trees() {
		      TreePage.BinaryTreesBtn();
		  }
		  
		  @Then("user should be redirected to Binary Trees page")
		  public void user_should_be_redirected_to_binary_trees_page() {
		      
		  }
		  
		  @When("user clicks Types of Binary")
		  public void user_clicks_types_of_binary() {
		      TreePage.TypesOfBinaryTreesBtn();
		      
		  }
		  
		  @Then("user should be redirected to Types of Binary page")
		  public void user_should_be_redirected_to_types_of_binary_page() {
		      
		  }
		  @When("user clicks Implementation in Python")
		  public void user_clicks_implementation_in_python() {
		      TreePage.ImplementationInPython();
		  }
		  @Then("user should be redirected to Implementation in Python page")
		  public void user_should_be_redirected_to_implementation_in_python_page() {
		      
		  }

		  @When("user clicks Binary Tree Traversals")
		  public void user_clicks_binary_tree_traversals() {
		      TreePage.BinaryTreesTraversalBtn();
		      
		  }
		  @Then("user should be redirected to Binary Tree Traversals page")
		  public void user_should_be_redirected_to_binary_tree_traversals_page() {
		      
		  }
		  
		  @When("user clicks Implementation of Binary Trees")
		  public void user_clicks_implementation_of_binary_trees() {
		      TreePage.ImplementationOfBinaryBtn();
		  }
		  @Then("user should be redirected to Implementation of Binary Trees page")
		  public void user_should_be_redirected_to_implementation_of_binary_trees_page() {
		      
		  }

		  @When("user clicks Applications of Binary trees")
		  public void user_clicks_applications_of_binary_trees() {
		      TreePage.ApplicationOfBinaryBtn();
		  }
		  
		  @Then("user should be redirected to Applications of Binary trees page")
		  public void user_should_be_redirected_to_applications_of_binary_trees_page() {
		      
		  }

		  @When("user clicks Binary Search Trees")
		  public void user_clicks_binary_search_trees() {
			  TreePage.BinarySearchTreesBtn();
		  }
		  
		  @Then("user should be redirected to Binary Search Trees page")
		  public void user_should_be_redirected_to_binary_search_trees_page() {
		      
		  }
		  
		  @When("user clicks Implementation Of BST")
		  public void user_clicks_implementation_of_bst() {
		      TreePage.ImplementationOfBSTBtn();
		  }
		  
		  @Then("user should be redirected to Implementation Of BST page")
		  public void user_should_be_redirected_to_implementation_of_bst_page() {
		      
		  }



		}

		  
	

