package seleniumPractice2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class dropDown_pgm {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("wedriver.chrome.driver", "C:\\chrometest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://ultimateqa.com/automation");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Interactions with simple elements")).click();
		//Scrolling a page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		//driver.findElement(By.xpath("//select")).click();
		WebElement dropdown=driver.findElement(By.xpath("//select"));
		Select dobject=new Select(dropdown);
		dobject.selectByValue("audi");
		driver.close();
		
	}

}
