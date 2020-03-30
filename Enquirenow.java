package HOMEPAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enquirenow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users/JindeYashwanthKumar/selenium/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cuesysinfotech.com");
		driver.findElement(By.xpath("//*[@id=\'enquiry_name\']")).sendKeys("yashwanth");
		driver.findElement(By.xpath("//*[@id=\"enquiry_email\"]")).sendKeys("yashwanthk296@gmaiul.com");
		driver.findElement(By.xpath("//*[@id=\"enquiry_phone\"]")).sendKeys("9703491650");
		driver.findElement(By.xpath("//*[@id=\"enquiry_message\"]")).sendKeys("code success");
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/button")).click();
	}

}
