package Weekday3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	
	
	}

}