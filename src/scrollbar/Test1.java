package scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Blog']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y=loc.getY();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		ele.click();
		Thread.sleep(3000);
		driver.close();
	}

}
