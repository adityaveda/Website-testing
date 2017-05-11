import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;
import com.opencsv.CSVReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class signUpAuto {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\starlord\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Properties prop = new Properties();
		prop.load(new FileInputStream("testdata\\login.properties"));
		driver.get("https://sso.teachable.com/secure/42299/users/sign_up?reset_purchase_session=1");
		
		//testing with valid values
		driver.findElement(By.id("user_name")).sendKeys(prop.getProperty("uv"));
		driver.findElement(By.id("user_email")).sendKeys(prop.getProperty("ev"));
		driver.findElement(By.id("user_password")).sendKeys(prop.getProperty("pv"));
		driver.findElement(By.id("user_password_confirmation")).sendKeys(prop.getProperty("cpv"));
		driver.findElement(By.id("user_agreed_to_terms")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("commit")).click();
		try {
			Thread.sleep(2000);
			WebElement errorElement; 
			errorElement  = driver.findElement(By.id("fields_with_error"));
			assertTrue(!errorElement.isDisplayed());
		}
		try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					driver.findElement(By.id("w4-w1-join-button")).click();
					errorElement  = driver.findElement(By.id("w4-w1-w3-captcha-error"));
				}
				errorElement  = driver.findElement(By.id("w4-w1-w3-captcha-error"));
				assertTrue(!errorElement.isDisplayed());
			}catch(NoSuchElementException e){				
				log.error("Error: Something went wrong with registration..!!");				
			}
			catch(AssertionError e){
				log.error("Error: Valid credentials not accepted on register page..!!!!!test-case no:");
			}
		}
                
    }  
	