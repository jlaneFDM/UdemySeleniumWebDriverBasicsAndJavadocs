package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {
		// setup driver
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		// use driver to retrieve site properties
		driver.get("https://www.amazon.ca");
		String title = driver.getTitle();
		System.out.println("Title: " + title + " Title length: " + title.length());
		driver.close();// closes current tab only

	}

}
