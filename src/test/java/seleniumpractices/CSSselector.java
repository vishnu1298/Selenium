package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launcher
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id               tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Iphone");//without tag
		 
		//tag class            tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Samsung");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Samsung");
		
		//tag attribute        tag[attribute='value']
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Redmi");
		//driver.findElement(By.cssSelector("[name='q']")).sendKeys("Redmi");
		
		//tag class attribute  tag.classname[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Oneplus");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Oneplus");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Extension");
	}

}
