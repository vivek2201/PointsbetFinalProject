import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AU_InplayBet {

	public void PlaceInplayBet(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[@class='btn btn-hamburger ng-scope']")).click();
		driver.findElement(By.xpath("//a[@ng-href='/inplay']")).click();
		Thread.sleep(2000L);
		if(driver.findElement(By.xpath("//div[@ng-if='$ctrl.showTabs']//li[1]")).isDisplayed())
		{
			System.out.println("Inside the inplay");
			int eventList= driver.findElements(By.xpath("//event-list[@ng-if='$ctrl.eventList.length']/div")).size();
			System.out.println(eventList);
			if(eventList>1)
			{
			driver.findElement(By.xpath("//event-list[@ng-if='$ctrl.eventList.length']/div[1]")).click();
			driver.findElement(By.xpath("//div[@class='markets-section mode-fixedodds sport-event']//uib-accordion[1]//a")).click();
			driver.findElement(By.xpath("//div[@ng-if='$ctrl.showSideBySideLayout']//div[1]")).click();
			}
			else {
				System.out.println("No Element is");
			}
			}
			
		}
			
		
	}


