package com.context;

import com.pages.AddEmployeePage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SearchPage;
import com.base.DriverManager;


public class TestContext {
	public static HomePage home;
    public static LoginPage login;
    public static SearchPage search;
    public static AddEmployeePage addemployee;
    
	public static void initPages() {DriverManager.getDriver();
	home = new HomePage();
	login =new LoginPage();
	search = new SearchPage();
	addemployee = new AddEmployeePage();
	
    }
}
