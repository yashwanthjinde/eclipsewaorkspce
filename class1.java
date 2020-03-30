package HOMEPAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users/JindeYashwanthKumar/selenium/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cuesysinfotech.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());

	}

}
