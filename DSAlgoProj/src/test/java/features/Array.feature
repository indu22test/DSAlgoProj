@array
Feature: array
  
  I want to use this feature to test the page functionality

  Background: user navigate to array page
    Given user Launch the Browser
    When user open the Homepage of dsportal and click get started button
    When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password
    And user click the login button
    Then user should successfully login into Homepage

  @testcase43
  Scenario: user navigates to arrays in python page and tries to run code
    When user clicks array get started button
    And user navigates to array page
    When user clicks arrays in python link
    Then user should be redirected to arrays in python page
    When user clicks try here button
    And user should be redirected to page with run button
    When user enters code in the text editor and clicks the run button
    Then the user gets an alert and accepts it

  @testcase44
  Scenario: user navigates to arrays in python page and tries to run without code
    When user clicks array get started button
    And user navigates to array page
    When user clicks arrays in python link
    Then user should be redirected to arrays in python page
    When user clicks try here button
    And user should be redirected to page with run button
    When user clicks the run button
    Then user should check if there is an alert

  @testcase45
  Scenario: user navigates to get started page from arrays using list page
    When user clicks array get started button
    And user navigates to array page
    When user clicks arrays using list link
    Then user should be redirected to arrays using list page
    When user clicks numpyninja tab
    Then user gets redirected to the get started page

  @testcase46
  Scenario: user navigates to stack page through basic operations in lists page
    When user clicks array get started button
    And user navigates to array page
    When user clicks basic operations in lists link
    Then user should be redirected to basic operations in lists page
    When user clicks data structures
    And user clicks stack
    Then user should be redirected to stack page

  @testcase47
  Scenario: user tries search the array practice question using code and submit button
    When user clicks array get started button
    And user navigates to array page
    When user clicks arrays in python link
    Then user should be redirected to arrays in python page
    When user clicks practice questions link
    Then user should be redirected to practice questions page
    When user clicks search the array link
    Then user should be redirected to question page
    When user enters code in the text editor and clicks the submit button
    Then user should see an error message

  @testcase48
  Scenario: user tries search the array practice question without code and submit button
    When user clicks array get started button
    And user navigates to array page
    When user clicks arrays in python link
    Then user should be redirected to arrays in python page
    When user clicks practice questions link
    Then user should be redirected to practice questions page
    When user clicks search the array link
    Then user should be redirected to question page
    When user clicks the submit button
    Then user should see an error message

  @testcase49
  Scenario: user tries search the array practice question with code and run button
    When user clicks array get started button
    And user navigates to array page
    When user clicks arrays in python link
    Then user should be redirected to arrays in python page
    When user clicks practice questions link
    Then user should be redirected to practice questions page
    When user clicks search the array link
    Then user should be redirected to question page
    When user clicks the run button
    Then the user gets an alert and accepts it

  @testcase50
  Scenario: user tries to practice max consecutive ones code
    When user clicks array get started button
    And user navigates to array page
    When user clicks arrays in python link
    Then user should be redirected to arrays in python page
    When user clicks practice questions link
    Then user should be redirected to practice questions page
    When user clicks max executive ones link
    Then user should be redirected to question page
    When user enters code in the text editor and clicks the submit button
    Then user should see an error message

  @testcase51
  Scenario: user tries to get to the graph page through practice questions page
    When user clicks array get started button
    And user navigates to array page
    When user clicks arrays in python link
    Then user should be redirected to arrays in python page
    When user clicks practice questions link
    Then user should be redirected to practice questions page
    When user clicks squares of a sorted array link
    Then user should be redirected to question page
    When the user clicks the back arrow button
    And user clicks data structures
    And user clicks graph
    Then user should be redirected to the graph page

  @testcase52
  Scenario: user navigates back to get started page from the basic lists page
    When user clicks array get started button
    And user navigates to array page
    When user clicks basic operations in lists link
    Then user should be redirected to basic operations in lists page
    When user clicks try here button
    Then user should be redirected to page with run button
    When user enters code in the text editor and clicks the run button
    Then the user gets an alert and accepts it

  @testcase53
  Scenario: user navigates to practice questions and then to homepage and back to linked lists
    When user clicks array get started button
    And user navigates to array page
    When user clicks arrays using list link
    Then user should be redirected to arrays using list page
    When user clicks practice questions link
    Then user should be redirected to practice questions page
    When user clicks numpyninja tab
    Then user gets redirected to the get started page
    When the user clicks get started button
    Then the user lands on the homepage
    When user clicks linked lists get started button
    Then user lands on the linked lists page

  @testcase54
  Scenario: user navigates to queue page through tree page from array page
    When user clicks array get started button
    And user navigates to array page
    When user clicks on applications of array link
    Then user lands on the applications of array page
    When user clicks data structures
    And user clicks queue
    Then user lands on queue page
    When user clicks data structures
    And user clicks on tree
    Then user lands on tree page

  @testcase55
  Scenario: user navigates to applications of array page and then logs out
    When user clicks array get started button
    And user navigates to array page
    When user clicks on applications of array link
    Then user should be redirected to applications of array page
    When the user clicks the sign out link
    Then user should be logged out and navigated to the homepage
