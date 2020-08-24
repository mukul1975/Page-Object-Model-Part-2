package Pobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class locators {
	WebDriver driver;
	@FindBy(how=How.ID,using="twotabsearchtextbox")
	WebElement ptext;
	
	@FindBy(xpath="//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]")
	WebElement move;
	@FindBy(how=How.XPATH,using="//span[text()='Find a Gift']")
	WebElement gift;
	
	public locators(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ptext1()
	{
		Actions ac=new Actions(driver);
//		ac.moveToElement(move).build().perform();
		ac.moveToElement(ptext).click().keyDown(Keys.SHIFT).sendKeys("computer").build().perform();
//		driver.findElement(ptext).sendKeys("computer");
	}
	public void move1()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(move).build().perform();
	}
	
	public void move2()
	{
		Actions ac =new Actions(driver);
		ac.moveToElement(gift).click().build().perform();
	}
}
