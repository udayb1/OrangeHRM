package com.pages;
import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input") 
	private WebElement ipUsername;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement ipPassword;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	private WebElement Loginerr;
	
	
	public void enterPassword(String pwd) { 
		type(ipPassword, pwd);
		}
	
	public void clickLogin() { 
		click(btnLogin); 
		}
	public String getLoginError() {
		return getText(Loginerr);
		}
	
	public void gotoLogin() {click(btnLogin);} public void enterUsername(String username) { type(ipUsername, username);}
	public void enterPwd(String password) { type(ipPassword, password);}
	

}
