import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	WebElement Discount=footerdriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
	System.out.println(Discount.findElements(By.tagName("a")).size());
	//click 
	
		for (int i=1;i<Discount.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			Discount.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000L);
		}
			
		Set<String> tabs=driver.getWindowHandles();//0-4 total 5
			Iterator<String> ids=tabs.iterator();//it is ready to start from 0 index
			while(ids.hasNext())//next index present or not true and false value
			{
				driver.switchTo().window(ids.next());//it moves to 0 index
				System.out.println(driver.getTitle());
			}
			
			
		
		

	}

}
