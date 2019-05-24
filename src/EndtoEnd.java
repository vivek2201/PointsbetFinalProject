import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("http://spicejet.com/");// open the website

		// selectimg Family and friends checkbox
		chromedriver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Assert.assertTrue(chromedriver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());// validation
																													// for
																													// selction
		Assert.assertTrue(true);

		// selecting source
		chromedriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000L);
		chromedriver.findElement(By.xpath("//a[@value='MAA']")).click();

		// selcting destination
		chromedriver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		Thread.sleep(2000L);
		// chromedriver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();//selecting
		// second BLR value using index,
		chromedriver
				.findElement(
						By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']"))
				.click();
		Thread.sleep(2000L);

		// select depart date

		chromedriver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover"))
				.click();

		// selecting retun date
		chromedriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		chromedriver.findElement(By.id("ctl00_mainContent_view_date2")).click();

		if (chromedriver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("it is enabled");
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
		}

	}

}
