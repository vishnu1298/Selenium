package seleniumpractices;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.WebDriver;

public class OpenCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launcher
		//EdgeOptions options = new EdgeOptions();
	    //options.addArguments("user-data-dir=C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		
		//Verify the title
		/*String act_title=driver.getTitle();
		
		if(act_title.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test 1 passed");
		}
		else
		{
			System.out.println("Test 1 failed");
		}*/
		
		//Locator - Linktext/PartialLinktext
		//driver.findElement(By.linkText("Features")).click();
		//driver.findElement(By.partialLinkText("Feat")).click();
		
		//Store front page
		driver.findElement(By.xpath("//*[@id=\"cms-demo\"]/div[2]/div/div[1]/div/a")).click();
		//Verify checkbox
	
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("cb-container")).click();
		
		

	}

}
