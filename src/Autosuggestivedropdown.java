import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		// selecting webelement
		/*driver.findElement(By.id("hp-widget__sfrom")).clear();// clear whatever written in input field
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("MUM");// write mum 
		Thread.sleep(2000L);
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);//enter through keyboard
*/		
		
		//to make our code clear store web element in one variable
		WebElement source=driver.findElement(By.id("hp-widget__sfrom"));
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(2000L);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination= driver.findElement(By.id("hp-widget__sTo"));
		destination.clear();
		destination.sendKeys("DEL");//user is not interested FIRST option 
		Thread.sleep(2000L);
		destination.sendKeys(Keys.ARROW_DOWN);// TO SELECT SELECT ELEMENT ARROW DOWN
		destination.sendKeys(Keys.ENTER);
		
	

	}

}
