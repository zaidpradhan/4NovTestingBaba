package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {

	 // this is for firefox
	
	/*@Test
	public void launchurl1() {
		
		WebDriverManager.chromedriver().setup();  // only single this line handle the browser control with the help og webdrivermanager dependency
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testingbaba.com/old/");
	}*/
	
	//this is edge driver
	
	@Test
	public void launchurl1() {
		
	//	WebDriverManager.edgedriver().setup();  // only single this line handle the browser control with the help og webdrivermanager dependency
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://testingbaba.com/old/");
	}
}
