package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.EqualsAndHashCode;

public class Assignment2DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@id='username'])[1]")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@id='password'])")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//input[@value='Login'])")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("s");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String fnamelist = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).getText();
		Thread.sleep(2000);
		System.out.println(fnamelist);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String duplLead = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		
		if (duplLead.equals("Duplicate Lead")) {
			System.out.println("is name matched");}
			else {
				System.out.println("name not matched");
			
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String fnameview = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(fnameview);
		Thread.sleep(2000);
		
		if (fnamelist.equals(fnameview)) {
			System.out.println("the name is matched");
		}
		else
		{
			System.out.println("the name is not matched");
			
		}
		driver.close();
	}

	
}
