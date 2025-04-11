package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute 
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Ipad");
		
		//xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@name='q'] [@placeholder='Search store']")).sendKeys("Macbook");
		
		//xpath with 'and' 'or' operator
		//driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("Iphone");
		//driver.findElement(By.xpath("//input[@name='q' or @id='small-searchterms']")).sendKeys("Airpods");
		
		//xpath with text() - inner text
		//boolean displaystatus=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		//System.out.println(displaystatus);
		
		//String value=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		//System.out.println(value);
		
		//xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@id, 'll-sear')]")).sendKeys("Mac book");
		
		//xpath with start-with
		//driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Searc')]")).sendKeys("Iphone");
		
		//Chained xpath
	}

}
