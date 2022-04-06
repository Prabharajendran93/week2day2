package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2EditLead {

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
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("p");
	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).click();
		String edittitle = driver.getTitle();
		System.out.println(edittitle);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("wipro");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String cname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(cname);
		
		if (cname.contains("wipro")) {
			System.out.println("title is matched");
		}
		else
		{
			System.out.println("title is not matched");
		}
		driver.close();
		
			
		}
		
	}


