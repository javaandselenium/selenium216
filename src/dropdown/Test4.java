package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement ele = driver.findElement(By.id("gh-cat"));
		Select s=new Select(ele);
		s.selectByIndex(5);
		s.selectByIndex(3);
		s.selectByIndex(7);
		System.out.println(s.getFirstSelectedOption());
		List<WebElement> selopt = s.getAllSelectedOptions();
		for(WebElement b:selopt)
		{
			System.out.println("only selected option "+b.getText());
		}
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		for(WebElement a:option)
		{
			System.out.println(a.getText());
		}
		driver.close();
		
		
		
		
		
		

	}

}
