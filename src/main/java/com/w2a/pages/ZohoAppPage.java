package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{
	


	public void gotoChat() {
		
		driver.findElement(By.xpath("//span[@class='zicon-apps-connect zicon-apps-96']")).click();
	}
	
	public CRMHomePage gotoCRM() {
		
		
		click("crmlink_CSS");
		//driver.findElement(By.xpath("//span[@class='zicon-apps-crm zicon-apps-96']")).click();
		
		return new CRMHomePage();
	}
	
	public void gotoSalesIQ() {
		
		driver.findElement(By.xpath("//span[@class='zicon-apps-salesiq zicon-apps-96']")).click();
		
	}
	
	

}
