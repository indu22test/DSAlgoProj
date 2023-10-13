@tree
Feature: Tree
  
  I want to use this feature to test the page functionality

  Background: user navigate to Tree page
    Given user Launch the Browser
    When user open the Homepage of dsportal and click get started button
    When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password
    And user click the login button
    Then user should successfully login into Homepage

  @testcase74
  Scenario: user navigates to Tree Page
    When user clicks Tree get started button
    And user navigates to Tree page

  @testcase75
  Scenario: user navigates to OverViewOfTree Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks overview of Trees link
    Then user should be redirected to overview of Tree page

  @testcase76
  Scenario: Open the Practice Questions Page under Tree page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks overview of Trees link
    Then user should be redirected to overview of Tree page
    When user clicks the practice questions button under overview of Tree page
    Then User should land on the blank practice page under overview of Tree page

  @testcase77
  Scenario: Display the try Editor Page under overview of Tree page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks overview of Trees link
    Then user should be redirected to overview of Tree page
    When user clicks on the try here button
    Then user should be navigate to the try editor page

  @testcase78
  Scenario: user navigates to OverViewOfTree Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks overview of Trees link
    Then user should be redirected to overview of Tree page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase79
  Scenario: Get Alert Message of Syntx Error under overview of Tree page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks overview of Trees link
    Then user should be redirected to overview of Tree page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase80
  Scenario: user navigates to Terminologies Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Terminologies
    Then user should be redirected to Terminologies page

  @testcase81
  Scenario: Display the try Editor Page under Terminologies page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Terminologies
    Then user should be redirected to Terminologies page
    When user clicks on the try here button
    Then user should be navigate to the try editor page

  @testcase82
  Scenario: user navigates to Terminologies Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Terminologies
    Then user should be redirected to Terminologies page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase83
  Scenario: Get Alert Message of Syntx Error under Terminologies page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Terminologies
    Then user should be redirected to Terminologies page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase84
  Scenario: user navigates to Types of Trees Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Types of Trees
    Then user should be redirected to Types of Trees page

  @testcase85
  Scenario: Display the try Editor Page under Types of Trees page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Types of Trees
    Then user should be redirected to Types of Trees page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase86
  Scenario: user navigates to Types of Trees Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Types of Trees
    Then user should be redirected to Types of Trees page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase87
  Scenario: Get Alert Message of Syntx Error Types of Trees page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Types of Trees
    Then user should be redirected to Types of Trees page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase88
  Scenario: user navigates to Tree Traversals Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Tree Traversals
    Then user should be redirected to Tree Traversals page

  @testcase89
  Scenario: Display the try Editor Page under Tree Traversals page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Tree Traversals
    Then user should be redirected to Tree Traversals page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase90
  Scenario: user navigates to Tree Traversals Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Tree Traversals
    Then user should be redirected to Tree Traversals page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase91
  Scenario: Get Alert Message of Syntx Error under Tree Traversals
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Tree Traversals
    Then user should be redirected to Tree Traversals page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase92
  Scenario: user navigates to Tree Traversals Illustration Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Traversals Illustration
    Then user should be redirected to Traversals Illustration page

  @testcase93
  Scenario: Display the try Editor Page under Traversals Illustration page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Traversals Illustration
    Then user should be redirected to Traversals Illustration page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase94
  Scenario: user navigates to Traversals Illustration Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Traversals Illustration
    Then user should be redirected to Traversals Illustration page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase95
  Scenario: Get Alert Message of Syntx Error under Traversals Illustration
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Traversals Illustration
    Then user should be redirected to Traversals Illustration page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase96
  Scenario: user navigates to Binary Trees Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Trees
    Then user should be redirected to Binary Trees page

  @testcase97
  Scenario: Display the try Editor Page under Binary Trees page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Trees
    Then user should be redirected to Binary Trees page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase98
  Scenario: user navigates to Binary Trees Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Trees
    Then user should be redirected to Binary Trees page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase99
  Scenario: Get Alert Message of Syntx Error under Binary Trees page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Trees
    Then user should be redirected to Binary Trees page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase100
  Scenario: user navigates to Types of Binary Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Types of Binary
    Then user should be redirected to Types of Binary page

  @testcase101
  Scenario: Display the try Editor Page under Types of Binary page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Types of Binary
    Then user should be redirected to Types of Binary page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase102
  Scenario: user navigates to Types of Binary Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Types of Binary
    Then user should be redirected to Types of Binary page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase103
  Scenario: Get Alert Message of Syntx Error under Types of Binary Trees
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Types of Binary
    Then user should be redirected to Types of Binary page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase104
  Scenario: user navigates to Implementation in Python Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation in Python
    Then user should be redirected to Implementation in Python page

  @testcase105
  Scenario: Display the try Editor Page under Implementation in Python page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation in Python
    Then user should be redirected to Implementation in Python page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase106
  Scenario: user navigates to Implementation in Python Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation in Python
    Then user should be redirected to Implementation in Python page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase107
  Scenario: Get Alert Message of Syntx Error under Implementation in Python
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation in Python
    Then user should be redirected to Implementation in Python page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase108
  Scenario: user navigates to Binary Tree Traversals Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Tree Traversals
    Then user should be redirected to Binary Tree Traversals page

  @testcase109
  Scenario: Display the try Editor Page under Binary Tree Traversals page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Tree Traversals
    Then user should be redirected to Binary Tree Traversals page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase110
  Scenario: user navigates to Binary Tree Traversals Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Tree Traversals
    Then user should be redirected to Binary Tree Traversals page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase111
  Scenario: Get Alert Message of Syntx Error under Binary Tree Traversals
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Tree Traversals
    Then user should be redirected to Binary Tree Traversals page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase112
  Scenario: user navigates to Implementation of Binary Trees Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation of Binary Trees
    Then user should be redirected to Implementation of Binary Trees page

  @testcase113
  Scenario: Display the try Editor Page under Implementation of Binary Trees page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation of Binary Trees
    Then user should be redirected to Implementation of Binary Trees page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase114
  Scenario: user navigates to Implementation of Binary Trees Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation of Binary Trees
    Then user should be redirected to Implementation of Binary Trees page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase115
  Scenario: Get Alert Message of Syntx Error under Implementation of Binary Trees
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation of Binary Trees
    Then user should be redirected to Implementation of Binary Trees page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase116
  Scenario: user navigates to Applications of Binary trees Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Applications of Binary trees
    Then user should be redirected to Applications of Binary trees page

  @testcase117
  Scenario: Display the try Editor Page under Applications of Binary trees page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Applications of Binary trees
    Then user should be redirected to Applications of Binary trees page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase118
  Scenario: user navigates to Applications of Binary trees Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Applications of Binary trees
    Then user should be redirected to Applications of Binary trees page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase119
  Scenario: Get Alert Message of Syntx Error under Applications of Binary trees
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Applications of Binary trees
    Then user should be redirected to Applications of Binary trees page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase120
  Scenario: user navigates to Binary Search Trees Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Search Trees
    Then user should be redirected to Binary Search Trees page

  @testcase121
  Scenario: Display the try Editor Page under Binary Search Trees page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Search Trees
    Then user should be redirected to Binary Search Trees page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase122
  Scenario: user navigates to Binary Search Trees Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Search Trees
    Then user should be redirected to Binary Search Trees page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @testcase123
  Scenario: Get Alert Message of Syntx Error under Binary Search Trees Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Binary Search Trees
    Then user should be redirected to Binary Search Trees page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button

  @testcase124
  Scenario: user navigates to Implementation Of BST Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation Of BST
    Then user should be redirected to Implementation Of BST page

  @testcase125
  Scenario: Display the try Editor Page under Implementation Of BST page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation Of BST
    Then user should be redirected to Implementation Of BST page
    When user clicks on the try here button
    And user should be navigate to the try editor page

  @testcase126
  Scenario: user navigates to Implementation Of BST Page and get the print message in the Editor Page
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation Of BST
    Then user should be redirected to Implementation Of BST page
    When user clicks on the try here button
    And user should be navigate to the try editor page
    When user enters the Print Message "print('HelloWorld')" in the Editor box
    And user clicks the run Button
    Then user should able to see the print message

  @TC_Tree_127
  Scenario: Get Alert Message of Syntx Error under Implementation Of BST
    When user clicks Tree get started button
    And user navigates to Tree page
    When user clicks Implementation Of BST
    Then user should be redirected to Implementation Of BST page
    When user clicks on the try here button
    And user enters the printmsg "hello" in Editor box
    And user clicks the run Button
    Then user get the SyntaxError message
    Then user should clicks the OK Button
