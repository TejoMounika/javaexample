package screenshot;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScrnShot;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuchipudi\\Desktop\\testing\\webdrivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver(); 
		
		d.manage().window().maximize();
		
		d.get("http://www.gmail.com");
		
		ScrnShot.captureScreenshot(d, "browser started");
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		d.findElement(By.cssSelector("#identifierId")).sendKeys("automationselenium0@gmail.com");
		
		ScrnShot.captureScreenshot(d, "username entered");
		
	}

}
