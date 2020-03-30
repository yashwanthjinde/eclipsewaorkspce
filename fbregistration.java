package HOMEPAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fbregistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users/JindeYashwanthKumar/selenium/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504235904%7Ce%7Cfb%27%27%27%7C&placement=&creative=318504235904&keyword=fb%27%27%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-431331345277%26loc_physical_ms%3D1007743%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIlKWpiLWp6AIVx5SPCh0AzQ9MEAAYASAAEgJb8_D_BwE");
		driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("yashwanth");
		driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys("jinde");
		driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).sendKeys("9703491650");
		driver.findElement(By.xpath("//*[@id=\"u_0_x\"]")).sendKeys("yashwanth@jinde.com");
		driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("20");
		driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("09");
		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1998");
		int count = driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println(count);
		
		for(int i=0; i < count; i++) {
			
			String s=driver.findElements(By.xpath("//input[@type= 'radio']")).get(i).getAttribute("value");
			String text="2";
			if(text.equalsIgnoreCase(s)) {
				driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
				
				System.out.println("male");
			}
			
		}
		driver.findElements(By.xpath("//input[@type= 'checkbox']")).get(i).click();
		driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
		if
		Select m1 = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
		m1.selectByIndex(4);
		Select m2 = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Child\"]")));
		m2.selectByValue("2");
		Select m3 = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Infant\"]")));
		m3.selectByValue("2");
		
		//driver.findElement(By.xpath("//*[@id=\"u_0_1a\"]")).click();

	}

}
