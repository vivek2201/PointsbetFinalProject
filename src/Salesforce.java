import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver chromedriver=new ChromeDriver();
		//chromedriver.get("https://user-usa.test.pointsbet.com/ft/b47554551c82474ea1ab3b3f273f5107");
		chromedriver.get("https://spicejet.com");
		chromedriver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		//chromedriver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		chromedriver.findElement(By.cssSelector("button#open-login-modal.btn.btn-quartenary.ng-scope")).click();
	
		
		//chromedriver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();	//byxpath
		/*chromedriver.findElement(By.xpath("//a[contains(@title, 'Sign in')]")).click();//by xpath regularexpression
		chromedriver.findElement(By.xpath("//input[@id='login1']")).sendKeys("priya");
		chromedriver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");*/
		//chromedriver.findElements(By.cssSelector("input#password")).sendKeys//css selector for element who has id
		//chromedriver.findElement(By.xpath("//input[@value='Go']")).click();
		//chromedriver.manage().timeouts().pageLoadTimeout(100, miliseconds)
		//new WebDriverWait(chromedriver,10).until(ExpectedConditions.
	//boolean popupbox=	chromedriver.findElement(By.xpath("//div[@class='sumome-react-wysiwyg-move-handle']")).isDisplayed();
	//System.out.println(popupbox);
		//chromedriver.findElement(By.xpath("//a[@class='active']")).click();
		
		
		

	}

}
