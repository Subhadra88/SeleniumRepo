package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

		public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Login
		driver.findElement(By.className("decorativeSubmit")).click();
				
		//crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Leads
		 driver.findElement(By.linkText("Leads")).click();
				 
		//Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 //FIRST name
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Subhadra");
		 
		 //find leads
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		 //click first lead
		 driver.findElement(By.xpath("//a[text()='11212']")).click();

		 //verify title
		 System.out.println(driver.getTitle());
		 
		 //edit
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 
		 //change company name
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.xpath("updateLeadForm_companyName")).sendKeys("TestLeaf");
		//update
		driver.findElement(By.name("submitButton")).click();
		String compName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(compName);
		Thread.sleep(5000);
		driver.close();



	}

}
