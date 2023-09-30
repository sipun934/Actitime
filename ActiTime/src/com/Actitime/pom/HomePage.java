package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.GenericLibrary.BaseClass;

public class HomePage extends BaseClass {
   //decleration
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasktab;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportstab;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement userstab;
	
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	
	//initilization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getTasktab() {
		return tasktab;
	}

	public WebElement getReportstab() {
		return reportstab;
	}

	public WebElement getUserstab() {
		return userstab;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
}
