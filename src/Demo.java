import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Driver Object and invoking the exe file of chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver chromedriver=new ChromeDriver();
		chromedriver.get("http://facebook.com");
		//xpath
		chromedriver.findElement(By.xpath("//*[@type='email']")).sendKeys("priya");
		chromedriver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123");
		chromedriver.findElement(By.xpath("//*[@value='Log In']")).click();
		
		
		//regular expression if the element value keep on changing or if the value is too big
		//syntax: tagname[contains(@attribute,'value')]-xpath
		//"//input[contains(@name,'username')]"
		//CSS regular expression
		//syntax: tagname[Atrribute*=value], input[name*='username']
		/*System.out.println(chromedriver.getTitle());
		System.out.println(chromedriver.getCurrentUrl());
		chromedriver.navigate().to("http://yahoo.com");
		//chromedriver.navigate().back();
		//chromedriver.navigate().forward();
		chromedriver.close();//close current browser
		chromedriver.quit();//all browser by selenium script*/
		
		/*
		chromedriver.findElement(By.id("email")).sendKeys("");
		chromedriver.findElement(By.id("pass")).sendKeys("priya1234");*/
		

	}

}
