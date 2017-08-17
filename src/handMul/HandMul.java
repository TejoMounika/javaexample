package handMul;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandMul {

	@Test
public void HandMulWindow() throws InterruptedException{
	
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuchipudi\\Desktop\\testing\\webdrivers\\chromedriver.exe");
	WebDriver D= new ChromeDriver();	
	
	D.manage().window().maximize();
	
	D.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
	
	D.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
String parent_window=D.getWindowHandle();

System.out.println("Before switching title is"+D.getTitle());

D.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
Set<String> s1=D.getWindowHandles();

Iterator<String> i1=s1.iterator();
	while(i1.hasNext()){
		String child_window=i1.next();
		
		if(!parent_window.equalsIgnoreCase(child_window));
		{
			D.switchTo().window(child_window);
			
			Thread.sleep(10000);
			
			System.out.println("After switching title is"+D.getTitle());
			
			D.close();
		}
	}
	D.switchTo().window(parent_window);
	
	System.out.println(D.getTitle());
	
	}
		
		
	}

