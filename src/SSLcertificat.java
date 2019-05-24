import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcertificat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//general chrome capabilities
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c=new ChromeOptions();
		c.merge(dc);
		System.setProperty(webdeiver.chrome.driver, value)
		Webdriver driver=new chromedriver(c);

	}

}
