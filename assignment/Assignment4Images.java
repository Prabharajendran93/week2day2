package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		//click on the image to go to home page
		driver.findElement(By.xpath("//label[contains(text(),'Click on this image')]/following-sibling::img")).click();
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("home")) {
			System.out.println("the url contains home");
		}
		else
		{
			System.out.println("the url does not contain home");
		}
		driver.get("http://leafground.com/pages/Image.html");
		
		//am i broken image
		
		WebElement bimage = driver.findElement(By.xpath("//label[contains(text(),'Am I Broken ')]/following-sibling::img"));
		
		if (bimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("the image is broken");
		}
		else
		{
			System.out.println("the image is not broken");
			
		}
		
		//click me using keyboard or mouse
		
		driver.findElement(By.xpath("//label[contains(text(),'Click me using Keyboard')]/following-sibling::img")).click();
		
	}

}
