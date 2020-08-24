package Pobject;

import java.io.IOException;

import org.testng.annotations.Test;

public class amazonTest extends inicializeBrowser{
	
	@Test
	public void launce() throws IOException, InterruptedException
	
	{
		driver=browser();
		driver.get(prob.getProperty("url"));
		driver.manage().window().maximize();
		
		locators loc=new locators(driver);
		loc.ptext1();
		Thread.sleep(3000);
		loc.move1();
		Thread.sleep(3000);
		loc.move2();
		driver.quit();
	}

}
