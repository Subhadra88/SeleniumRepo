package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {
	public static void main(String[] args) {
		//Launch Browser
				ChromeDriver driver=new ChromeDriver();
				//Load URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				//Max the window
				driver.manage().window().maximize();
				//Login
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				//click CRM/SFA
			    driver.findElement(By.partialLinkText("CRM")).click();
			    //click contacts tab
			    driver.findElement(By.linkText("Contacts")).click();
			    driver.findElement(By.linkText("Create Contact")).click();
			    driver.findElement(By.id("firstNameField")).sendKeys("Tharika");
			    driver.findElement(By.id("lastNameField")).sendKeys("A");
			    driver.findElement(By.name("submitButton")).click();
			    String firstName=driver.findElement(By.id("viewContact_firstName_sp")).getText();
			    System.out.println(firstName);
			    System.out.println(driver.getTitle());
			    driver.close();
			    
	}

}
