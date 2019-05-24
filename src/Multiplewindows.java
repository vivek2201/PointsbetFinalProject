import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?flowEntry=ServiceLogin&flowName=GlifWebSignIn");
		driver.findElement(By.xpath("//a[@href='https://support.google.com/chrome/answer/6130773?hl=en-GB']")).click();
		System.out.println(driver.getTitle());
		
		/*Set<String> ids= driver.getWindowHandles();
		String parent=ids.iterator().next();
		String child=ids.iterator().next();
		driver.switchTo().alert();
		driver.switchTo().frame(arg0);
		driver.switchTo().window(arg0);
		driver.switchTo().window(child));
		//driver.switchTo().defaultContent();//come back to original window
		*/
		
		
	
	}

}
