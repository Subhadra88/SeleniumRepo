package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead{
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
	    
	    //Click Lead
	    driver.findElement(By.linkText("Leads")).click();
	
		//create lead
	    driver.findElement(By.partialLinkText("Create")).click();
	 
	  //companyname
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    
		//First Name
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subhadra");
	   
		//enter last name
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("I");
	    
	    //Firstname(Local)
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Subha");
	   
		//Department field
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
	    
	    //Description field
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Basics");
	    
	    //Enter email
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("subhadra.ilayaperumal@gmail.com");
	    
	    //click create lead
	    driver.findElement(By.name("submitButton")).click();
	    
	    //Get title
	    String printTitle1= driver.getTitle();
	    System.out.println(printTitle1);
	    
	    //Duplicate button
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    
	    //Clear ComapanyName and enter new company
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafGround");
	    
	    //clear Names and Enter new Name
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahathi");
		
	    //click create button
	    driver.findElement(By.name("submitButton")).click();
	    
	    //Get title of the Resulting page
	    String printTitle2 = driver.getTitle();
	    System.out.println(printTitle2);
	}

}
