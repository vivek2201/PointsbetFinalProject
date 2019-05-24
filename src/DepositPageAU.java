import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositPageAU {

	public void Deposit(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000L);
		
		// TODO Auto-generated method stub
		System.out.println("Deposit is started");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//button[@ng-click='$ctrl.toggleNav($ctrl.navItems.user)']")).click();
		Thread.sleep(4000L);
		driver.findElement(By.xpath(" //nav[@id='user-nav']//a[@href='/account/deposit']")).click();
		driver.findElement(By.xpath(" //input[@ng-model='deposit.depositAmount']")).sendKeys("200");
		driver.findElement(By.xpath(" //input[@ng-model='deposit.cardNumber']")).sendKeys("4111111111111111");
		driver.findElement(By.xpath(" //input[@ng-model='deposit.nameOnCard']")).sendKeys("Test");
		driver.findElement(By.xpath(" //button[@id='month']")).click();
		driver.findElement(By.xpath(" //div[@aria-labelledby='month']//li[3]//a[@class='ng-binding']")).click();;
		driver.findElement(By.xpath(" //button[@id='day']")).click();
		driver.findElement(By.xpath(" //div[@aria-labelledby='day']//li[3]//a[@class='ng-binding']")).click();
		driver.findElement(By.xpath(" //input[@ng-model='deposit.cardCVC']")).sendKeys("867");
		driver.findElement(By.xpath("//button[@type='submit']//span[@ng-show='depositInProgress === false']")).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//button[@ng-click='$ctrl.toggleNav($ctrl.navItems.user)']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath(" //nav[@id='user-nav']//a[@href='/account/transaction-history']")).click();
		Thread.sleep(5000L);
		String deposittype=driver.findElement(By.xpath("//div[@class='table-row ng-scope']//div[@class='col-type ng-binding']")).getText();
		String ActualdepositType="Deposit (card)";
		System.out.println(deposittype);
		if(deposittype.equals(ActualdepositType))
		{
			System.out.println("Deposit is sucessful");
		}
		Thread.sleep(3000L);
		
		
		
		
		
	}

}
