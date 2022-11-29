Feature: Graphs
Scenario Outline: graph Datadriven
 Given Users Launch the chrome browser
    When Users open the URL "https://dsportalapp.herokuapp.com/"
    And Users click Get started button and enter in Ds_algo_Home page
    Then Users click on sign in and redirected to particular page
    Then Users enter valid email as "<username2>" and valid password "<password2>"
    And Users clicks on login
    Then Users click on Get started button under Array Datastructure
    And Users will be redirected to Arrays page
    Then Users click on Graph under topics covered
    Then Users click on try here
    Then users enters <code> in the textbox
    And Users click on Run and output gets displayed
    Then Users will go back to previous page
    And users click on Graph Representations under topics covered
    Then Users click on try here1
    Then users enters <code> in the textbox1
    And Users click on Run and output gets display
    Then Users will go back to previous pages
    And users click on practice questions and enter particular page
    And User click on signout
    And User close browser 
    
    
    Examples:
      | username2 | password2|code|
      |paranthaman.us@gmail.com| admin@1609|print ("hello world")|
    