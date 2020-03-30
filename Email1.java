package testNG;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;


	public class Email1 {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.gecko.driver", "C://Users/JindeYashwanthKumar/selenium/geckodriver-v0.26.0-win64/geckodriver.exe");
	        WebDriver driver=new FirefoxDriver();
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
			
			driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Shilpa");
			driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Patil");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sp3696311@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("88shilpa88");
			driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("88shilpa88");
			driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span")).click();
			driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("9703491650");
			driver.findElement(By.xpath("//*[@id=\"gradsIdvPhoneNext\"]/span")).click();
//			driver.findElement(By.xpath("//*[@id=\"code\"]")).sendKeys("");
			Thread.sleep(20000);
			driver.findElement(By.xpath("//span[text()='Verify']")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("patilshilpa21997@gmail.com");
			
		//	Select m1 = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
		//	m1.selectByIndex(4);
			driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("21");
			Select m1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
			m1.selectByIndex(12);
			

			driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1997");
			
			Select m2 = new Select(driver.findElement(By.xpath("//*[@id=\"gender\"]")));
			m2.deselectByIndex(5);
			
			driver.findElement(By.linkText("https://support.google.com/accounts/answer/1733224?hl=en"));
			driver.findElement(By.xpath("//*[@id=\"personalDetailsNext\"]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[2]/div[1]/div[2]/button")).click();
			
			driver.findElement(By.xpath("//*[@id=\"termsofserviceNext\"]/span/span")).click();
			
			
			
			
		}

	}
	

