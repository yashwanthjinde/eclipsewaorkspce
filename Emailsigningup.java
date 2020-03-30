package HOMEPAGE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
public class Emailsigningup {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		

			
				
		System.setProperty("webdriver.chrome.driver", "C://Users/JindeYashwanthKumar/selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		        driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		        
		        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("testspecialist68@gmail.com");
		        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("IBM@1234");
		        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		        

			}

		}



