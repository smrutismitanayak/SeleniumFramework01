package companyname.projectname.modulename;

import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Msn {

	public static void main(String s[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Maven_Project\\Cromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.chorme.driver","E:\\Maven_Project\\Cromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.msn.com/en-in");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(20000);
		WebElement element=driver.findElement(By.xpath("//*[@id='twcount']/iframe"));
		//Thread.sleep(0000);
		driver.switchTo().frame(element);
		Thread.sleep(10000);
	    driver.findElement(By.xpath("//span[text()='Follow']")).click();
	    Set<String> s1=driver.getWindowHandles();
	    Iterator<String> s2=s1.iterator();
	    String parentWindowHandeler=s2.next();
	    String childWindowHandeler=s2.next();
	    driver.switchTo().window(childWindowHandeler);
	    driver.close();
	    driver.switchTo().window(parentWindowHandeler);
	    Thread.sleep(10000);
	    WebElement wb2=driver.findElement(By.xpath("//*[@id='fbcount']/iframe"));
	    driver.switchTo().frame(wb2);
	    Thread.sleep(10000);
	    System.out.println("done1");
	    WebElement el=driver.findElement(By.xpath("//span[@class='_8f1i']"));
	    el.click();
	    el.click();
	    Set<String> s3=driver.getWindowHandles();
	    Iterator<String> s4=s3.iterator();
	    String parentWindowHandeler2=s4.next();
	    String childWindowHandeler2=s4.next();
	    driver.switchTo().window(childWindowHandeler2);
	    driver.close();
	    driver.switchTo().window(parentWindowHandeler2);
	    System.out.println("done2");
	    //driver.close();
	    //driver.switchTo().window(parentWindowHandeler);
	    //System.out.println("done");
	    String s9="23";
	    int a=Integer.parseInt(s9);
	    System.out.println(a);
	    
	    
	    
	    
		
	}
}
