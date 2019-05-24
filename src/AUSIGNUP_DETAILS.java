import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AUSIGNUP_DETAILS {
	public void CreateAccount(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@href='/signup']")).click();
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.firstName']")).sendKeys("userpriya18");
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.lastName']")).sendKeys("cuserpriya18");
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.email']")).sendKeys("userpriya18@mailinator.com");
		driver.findElement(By.xpath("//button[@ng-click='$ctrl.goToStep(2)']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@class='custom-radiobuttons custom-radiobuttons-inline'] /ul/li[2]")).click();
		driver.findElement(By.xpath("//div[@class='dropdown'] /button[@id='month']")).click();
		driver.findElement(By.xpath("//div[@aria-labelledby='month'] /ul/li[3]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='day']")).isEnabled());
		
		driver.findElement(By.xpath("//button[@id='day']")).click();
		driver.findElement(By.xpath("//div[@aria-labelledby='day'] /ul/li[3]")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@class='dropdown'] /button[@id='year']")).click();
		driver.findElement(By.xpath("//div[@aria-labelledby='year'] /ul/li[3]")).click();
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.contactNumber']")).sendKeys("0424942959");
		driver.findElement(By.xpath("//div[@class='custom-message']/label/span")).click();
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.addressLine1']")).sendKeys("155");
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.addressLine2']")).sendKeys("Cremorne street");
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.addressSuburb']")).sendKeys("Richmond");
        driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.addressPostCode']")).sendKeys("3021");
        driver.findElement(By.xpath("//div[@class='form-input dropdown ng-scope']//button")).click();
        driver.findElement(By.xpath("//div[@aria-labelledby='signuptitle']/ul/li[1]")).click();
        driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.userName']")).sendKeys("userpriya18");
        driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.password']")).sendKeys("password1");
        driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.confirmPassword']")).sendKeys("password1");
        driver.findElement(By.xpath("//label[@for='TermsAndConditions']")).click();

   
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000L);
       
      
		
        }

}
