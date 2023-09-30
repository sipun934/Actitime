package com.Actitime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.GenericLibrary.ListenerImplementation;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;
@Listeners(ListenerImplementation.class)
public class CreateCustomer extends BaseClass{
    @Test
    public void CreateCustomer() throws EncryptedDocumentException, IOException {
    	//HomePage class
    	HomePage hp=new HomePage(driver);
    	hp.getTasktab().click();
    	//TaskPage class
    	TaskPage tp=new TaskPage(driver);
    	tp.getAddnewcust().click();
    	tp.getNewcust().click();
    	
    	FileLibrary f=new FileLibrary();
    	String name = f.readDataFromExcelFile("Sheet1", 2, 2);
    	tp.getCustname().sendKeys(name);
    	String desc= f.readDataFromExcelFile("Sheet1", 1,2 ); 
    	tp.getCustdesc().sendKeys(desc);
    	tp.getCreatecust().click();
    	
    	String exceptederesult = name;
    	String actualresult = driver.findElement(By.xpath("//div[.='"+name+"'])[2]")).getText();
    	SoftAssert s=new SoftAssert();
    	s.assertEquals(exceptederesult, actualresult);
    	s.assertAll();
    }
}

