package mouseHover;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuchipudi\\Desktop\\testing\\webdrivers\\chromedriver.exe");
		WebDriver D= new ChromeDriver();	
		
		D.manage().window().maximize();
		
		D.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
	WebElement ele=	D.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act=new Actions(D);
		
		act.moveToElement(ele).perform();
		
		List<WebElement> links=  D.findElements(By.xpath("//div[@class='dropdown-conten']//a"));
		
		int total_count=links.size();
		
		for(int i=0; i<total_count;i++)
		{
			WebElement element=links.get(i);
			
			String text=element.getAttribute("innerHTML");
			
			boolean status=element.isEnabled();
			
			System.out.println("Links name is "+text +"and the link status is "+status);
																															
				if(text.equalsIgnoreCase("Appium"))
				{
						element.click();
			break;  
			}
			
		}
	}

}
