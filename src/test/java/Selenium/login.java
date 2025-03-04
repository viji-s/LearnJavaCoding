package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	public static void main(String[] args) {
	   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60 , TimeUnit.SECONDS);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.print("Successfully completed");

		//driver.findElement(By.)


	}

 
}
