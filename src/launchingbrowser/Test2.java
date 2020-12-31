package launchingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.myntra.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();

	}

}
