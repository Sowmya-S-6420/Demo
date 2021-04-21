package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tryy {
	public static void main(String[] args)    
	{ 
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\chromedriver.exe");                   
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F");
		String expectedTitle = "Login | Udemy";
	   
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			
		
		driver.findElement(By.xpath("//*[@id=\"email--1\"]")).sendKeys("sowmyas.citcse2017@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("Dhoni@007");
		driver.findElement(By.xpath("//*[@id=\"submit-id-submit\"]")).click();
		System.out.println(actualTitle);
		}
		else {
			System.out.println("You're on the different page it seems");
		}
	}

}
