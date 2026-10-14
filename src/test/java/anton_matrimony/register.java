package anton_matrimony;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class register {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testing-matrimony.rogersoft.com/register");
		driver.findElement(By.id("name")).sendKeys("Heera");
		WebElement profilefor = driver.findElement(By.id("profile_for"));
		Select obj1=new
		Select(profilefor);
		obj1.selectByVisibleText("Myself");
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("email")).sendKeys("heeramp@gmail.com");
		Thread.sleep(2000);
		WebElement phonecode = driver.findElement(By.id("phone_code"));
		Select obj2=new
				Select(phonecode);
		obj2.selectByVisibleText("+91 (In)");		
		Thread.sleep(2000);
		WebElement phonenumber = driver.findElement(By.id("phone_number"));
		
		
		phonenumber.clear();
		phonenumber.sendKeys("7034448193");
		WebElement dob= driver.findElement(By.name("dob"));
		dob.click();
		driver.findElement(By.xpath("//*[text()='2026']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/i")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/i")).click();
		driver.findElement(By.xpath("//*[text()='1999']")).click();
		driver.findElement(By.xpath("//*[text()='Nov']")).click();
		driver.findElement(By.xpath("//*[text()='4']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		WebElement country = driver.findElement(By.id("country"));
		Select obj3=new
				Select(country);
		obj3.selectByVisibleText("India");
		WebElement state = driver.findElement(By.id("state"));

		Select obj4 = new Select(state);
		obj4.selectByVisibleText("Kerala");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement district = wait.until(
		    ExpectedConditions.elementToBeClickable(By.id("district"))
		);

		Select districtSelect = new Select(district);
		districtSelect.selectByVisibleText("Ernakulam");
		driver.findElement(By.id("place")).sendKeys("Kochi");
		WebElement religion = driver.findElement(By.id("religion"));
		Select obj6=new
				Select(religion);
		obj6.selectByVisibleText("Hindu");
		WebElement caste = driver.findElement(By.id("caste"));
		Select obj7=new
				Select(caste);
		obj7.selectByVisibleText("Ezhava");
		driver.findElement(By.id("accept")).click();
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		
		//driver.quit();
	}
	
	
}
