import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResponsibleGamingPage {
	
	public void depositLimit(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@class='f1a3pear'] //a[@href='/responsible-gambling']")).click();
		driver.findElement(By.xpath("//deposit-limit-usa[@class='ng-isolate-scope'] //a")).click();
		System.out.println(driver.findElements(By.xpath("//div[@class='form-group custom-radiobuttons custom-radiobuttons-inline'] //label")).size());
		for(int i=0;i< driver.findElements(By.xpath("//div[@class='form-group custom-radiobuttons custom-radiobuttons-inline'] //label")).size();i++)
		{
			driver.findElements(By.xpath("//div[@class='form-group custom-radiobuttons custom-radiobuttons-inline'] //label")).get(i).click();
			driver.findElement(By.xpath("//input[@id='Amount']")).sendKeys("500");
			driver.findElement(By.xpath("//button[@class='btn btn-block-mobile btn-secondary btn-submit'] ")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block-mobile btn-submit'] ")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-secondary btn-sm'] ")).click();
		
		}
		
		
		
	}

}
