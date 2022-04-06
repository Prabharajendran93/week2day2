package week2.day2.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4link {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Link.html");
			driver.manage().window().maximize();
			System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Find where am supposed')]")).getAttribute("href"));
			
			driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
			String btitle = driver.getTitle();
			if(btitle.contains("404")) {
				System.out.println("the page is broken");
			}
			else
			{
				System.out.println("the page is not broken");
			}
			driver.get("http://leafground.com/pages/Link.html");
			driver.findElement(By.xpath("//label[text()='(Interact with same link name)']/preceding-sibling::a")).click();
			Thread.sleep(3000);
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			if (currentUrl.contains("home")) {
				System.out.println("the url contains home");
				
			}
			else
			{
				System.out.println("the url does not contains home");
			
			}
			driver.get("http://leafground.com/pages/Link.html");
			
			
		List<WebElement> links = driver.findElements(By.tagName("a"));
			
			int nlinks = links.size();
			System.out.println("total num of links" + nlinks);
			
	}

}
