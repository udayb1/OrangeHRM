package com.stepDefinitionTestNG;
import com.base.DriverManager;
import io.cucumber.java.en.*;
import utils.ExcelReader;

import com.pages.*;
import com.context.TestContext;

public class OrangeHRMSteps {
public HomePage home;
public LoginPage login;
public AddEmployeePage addemployee;
public SearchPage search;

public OrangeHRMSteps() {}


@Given("Open the  browser and launch the application")
public void open_the_browser_and_launch_the_application() {
	DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php");
}

////////   LOGIN XCEL FILE  ////////////

@Given("user navigates to LoginPage")
public void user_navigates_to_LoginPage() throws Exception {
    DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(3000);
}

@When("I enter Username and Password")
public void i_enter_username_and_password() {

    String filePath = "src\\test\\resources\\Exceldata\\OrangeHRM.xlsx";

    String username = ExcelReader.getCellData(filePath, "Sheet1", 1, 0);
    String password = ExcelReader.getCellData(filePath, "Sheet1", 1, 1);

    TestContext.login.gotoLogin();
    TestContext.login.enterUsername(username);
    TestContext.login.enterPwd(password);
    TestContext.login.clickLogin();
}



@Then("login should be successful")
public void login_should_be_successful() {
    System.out.println("Login successful");
    //DriverManager.quitDriver();
}


}
