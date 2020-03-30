package HOMEPAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users/JindeYashwanthKumar/selenium/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		int count1 =driver.findElements(By.xpath("//input[@name='group1']")).size();
		int count2 = driver.findElements(By.xpath("//input[@name='group2']")).size();
		int count3 = driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println("____________________________________");
		System.out.println("Group1");
		System.out.println("____________________________________");
		for(int i = 0;i < count1; i++) {
			System.out.println(driver.findElements(By.xpath("//input[@name= 'group1']")).get(i).getAttribute("value"));
			
		}
		System.out.println("____________________________________");
		System.out.println("Group2");
		System.out.println("____________________________________");
		for(int i = 0;i < count2; i++) {
			System.out.println(driver.findElements(By.xpath("//input[@name= 'group2']")).get(i).getAttribute("value"));
			
		}
		
		System.out.println("____________________________________");
		
		System.out.println("as per req");
		System.out.println("____________________________________");
		for(int i = 0;i < count3; i++) {
			String text=driver.findElements(By.xpath("//input[@type= 'radio']")).get(i).getAttribute("value");
			String a= "Butter";
			String b ="Water";
			if(text.equalsIgnoreCase(a) || text.equalsIgnoreCase(b)) {
			System.out.println(driver.findElements(By.xpath("//input[@type= 'radio']")).get(i).getAttribute("value"));
			
		}

	}

	}
	
}
