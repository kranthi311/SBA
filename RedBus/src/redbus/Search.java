package redbus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search
{
	public static WebDriver driver;

	@BeforeMethod
	public void start()
	{
		driver=BrowserSetting.browser();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	public void pagefunctions() throws IOException
	{
		WebElement we1=driver.findElement(By.xpath("//input[@id='src']"));
		//WebElement we1=driver.findElement(By.id("src"));
		we1.click();
		we1.sendKeys(ExcelUtilis.excel("RedBus", 0, 0));
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li")).click();
		WebElement src=driver.findElement(By.xpath("//li[@class='selected']"));
		src.click();
		
		WebElement we2=driver.findElement(By.id("dest"));
		we2.click();
		we2.sendKeys(ExcelUtilis.excel("RedBus", 0, 1));
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[6]")).click();
		driver.findElement(By.id("search_btn")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[6]/a")).click();
		
		WebElement we3=driver.findElement(By.xpath("//*[@id='11605599']/div/div[1]/div[1]/div[1]/div[1]"));
		String output = we3.getText();
		System.out.println(output);
	}
	
	@AfterMethod()
	public void exit()
	{
		//driver.close();
	}
}
