package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;


public class hooks {
	
	WebDriver driver=new FirefoxDriver();
    @Before
	public void before() {
		
	}
}
