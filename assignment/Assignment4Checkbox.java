package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Checkbox {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		//select the languages that you know
		driver.findElement(By.xpath("//label[contains(text(),'Select the languages')]/following-sibling::input")).click();
		
		//confirm Selenium is checked
		
		boolean selected2 = driver.findElement(By.xpath("//label[contains(text(),'Confirm Selenium')]/following-sibling::input")).isSelected();
		if(selected2==true)
		{
			System.out.println("the selenium is checked");
		}
		else
		{
			System.out.println("the selenium is not checked");
		}
		
		//deselect only checked
		
		driver.findElement(By.xpath("(//label[contains(text(),'DeSelect only checked')]/following-sibling::input)[2]")).click();
		
		
		//select all below checkboxes
		driver.findElement(By.xpath(" //div[@class='example'][4]//input[1]")).click();
		driver.findElement(By.xpath(" //div[@class='example'][4]//input[2]")).click();
		driver.findElement(By.xpath(" //div[@class='example'][4]//input[3]")).click();
		driver.findElement(By.xpath(" //div[@class='example'][4]//input[4]")).click();
		driver.findElement(By.xpath(" //div[@class='example'][4]//input[5]")).click();
		driver.findElement(By.xpath(" //div[@class='example'][4]//input[6]")).click();
		driver.close();
	}
	

}
