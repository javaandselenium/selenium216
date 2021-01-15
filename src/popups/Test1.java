package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//a[text()='19']")).click();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		driver.close();
	}

}
