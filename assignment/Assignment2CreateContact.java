package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2CreateContact {

	private static final String Select = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@id='username'])[1]")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@id='password'])")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//input[@value='Login'])")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("PRABHA");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("ARAVIND");
		driver.findElement(By.xpath("//input[contains(@id,'firstNameLocal')]")).sendKeys("PRABHA");
		driver.findElement(By.xpath("//input[contains(@id,'lastNameLocal')]")).sendKeys("ARAVIND");
		driver.findElement(By.xpath("//input[contains(@id,'departmentName')]")).sendKeys("EEE");
		driver.findElement(By.xpath("//textarea[contains(@id,'description')]")).sendKeys("ASSISTANT");
		driver.findElement(By.xpath("//input[contains(@id,'primaryEmail')]")).sendKeys("prabha@gmail.com");
		
		WebElement Element = driver.findElement(By.xpath("//select[contains(@id,'generalStateProvinceGeoId')]"));
		Select state = new Select(Element);
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[contains(@value,'Create Contact')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//textarea[contains(@id,'description')]")).clear();
		driver.findElement(By.xpath("//textarea[contains(@id,'importantNote')]")).sendKeys("id");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
	}

}
