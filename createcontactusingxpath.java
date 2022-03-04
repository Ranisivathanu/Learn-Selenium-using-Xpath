package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createcontactusingxpath {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		String title=driver.getTitle();
		System.out.println(title);
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		 String leadpage=driver.getTitle();
		 System.out.println(leadpage);
		 driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
	     driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("rani");
		 driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("sabarish");
		 driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("sara");
		 driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("sabari");
		 driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Engineering");
		 driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Music lover");
		 driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("arssabari143@gmail.com");
		 
		 WebElement State=driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		 Select province =new Select(State);
		 province.selectByVisibleText("New York");
		 
		 
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 
		 String createcontact =driver.getTitle();
		 System.out.println("createcontact");
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		 WebElement description=driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']"));
		 description.clear();
		 driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).sendKeys("Learning in testleaf");
		 
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 
		 String lead =driver.getTitle();
		 System.out.println("lead");

}}
