package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookAsgn {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//create btn click
	driver.findElement(By.xpath("(//div//a)[3]")).click();
	//fn
	driver.findElement(By.xpath("//div//input[@name='firstname']")).sendKeys("Subhadra");
	//ln
	driver.findElement(By.xpath("//div//input[@name='lastname']")).sendKeys("Ilayaperumal");
	//mob
	driver.findElement(By.xpath("(//div//div//div//input)[11]")).sendKeys("9600060858");
	//pwd
	driver.findElement(By.id("password_step_input")).sendKeys("Mahathi123");
	//Drop downs
	WebElement dd1 = driver.findElement(By.id("day"));
	Select bday=new Select(dd1);
	bday.selectByValue("6");
	
	WebElement dd2 = driver.findElement(By.id("month"));
	Select month=new Select(dd2);
	month.selectByValue("2");
	
	WebElement dd3 = driver.findElement(By.id("year"));
	Select year=new Select(dd3);
	year.selectByValue("1988");
	//click female
	driver.findElement(By.xpath("//span//span//input")).click();
	//signup
	driver.findElement(By.xpath("(//div//button)[3]")).click();
	
	
}
}
