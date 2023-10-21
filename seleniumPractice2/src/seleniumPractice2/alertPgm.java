package seleniumPractice2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertPgm {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		//ALert pop up
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		 Alert at=wait1.until(ExpectedConditions.alertIsPresent());
		 System.out.println(at.getText());
		 at.accept(); 
		 
		 //Alert with OK & Cancel
		 driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		 driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		 driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		 Alert at1=wait1.until(ExpectedConditions.alertIsPresent());
		 at1.dismiss();
		 String status=driver.findElement(By.id("demo")).getText();
		 System.out.println(status);
		 
		 //Prompt
		 driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		 driver.findElement(By.linkText("Alert with Textbox")).click();
		 driver.findElement(By.xpath("//div[@id='Textbox']/button")).click();
		 Alert at2=wait1.until(ExpectedConditions.alertIsPresent());
		 at2.sendKeys("Testdata");
		 at2.accept();
		 String status1=driver.findElement(By.id("demo1")).getText();
		 System.out.println(status1);
		 
	}

}
