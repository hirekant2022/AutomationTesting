package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sel2\\chromedriver.exe");
//		create instance of  chrome web browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://sdlms.deepthought.education/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hirekant2022@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mohan@143");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
}
