package Test; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class App  
{     
	public static void main( String[] args )    
	{          
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\chromedriver.exe");                   
		WebDriver driver=new ChromeDriver();                          
		driver.get("https://www.google.co.in/");           
		driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("pegasystems");                
		} }