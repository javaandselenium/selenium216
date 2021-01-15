package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		
	}

}
