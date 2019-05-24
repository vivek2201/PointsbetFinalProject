import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver chromedriver=new ChromeDriver();
		chromedriver.get("http://facebook.com/");
		chromedriver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		Select s=new Select(chromedriver.findElement(By.id("day")));//select class for dropdown for static drop down
		//s.selectByIndex(3);
		s.selectByValue("6");
		//s.selectByVisibleText(arg0);
		
	}

}
