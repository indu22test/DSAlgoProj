@Queue
Feature: QueuePage

  Background: 
    Given user Launch the Browser
    When user open the Homepage of dsportal and click get started button
    When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password
    And user click the login button
    Then user should successfully login into Homepage

  @testcase63
  Scenario: Open the Queue page from the Data-Structures Dropdown
    When user navigate to dropdown of data-structures
    And user click the queue button
    Then User should redirected to Queue page

  @testcase64
  Scenario Outline: Open the Implementation of Queue in Python page
    When user navigate to dropdown of data-structures
    And user click the queue button
    And User should redirected to Queue page
    When user click on Implementation of Queue in Python link
    Then user should land on Implementation of Queue in Python page

  @testcase65
  Scenario: Redirect to try editor on Implementation of Queue in Python page
    When user navigate to dropdown of data-structures
    And user click the queue button
    Then User should redirected to Queue page
    When user click on Implementation of Queue in Python link
    And user click the Try here button
    Then user should be redirected to the try editor page

  @testcase66
  Scenario: Display Syntx Error Message
    When user navigate to dropdown of data-structures
    And user click the queue button
    Then User should redirected to Queue page
    When user click on Implementation of Queue in Python link
    And user click the Try here button
    When user enters the "queue12345" in the test page
    And user clicks on Run button
    Then user should get an AlertMessage
    And user clicks ok button

  @testcase67
  Scenario: Open the Implementation of collections.deque Page
    When user navigate to dropdown of data-structures
    And user click the queue button
    Then User should redirected to Queue page
    And user click on Implementation using collections.deque
    Then user should land on Implementation using collections.deque Page

  @testcase68
  Scenario: User Run Test in the try editor box on collection.deque page
    When user navigate to dropdown of data-structures
    And user click the queue button
    Then User should redirected to Queue page
    And user click on Implementation using collections.deque
    Then user should land on Implementation using collections.deque
    And user click the Try here button
    When user enters the "print('Queue')" in the Editor
    And user clicks on Run button
    Then user should see print message in the try editor

  @testcase69
  Scenario: Open the Implementation using Array Page
    When user navigate to dropdown of data-structures
    And user click the queue button
    Then User should redirected to Queue page
    When user click on Implementation using Array
    Then user should land on Implementation using Array

  @testcase70
  Scenario: Open the Implementation using Array, click on try editor and run the test
    When user navigate to dropdown of data-structures
    And user click the queue button
    Then User should redirected to Queue page
    When user click on Implementation using Array
    Then user should land on Implementation using Array
    And user click the Try here button
    When user enters the "queue12345" in the test page
    And user clicks on Run button
    Then user should get an AlertMessage
    And user clicks ok button

  @testcase71
  Scenario: User opens editor on Queue operations page
    When user navigate to dropdown of data-structures
    And user click the queue button
    Then User should redirected to Queue page
    When user clicks on Queue Operations
    Then user should land on Queue Operations

  @testcase72
  Scenario: User Run Test in Try-editor on Queue operations page
    When user navigate to dropdown of data-structures
    And user click the queue button
    Then User should redirected to Queue page
    When user clicks on Queue Operations
    Then user should land on Queue Operations
    And user click the Try here button
    When user enters the "queue12345" in the test page
    And user clicks on Run button
    Then user should get an AlertMessage
    And user clicks ok button

  @testcase73
  Scenario: Open the practice Question Page and sign out
    When user navigate to dropdown of data-structures
    And user click the queue button
    Then User should redirected to Queue page
    When user clicks on Queue Operations
    Then user should land on Queue Operations
    When user clicks to the Practice Questions Button
    Then user redirected to the practice questions page
    Then user will Sign out
