package HOMEPAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users/JindeYashwanthKumar/selenium/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		for(int j=0;j<2;j++) {
			if(j==0) {
				driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(j).click();	
			}
			else if(j==1) {
				driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(j).click();
			}
			else {
				driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(j).click();
				driver.findElement(By.xpath("//*[@id=\"MultiCityModelAlert\"]")).click();	
			}
			driver.findElement(By.xpath("//input[@value=\"Departure City\"]")).click();
			driver.findElement(By.xpath("//a[@text=\"Coimbatore (CJB)\"]")).click();;
			driver.findElement(By.xpath("(//a[@text=\"Goa (GOI)\"])[2]")).click();
			driver.findElement(By.partialLinkText("24")).click();	
		boolean returndate=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date2\"]")).isEnabled();
		if(returndate==true) {
			driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date2\"]")).click();;
			driver.findElement(By.partialLinkText("25")).click();
		}
		else {
			System.out.println("return date not allow");
		}
		int count = driver.findElements(By.xpath("//*[@id='discount-checkbox']/div")).size();
		System.out.println(count);
		for(int i=0;i<count-1;i++ ) {
			driver.findElements(By.xpath("//*[@id='discount-checkbox']/div")).get(i).click();
			boolean adult = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")).isEnabled();
			boolean child =  driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Child\"]")).isEnabled();
			boolean infant =  driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Infant\"]")).isEnabled();
			driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
			if ( adult =true) {Select m1 = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
			m1.selectByIndex(4);
			System.out.println("adult is enable");}
			else{System.out.println("adult is diasable");}
			if ( adult =true) {Select m2 = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Child\"]")));
			m2.selectByIndex(2);
			System.out.println("child is enable");}
			else{System.out.println("child is diasable");}
			if ( adult =true) {Select m3 = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Infant\"]")));
			m3.selectByIndex(2);
			System.out.println("infant is enable");}
			else{System.out.println("infant is diasable");}
			}
		if(j==2) {
			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation2_CTXT\"]")).click();
			driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[9]/div[1]/div[1]/div/div[1]/div[2]"
					+ "/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[4]/a")).click();
			driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[9]/div[1]/div[1]/div/div[1]"
					+ "/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[7]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date3\"]")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation3_CTXT\"]")).click();
			driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[9]/div[2]/div[1]/div/div[1]"
					+ "/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[2]/li[2]/a")).click();
			driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[9]/div[2]/div[1]/div/div[2]"
					+ "/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[4]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date4\"]")).click();
			driver.findElement(By.partialLinkText("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[3]/a")).click();		
		}
		Select cur =new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));
		cur.selectByVisibleText("INR");
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
		driver.navigate().back();
	}
	}

}



