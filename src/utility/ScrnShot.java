	package utility;

	import java.io.File;


	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;


	public class ScrnShot {

		public static void captureScreenshot(WebDriver d, String screenshot) {
			// TODO Auto-generated method stub
			try {
				TakesScreenshot TS=(TakesScreenshot)d;
				File source=TS.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source, new File("./screenshot/"+screenshot+".png"));
				
				System.out.println("take screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking screen shot");
			
		}

	}
	}



