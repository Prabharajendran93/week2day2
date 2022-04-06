package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("PRABHA");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ARAVIND KUMAR");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]/following-sibling::input")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//input[contains(@id,'input')]")).sendKeys("prabha");
		
		WebElement Element = driver.findElement(By.xpath("//select[@id='day']"));
		Select birth = new Select(Element);
		birth.selectByValue("26");
		
		WebElement Element1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select mon = new Select(Element1);
		mon.selectByVisibleText("Jun");
		
		
		WebElement Element2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select yea = new Select(Element2);
		yea.selectByValue("1993");
		
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
		
		
		
		
		

	}

}
