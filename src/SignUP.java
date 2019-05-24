import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUP {
	
	public void CreateAccount(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.promotionCode']")).clear();
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.promotionCode']")).sendKeys("TOPGOLF10");
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.firstName']")).sendKeys("Priya503");
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.lastName']")).sendKeys("Priya503");
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.email']")).sendKeys("Priya503@mailinator.com");
		driver.findElement(By.xpath("//button[@ng-click='$ctrl.goToStep(2)']")).click();
	    //driver.findElement(By.xpath("//ul[@class='steps']/li[2]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@class='custom-radiobuttons custom-radiobuttons-inline'] /ul/li[2]")).click();
		driver.findElement(By.xpath("//div[@class='dropdown'] /button[@id='month']")).click();
		driver.findElement(By.xpath("//div[@aria-labelledby='month'] /ul/li[3]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='day']")).isEnabled());
		Assert.assertTrue(true);
		//WebDriverWait wait=new WebDriverWait(driver,100);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='day']")));
		driver.findElement(By.xpath("//button[@id='day']")).click();
		driver.findElement(By.xpath("//div[@aria-labelledby='day'] /ul/li[3]")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@class='dropdown'] /button[@id='year']")).click();
		driver.findElement(By.xpath("//div[@aria-labelledby='year'] /ul/li[3]")).click();
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.contactNumber']")).sendKeys("+61424942959");
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.ssn']")).sendKeys("5013");
		driver.findElement(By.xpath("//div[@class='custom-message']/label/span")).click();
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.addressLine1']")).sendKeys("2223333");
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.addressLine2']")).sendKeys("Peachtree");
		driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.addressSuburb']")).sendKeys("Atlanta");
        driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.addressPostCode']")).sendKeys("31328");
        driver.findElement(By.xpath("//div[@class='form-input dropdown ng-scope']//button")).click();
        driver.findElement(By.xpath("//div[@aria-labelledby='signuptitle']/ul/li[1]")).click();
        driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.userName']")).sendKeys("userpriya503");
        driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.password']")).sendKeys("password1");
        driver.findElement(By.xpath("//input[@ng-model='$ctrl.user.confirmPassword']")).sendKeys("password1");
        driver.findElement(By.xpath("//label[@for='TermsAndConditions']")).click();
        driver.findElement(By.xpath("//label[@for='AgeUsageAccepeted']")).click();
        driver.findElement(By.xpath("//label[@for='NotCasinoEmployeeAccepted']")).click();
        driver.findElement(By.xpath("//label[@for='SignupTrueInfo']")).click();
   
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000L);
        //driver.findElement(By.xpath("//input[@ng-model='$ctrl.ssn']")).sendKeys("111226233");
        //driver.findElement(By.xpath("//button[@ng-click='$ctrl.submitSSN()']")).click();
        //Thread.sleep(2000L);
        //driver.findElement(By.xpath("//button[@ng-click='$ctrl.close()']")).click();
     
		
		
		
	}

}
