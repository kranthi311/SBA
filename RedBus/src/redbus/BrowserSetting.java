package redbus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserSetting
{
	public static WebDriver driver;

	public static WebDriver browser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium sba\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		return driver;
	}
}
