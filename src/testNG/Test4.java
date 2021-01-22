package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {
	@DataProvider
	public Object[][] getdata() {
		Object[][] a=new Object[2][2];
		a[0][0]="afdgffhhhghg";
		a[0][1]="ghghghaghgg";
		a[1][0]=878966786;
		a[1][1]=748685687;
		return a;
	
		}
		@Test(dataProvider = "getdata")
		public void login(String us,String pwd) {
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(us);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pwd);	
		}
		
		
	
		
	}


