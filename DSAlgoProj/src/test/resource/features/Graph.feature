@Graph
Feature: Graph

  Background: 
    Given user Launch the Browser
    When user open the Homepage of dsportal and click get started button
    When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password
    And user click the login button
    Then user should successfully login into Homepage

  @testcase56
  Scenario: Open the Graph page
    When user click to Get Started button below the Graph
    When user clicks the Graph button
    Then user should be directed to Graph Page

  @testcase57
  Scenario: Open the try Editor page in Graph page
    When user click to Get Started button below the Graph
    When user clicks the Graph button
    When user clicks the Try Here button
    Then user should be redirected to try Editor page
	
	@testcase58
  Scenario: Print the message in the tryEditor Box
    When user click to Get Started button below the Graph
    When user clicks the Graph button
    When user clicks the Try Here button
    When user Enters the message "print('graph')" in the tryEditor box
    When user hits the run button
    Then user should be able to see the print message

  @testcase59
  Scenario: Open the Graph representation page
    When user click to Get Started button below the Graph
    When user clicks the Graph Representations button
    Then user navigate to the Graph Representations page

  @testcase60
  Scenario: Open the try Editor page in Graph Representations
    When user click to Get Started button below the Graph
    When user clicks the Graph Representations button
    When user clicks the Try Here button
    Then user should be redirected to try Editor page

  @testcase61
  Scenario: User gets the syntaxError message
    When user click to Get Started button below the Graph
    When user clicks the Graph Representations button
    When user clicks the Try Here button
    When user enters the message "graph" in try editor box
    When user hits the run button
    Then user gets the SyntaxError message
    Then user should click the OK Button

  @testcase62
  Scenario: Open the Practice Questions Page
    When user click to Get Started button below the Graph
    When user clicks the Graph button
    Then user click the Practice Question tab
    Then user navigate to the blank page of Practice Questions
    And User Sign Out
