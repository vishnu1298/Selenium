package seleniumpractices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		//Select a check box
		//driver.findElement(By.xpath("//input[@id=\"saturday\"]")).click();
		
		//Select all check box
		List <WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type=\"checkbox\"]"));
		
		/*for(int i=0; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		System.out.println("Selected all checkboxes");
		*/
		
		//Enhanced loop
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		System.out.println("Selected all checkboxes");
		*/
		
		//Select last 3 check box
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();	
		}
		System.out.println("Selected last 3 checkboxes.");
		*/
		
		//Select first 3 check box
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();		
		}
		System.out.println("Selected first 3 checkboxes.");
		*/
		
		//Unselect the selected check box
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		
		System.out.println("Selected first 3 checkboxes.");
		System.out.println("Unselecting all selected checkboxes...");
		
		}

}
