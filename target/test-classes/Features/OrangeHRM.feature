 @DemoWebShop
Feature: OrangeHRM Demo 

 @OpenBrowser
  Scenario: Open Browser and Launch Application
    Given Open the  browser and launch the application
    
    ###################################################
  # 3. Login functionality
  ###################################################
  @LoginPass
  Scenario: Login functionality
    Given user navigates to LoginPage
    When I enter Username and Password
    Then login should be successful
