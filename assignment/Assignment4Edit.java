package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment4Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prabharajendran26@gmail.com");
		driver.findElement(By.xpath(" //input[contains(@value,'Append')]")).sendKeys("prabha",Keys.TAB); 
	    System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		driver.findElement(By.xpath("//label[contains(text(),'Clear the text')]/following-sibling::input[@name='username']")).clear();
		boolean efield = driver.findElement(By.xpath("//label[contains(text(),'Confirm that')]/following-sibling::input")).isEnabled();
		
		if(efield==true) {
			System.out.println("the feild is enabled");
		}
		else
		{
			System.out.println("the feild is disabled");
		}
		}
		
	}


