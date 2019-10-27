package humanity.test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.tests.LogInTest;

public class HumanityTest {
	
	public static final String URL = "https://www.humanity.com/";

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.humanity.com/");
		
		// Method for LogIn
		wd.findElement(By.xpath("//p[contains(text(),'LOGIN')]")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//input[@id='email']")).sendKeys("bojancuturilo");
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("Branislav01");
		Thread.sleep(1000);
		wd.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		Thread.sleep(3000);
		
		
		// Add new employee
		wd.findElement(By.xpath("//a[@id='sn_staff']//span[@class='primNavQtip__inner']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//button[@id='act_primary']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@id='_asf1']")).sendKeys("Petar");
		wd.findElement(By.xpath("//input[@id='_asl1']")).sendKeys("Peric");
		wd.findElement(By.xpath("//input[@id='_ase1']")).sendKeys("petarperic123@gmail.com");
		wd.findElement(By.xpath("//button[@id='_as_save_multiple']")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("//a[@id='sn_staff']//span[@class='primNavQtip__inner']")).click();
		
		
		// Method for Clock in / out
		wd.findElement(By.xpath("//a[@id='sn_timeclock']//span[@class='primNavQtip__inner']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//a[@id='tc_tl_ci']")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//a[@id='tc_tl_co']")).click();

		
	}

}
