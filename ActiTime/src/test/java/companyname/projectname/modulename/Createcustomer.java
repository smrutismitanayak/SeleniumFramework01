package companyname.projectname.modulename;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import KRN.ActiTime.Baseclass.ExcelData;



public class Createcustomer {

	
	@Test
	public void Login() throws InterruptedException
	{
		ExcelData  exl=new ExcelData();
		System.setProperty("webdriver.chrome.driver","E:\\Maven_Project\\Cromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String userName=exl.getExcelData("sheet1", 1, 0);
		System.out.println(userName);
		String passWord=exl.getExcelData("sheet1", 1, 1);
		System.out.println(passWord);
		
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
	}

}

