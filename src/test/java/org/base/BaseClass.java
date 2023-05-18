package org.base;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class BaseClass 
{
	public static WebDriver driver;
	public static void getDriver(String str)
	{
		if(str.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
	}
	public static void selectClass(WebElement element,String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public static void UrlLaunch(String url)
	{
		driver.get(url);
	}
	public static WebElement locators(String locator, String value)
	{
		if(locator.equalsIgnoreCase("id"))
		{
			WebElement findelement = driver.findElement(By.id(value));
			return findelement;
		}
		else if(locator.equalsIgnoreCase("name"))
		{
			WebElement findelement = driver.findElement(By.name(value));
			return findelement;
		}
		else
		{
			WebElement findelement = driver.findElement(By.xpath(value));
			return findelement;
		}
	}

	public static void sendText(WebElement element,String KeysToSend)
	{
		element.sendKeys(KeysToSend);
	}
	public static void buttonClick(WebElement element)
	{
		element.click();
	}
	public static void textClear(WebElement element)
	{
		element.clear();
	}
	public static void getTitle()
	{
		String str = driver.getTitle();
		System.out.println(str);
	}
	public static void closeDriver()
	{
		driver.close();
	}
	public static Set<String> windowhandles()
	{
		Set<String> str = driver.getWindowHandles();
		return str;
	}
	public static String windowhandle()
	{
		String str = driver.getWindowHandle();
		return str;
	}
	public static void closeaAllBrowser()
	{
		driver.quit();
	}
	public static void pageSource()
	{
		driver.getPageSource();
	}
	
	public static void generateJVMreport(String jsonpath)
	{
		File f=new File("C:\\Users\\HP\\eclipse-workspace\\CucumberFrameWork\\target");
		Configuration c=new Configuration(f, "Adactin Automation");
		c.addClassifications("Author","Siva");
		c.addClassifications("OS", "Windows 10 pro");
		c.addClassifications("Sprint", "sprint001");
		c.addClassifications("Browser","Chrome");
		ArrayList<String> a1= new ArrayList<String>();
		a1.add(jsonpath);
		ReportBuilder r=new ReportBuilder(a1, c);
		r.generateReports();
	}
	
	public static void screenShot() throws IOException
	{
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		String name = src.getName();
		File f=new File("./Screenshot/"+name+".png");
		FileUtils.copyFile(src, f);
	}
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	public static void getUrl()
	{
		String str = driver.getCurrentUrl();
		System.out.println(str);
	}
	public static void getAtribute(WebElement element,String name)
	{
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
	}

}
