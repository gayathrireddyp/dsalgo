Feature: Ds_Algo_Homepage
Scenario: Register and Login
    Given Users Launches the chrome browser
    When Users opens the URL "https://dsportalapp.herokuapp.com/"
    And Users clicks Get started button and enter in Ds_algo_Home page
    And Users Clicks on Register!
    Then Users enters "anusha77" and "aadhya@1277" and "aadhya@1277"
    Then Users clicks on Register again
    And users click on "Numpy Ninja" to get refreshed
    And Users click on signout
    Then Users clicks on sign in and redirected to particular page
    Then Users enters valid email as "paranthaman.us@gmail.com" and valid password "admin@1609"
    And Users click on login
    Then page title should be "NumpyNinja/Sign in"
    And Users click on signout1
    Then page title should be "NumpyNinja/Sign out"
    And Users close browser 
    
    
 Scenario Outline: signin Datadriven
 Given Users Launches the chrome browser
    When Users opens the URL "https://dsportalapp.herokuapp.com/"
    And Users clicks Get started button and enter in Ds_algo_Home page
    And Users Clicks on Register!
    Then Users enters "<username1>" and "<password1>" and "<password1>"
    Then Users clicks on Register again
    And Users click on signout
    Then Users clicks on sign in and redirected to particular page
    Then Users enters valid email as "<username1>" and valid password "<password1>"
    And Users click on login
    And Users close browser 
    
     Examples: 
      | username1 | password1|
      |geetha99| harshini@1277|
    
     
