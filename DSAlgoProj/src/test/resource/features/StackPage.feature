@StackPage

Feature: StackPage

  Background: 
    Given user Launch the Browser
    When user open the Homepage of dsportal and click get started button
    When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password
    And user click the login button
    Then user should successfully login into Homepage

  @test_55
  Scenario: Open the Stack page
    When user hits the get started Button below Stack
    Then User should redirected to Stack page

  @test_56
  Scenario: Open the Operations in Stack Page
    When user hits the get started Button below Stack
    Then user clicks on Operations in Stack
    Then user redirected to Operations in Stack Page

  @test_57
  Scenario: Print the message in the try Editor Box
    When user hits the get started Button below Stack
    Then user clicks on Operations in Stack
    Then user click Try here Button
    Then user lands to try editor page
    When user enters the message Hello World in the box
    When user clicks Run Button
    Then user should be able see the print message

  @test_58
  Scenario: Open the Implementation in Stack page
    When user hits the get started Button below Stack
    Then user clicks on Implementation in Stack Page
    Then user redirected to Implementation in Stack Page

  @test_059
  Scenario: Open the try editor box in Implementation Stack Page
    When user hits the get started Button below Stack
    Then user clicks on Implementation in Stack Page
    Then use should land to Implementation in Stack Page
    Then user click Try here Button
    Then user lands to try editor page

  @test_060
  Scenario: Get the SyntaxError
    When user hits the get started Button below Stack
    Then user clicks on Implementation in Stack Page
    Then user click Try here Button
    When user enters the message hello in the box
    Then user gets the SyntaxError
    Then user click OK Button

  @test_61
  Scenario: Open the Applications in Stack Page
    When user hits the get started Button below Stack
    Then user clicks on Applications in Stack Page
    Then user redirected to Applications in Stack Page

  @test_62
  Scenario: Open the try editor box in Applications Stack Page
    When user hits the get started Button below Stack
    Then user clicks on Applications in Stack Page
    Then user click Try here Button
    Then user lands to try editor page

  @test_63
  Scenario: Print the message in the try Editor Box
    When user hits the get started Button below Stack
    Then user clicks on Applications in Stack Page
    Then user click Try here Button
    Then user lands to try editor page
    When user enters the message Priyanka in the box
    When user clicks Run Button
    Then user should be able see the print message

  @test_064
  Scenario: Scenario: Open the Practice Questions Page and sign out
    When user hits the get started Button below Stack
    Then user clicks on Operations in Stack
    When user clicks the Practice Questions button
    Then user navigated to the blank page of Practice Questions
    When user hits the sign out link
    Then user should logged out and navigated to the homepage
