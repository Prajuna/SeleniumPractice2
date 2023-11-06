package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox_pgm {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://demo.automationtesting.in/Register.html");
        System.out.println(driver.findElement(By.id("checkbox2")).isSelected());
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("checkbox2")).isSelected();
        System.out.println(driver.findElement(By.id("checkbox2")).isSelected());
        driver.close();
	}

}
