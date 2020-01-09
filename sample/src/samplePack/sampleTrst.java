package samplePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleTrst {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\amazon\\WebDriver drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		

	}

}
