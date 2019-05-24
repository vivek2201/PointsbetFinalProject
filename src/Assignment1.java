import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver chromedriver=new ChromeDriver();
		//chromedriver.get("https://user-usa.test.pointsbet.com/ft/b47554551c82474ea1ab3b3f273f5107");
		chromedriver.get("http://qaclickacademy.com/practice.php");
		chromedriver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(chromedriver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertTrue(true);
		Thread.sleep(2000L);
		chromedriver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(chromedriver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertFalse(false);
		
		//System.out.println(chromedriver.findElement(By.xpath("//input[@type='checkbox']")).size();
		int count=chromedriver.findElements(By.cssSelector("input[type='checkbox']")).size();

	}

}
