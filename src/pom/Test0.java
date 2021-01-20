package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	    Test1 t=new Test1(driver);
	    
		driver.navigate().refresh();
		
	   // ele.sendKeys("phone");
		t.userName("phone");
		
	}

}
