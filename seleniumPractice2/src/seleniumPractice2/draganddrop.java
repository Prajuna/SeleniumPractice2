package seleniumPractice2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class draganddrop {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		//Creating timer
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='post-2669']//div[1]/p/iframe")));
		
        //Creating Webelement for Frame 
		WebElement f=driver.findElement(By.xpath("//*[@id='post-2669']//div[1]/p/iframe"));
		driver.switchTo().frame(f);
		System.out.println("Switching to frame");
				//Creating Actions
		Actions act =new Actions(driver);
		
		//Source Element created
		WebElement source=driver.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
		
		//Target Element created
		WebElement target=driver.findElement(By.xpath("//*[@id='trash']"));

		act.dragAndDrop(source,target).build().perform();
		driver.close();
}

}