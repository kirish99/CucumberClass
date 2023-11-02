package org.helperClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement element;
	
	public static void launchChromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void launchEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	public static void launchFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	public static void windowMax() {
		driver.manage().window().maximize();
	}
	
	public static void windowMini() {
		driver.manage().window().minimize();
	}
	
	public static void passUrl(String url) {
		driver.get(url);
	}
	
	public static void enterText(String value) {
		element.sendKeys(value);
	}
	
	public static void elementalClick() {
		element.click();
	}
	
	public static String getTitle() {
		String title=driver.getTitle();
		return title;
	}
	
	public static String getPassedValue(String value) {
		String v=element.getAttribute(value);
        return v;
	}
	
//	public static void waits() {
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	}
//	
	public static String currentUrl() {
	    String currenturl=driver.getCurrentUrl();
        return currenturl;
	}
	
	public static void takeScreenShot() {
		TakesScreenshot ts=(TakesScreenshot)driver;
         File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
         File f=new File("C:\\Users\\user\\eclipse-workspace\\Sample\\saved screenshot");
         try {
			FileUtils.copyFile(screenshotAs,f);
		} catch (IOException e) {
		}
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void moveToElement() {
		Actions a=new Actions(driver);
	      a.moveToElement(element).perform();
	}
	
	public static void actionClick() {
		Actions a=new Actions(driver);
        a.click().perform();
	}
	
	public static void doubleClick() {
		Actions a=new Actions(driver);
        a.doubleClick().perform();
	}
	
	public static void contextClick() {
		Actions a=new Actions(driver);
        a.contextClick().perform();
	}
	
	public static void build() {
		Actions a=new Actions(driver);
        a.build().perform();
	}
	
	public static void clickAndHold() {
		Actions a=new Actions(driver);
		a.clickAndHold().perform();
	}
	
	public static void tick(Interaction value) {
		Actions a=new Actions(driver);
		a.tick(value).perform();
	}
	
	public static void release() {
		Actions a=new Actions(driver);
        a.release().perform();
	}
	
	public static void pause() {
		Actions a=new Actions(driver);
		a.pause(10);
	}
	
	public static void alertOkBtn() {
		driver.switchTo().alert().accept();
	}
	
	public static void alertCancleBtn() {
		driver.switchTo().alert().dismiss();
	}
	
	public static void alertGetText() {
		driver.switchTo().alert().getText();
	}
	
	public static void pageSource() {
		driver.getPageSource();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void refersh() {
	    driver.navigate().refresh();
	}
	
	public static void back() {
		driver.navigate().back();
	}
	
	public static void forward() {
		driver.navigate().forward();		
	}
	
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	public static void isDisplayed() {
		element.isDisplayed();
	}
	
	public static void isEnabled() {
		element.isEnabled();
	}
	
	public static void isSlected() {
		element.isSelected();
	}
	
	public static void sumit() {
		element.submit();
	}
	
    public static void driverWait() {
		try {
			driver.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
    public static void driverNotifyAll() {
		driver.notifyAll();
	}
	
	public static void driverNotify() {
		driver.notify();
	}
	
	public static void jsExecutor(String value, Object value1) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(value,value1);
	}
	
	public static void jsGetClass() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.getClass();
	} 
	
	public static void jsWait() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		try {
			js.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getLocation() {
	    element.getLocation();
	}
	
	//private void notify() {
		// TODO Auto-generated method stub

	//}
	
	//private void notifyAll() {
		// TODO Auto-generated method stub

	//}
	
	public static void getOptins() {
		Select s=new Select(element);
		s.getOptions();
	}
	
	public static void getAllSelectedOptions() {
		Select s=new Select(element);
		s.getAllSelectedOptions();
	}
	
	public boolean equals(Object obj) {
		Select s=new Select(element);
		return s.equals(obj);
	}
	
	public static void getWrappedElement() {
		Select s=new Select(element);
		s.getWrappedElement();
	}
	
	public static void selectByIndex(int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	public static void selectByVisibleText(String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void selectByValue(String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	public static void getFirstSelectedOptions() {
		Select s=new Select(element);
		s.getFirstSelectedOption();
	}
	
	public static void getAutoDelay() {
		try {
			Robot r=new Robot();
			r.getAutoDelay();
		} catch (AWTException e) {
			
		}
	}
	
	public static void mousePress(int buttons) {
		try {
			Robot r=new Robot();
			r.mousePress(buttons);
		} catch (AWTException e) {
			
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
