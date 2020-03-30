package HOMEPAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fblogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users/JindeYashwanthKumar/selenium/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504235904%7Ce%7Cfb%27%27%27%7C&placement=&creative=318504235904&keyword=fb%27%27%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-431331345277%26loc_physical_ms%3D1007743%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIlKWpiLWp6AIVx5SPCh0AzQ9MEAAYASAAEgJb8_D_BwE");
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9703491650");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("9703498650");
		driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).click();

		

	}

}
