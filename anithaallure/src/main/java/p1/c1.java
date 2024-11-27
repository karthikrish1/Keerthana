package p1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class c1 {
	
	@Description("practice website")
	@Feature("visiting")
	@Severity(SeverityLevel.NORMAL)


	@Test
	public void d()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("https://www.letskodeit.com/practice");
	}

}
