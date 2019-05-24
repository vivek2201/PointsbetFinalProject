import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SportsNavigation {
	public void sportsNavigationValidation(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//button[@class='btn btn-hamburger ng-scope']")).click();
		WebElement Sports = driver.findElement(By.id("sports-nav"));
		System.out.println(Sports.findElements(By.tagName("a")).size());
		WebElement Promoevents = Sports.findElement(By.xpath("//a[@ng-class='event.sportKey']"));
		System.out.println(Promoevents.findElements(By.xpath("//a[@ng-class='event.sportKey']")).size());
		for (int i = 0; i < Promoevents.findElements(By.xpath("//a[@ng-class='event.sportKey']")).size(); i++) {
			Promoevents.findElements(By.xpath("//a[@ng-class='event.sportKey']")).get(i).click();
			Thread.sleep(3000L);
			driver.findElement(By.xpath("//button[@class='btn btn-hamburger ng-scope']")).click();
			Thread.sleep(3000L);

		}

		WebElement Mainsports = Sports.findElement(By.xpath("//a[@ng-class='sport.key']"));
		System.out.println(Mainsports.findElements(By.xpath("//a[@ng-class='sport.key']")).size());
		for (int j = 0; j < Mainsports.findElements(By.xpath("//a[@ng-class='sport.key']")).size(); j++) {
			Mainsports.findElements(By.xpath("//a[@ng-class='sport.key']")).get(j).click();
			Thread.sleep(3000L);
			System.out.println(driver.findElements(By.xpath("//div[@class='main-tab-nav']/ul/li")).size());
			int tabs = driver.findElements(By.xpath("//div[@class='main-tab-nav']/ul/li")).size();
			if (tabs > 0) {
				for (int k = 0; k < tabs; k++) {
					driver.findElements(By.xpath("//div[@class='main-tab-nav']/ul/li")).get(k).click();
					Assert.assertTrue(
							driver.findElement(By.xpath("//div[@ng-show='$ctrl.showNoMarketsMessage === false']"))
									.isEnabled());
					Assert.assertTrue(true);

					if (driver.findElement(By.xpath("//div[@ng-show='$ctrl.showNoMarketsMessage === false']"))
							.isEnabled())

					{
						System.out.println("Events are available");
					} 
					
				}
			}
		
			else
			{
				System.out.println("Events are not available");
			}
			
			

			driver.findElement(By.xpath("//button[@class='btn btn-hamburger ng-scope']")).click();
			Thread.sleep(3000L);
		}
	}
}

