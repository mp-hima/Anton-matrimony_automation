package anton_matrimony;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class register_parameterization {

    @Test
    @Parameters({"name","email","mobile","place"})
    public void registerUser(String name,String email,String mobile,String place) {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://testing-matrimony.rogersoft.com/register");
    	driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("phone_number")).sendKeys(mobile);
		driver.findElement(By.id("place")).sendKeys("Kochi");
		
		// Profile For
		Select profile = new Select(driver.findElement(By.id("profile_for")));
		profile.selectByVisibleText("Myself");

		// Gender
		driver.findElement(By.id("female")).click();

		// Phone Code
		Select phoneCode = new Select(driver.findElement(By.id("phone_code")));
		phoneCode.selectByVisibleText("+91 (In)");

		// Country
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");

		// State
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Kerala");

		// District
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement district = wait.until(
		        ExpectedConditions.elementToBeClickable(By.id("district"))
		);

		Select districtSelect = new Select(district);
		districtSelect.selectByVisibleText("Ernakulam");

		// Religion
		Select religion = new Select(driver.findElement(By.id("religion")));
		religion.selectByVisibleText("Hindu");

		// Caste
		Select caste = new Select(driver.findElement(By.id("caste")));
		caste.selectByVisibleText("Ezhava");
		
		// DOB
		driver.findElement(By.name("dob")).click();

		driver.findElement(By.xpath("//div[text()='2026']")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/i")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/i")).click();

		driver.findElement(By.xpath("//div[text()='1999']")).click();

		driver.findElement(By.xpath("//div[text()='Nov']")).click();

		driver.findElement(By.xpath("//div[text()='4']")).click();

		driver.findElement(By.xpath("//button[text()='Ok']")).click();


		driver.findElement(By.id("accept")).click();
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
    }
}

