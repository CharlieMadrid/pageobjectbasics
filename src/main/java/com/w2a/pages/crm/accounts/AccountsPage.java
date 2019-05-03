package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page{
	
	
	
	public CreateAccountPage gotoCreateAccounts() {
		
		
		click("createaccountbtn_XPATH");
		//driver.findElement(By.xpath("//button[@data-zcqa='cv_createbtn']")).click();
		return new CreateAccountPage();
		
	}
	
	public void gotoImportsAccounts() {
		
	}

}
