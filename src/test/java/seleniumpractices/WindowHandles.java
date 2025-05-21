package seleniumpractices;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()=\"OrangeHRM, Inc\"]")).click();
		
		Set<String> WindowIds=driver.getWindowHandles();
		
		//Approach 1
		/*List <String> WindowLists=new ArrayList(WindowIds);
		
		String parentId=WindowLists.get(0);
		String childId=WindowLists.get(1);
		
		//Switch to child window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		//Switch to parent window
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());*/
		
		//Approach 2
		for(String WinId:WindowIds)
		{
			String title=driver.switchTo().window(WinId).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
	}

}
