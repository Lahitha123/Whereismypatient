package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browserName) {
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		else if(browserName.equals("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
			return driver;
			}
	
	public void OpenAppUrl(String url) {
		driver.get(url);
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void enterValue(WebElement e,String data) {
		e.sendKeys(data);
	}
	
	public void btnClick(WebElement e) {
		e.click();
	}
	
	public void implicitWait() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

	}
	public String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	
	
	public String getValue2DWithHeader(DataTable dataTable, int index, String key) {
		List<Map<String, String>> list = dataTable.asMaps();
		Map<String, String> map = list.get(index);
		String x = map.get(key)
;
		return x;
		}
	public void pressKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	

}
	
