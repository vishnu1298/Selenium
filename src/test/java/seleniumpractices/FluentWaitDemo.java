package seleniumpractices;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))    //Total wait time
				.pollingEvery(Duration.ofSeconds(5))	//Poll every 5 seconds
				.ignoring(Exception.class);//Ignore exception
			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Method 1
		/*WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));
		element.sendKeys("Admin");
		
		System.out.println("Success");*/
		
		//Method 2
		WebElement txtUsername = mywait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		}	
		});
		txtUsername.sendKeys("Admin2");
	}

}