import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver chromedriver=new ChromeDriver();
		//chromedriver.get("https://user-usa.test.pointsbet.com/ft/b47554551c82474ea1ab3b3f273f5107");
		chromedriver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		chromedriver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(2000L);
		chromedriver.switchTo().alert().accept();//java alter box
		//chromedriver.switchTo().alert().dismiss();//if you want to decline the alter box
		

	}

}
