package automacao_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
}
}
