package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement d1 = driver.findElement(By.id("dropdown1"));
		Select s1 = new Select(d1);
		s1.selectByIndex(2);
	
		
		WebElement d2 = driver.findElement(By.name("dropdown2"));
		Select s2 = new Select(d2);
		s2.selectByVisibleText("UFT/QTP");
		
		
		WebElement d3 = driver.findElement(By.name("dropdown3"));
		Select s3 = new Select(d3);
		s3.selectByValue("3");
		
		
		WebElement d4 = driver.findElement(By.className("dropdown"));
		Select s4 = new Select(d4);
		int size = s4.getOptions().size();
		System.out.println(size);
		
		driver.findElement(By.xpath("(//Select)[5]")).sendKeys("Loadrunner");
		
		WebElement d5 = driver.findElement(By.xpath("(//Select)[5]/following::select"));
		Select s5 = new Select(d5);
		s5.selectByValue("2");
		
		
	}

}
