package HOMEPAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class spicejet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users/JindeYashwanthKumar/selenium/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
//		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).click();;
		driver.findElement(By.xpath("//input[@value=\"Departure City\"]")).click();
		driver.findElement(By.xpath("//a[@text=\"Coimbatore (CJB)\"]")).click();;
		driver.findElement(By.xpath("(//a[@text=\"Goa (GOI)\"])[2]")).click();
		driver.findElement(By.partialLinkText("24")).click();
//		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date2\"]")).click();;
//		driver.findElement(By.partialLinkText("25")).click();
		boolean returndate=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date2\"]")).isEnabled();
		if(equals("true")) {
			driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date2\"]")).click();;
			driver.findElement(By.partialLinkText("25")).click();
		}
		else {
			System.out.println("return date not allow");
		
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[2]/a")).click();

	}

	}
}
