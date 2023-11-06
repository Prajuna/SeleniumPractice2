package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://demo.automationtesting.in/Register.html");
    int count= driver.findElements(By.name("radiooptions")).size();
    System.out.println(count);
    for(int i=0;i<=count;i++)
    {
    	driver.findElements(By.name("radiooptions")).get(1).click();
    }
    driver.quit();
   
	}

}
