@Graph
Feature: Graph

  Background: user Registered and logged In into HomePage
   Given user Launch the Browser
    When user open the Homepage of dsportal and click get started button
    When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password
    And user click the login button
    Then user should successfully login into Homepage
   

  @test001
  Scenario: Open the Graph page
    When user click to Get Started button below the Graph
    When user clicks the Graph button
    Then user should be directed to Graph Page

  @test002
  Scenario: Open the try Editor page in Graph page
    When user click to Get Started button below the Graph
    When user clicks the Graph button
    When user hits the Try Here button
    Then user should be redirected to try Editor page

  @test003
  Scenario: Print the helloworld message in the tryEditor Box
    When user click to Get Started button below the Graph
    When user clicks the Graph button
    When user hits the Try Here button
    When user Enters the helloworld message in the tryEditor box
    When user hits the run button
    Then user should be able to see the print message helloworld

  @test004
  Scenario: Open the Graph representation page
    When user click to Get Started button below the Graph
    When user clicks the Graph Representations button
    Then user navigate to the Graph Representations page

  @test005
  Scenario: Open the try Editor page in Graph Representations
    When user click to Get Started button below the Graph
    When user clicks the Graph Representations button
    When user hits the Try Here button
    Then user navigate to the tryEditor page

  @test006
  Scenario: User gets the syntaxError message
    When user click to Get Started button below the Graph
    When user clicks the Graph Representations button
    When user hits the Try Here button
    When user enters the message in try editor box
    When user hits the run button
    Then user gets the SyntaxError message
    Then user should click the OK Button

  @test007
  Scenario: Open the Practice Questions Page
    When user click to Get Started button below the Graph
    When user click the Graph tab
    Then user click the Practice Question tab
    Then user navigate to the blank page of Practice Questions
    When user clicks the sign out link
    Then user should be logged out and navigated to the homepage
    
