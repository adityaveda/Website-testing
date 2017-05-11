import java.net.HttpURLConnection;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

import java.net.URL;
public class TestingWiki {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\starlord\\Downloads\\geckodriver.exe");

		// TODO Auto-generated method s	tub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
    	System.out.println(driver.getTitle());

		//checking images and whether they have alt-text
        List<WebElement> imageList = driver.findElements(By.tagName("img"));

        for(WebElement imageElement : imageList){   
        	String altValue = imageElement.getAttribute("alt"); 
        	if(altValue != null && !altValue.equals("")){
        		// image has alt attribute
        		System.out.println("Alt found as : "+ altValue);
        	}
        	else{
        		System.out.println("Missing Alt for src : "+imageElement.getAttribute("src"));
        	}
        }                              
		Thread.sleep(2000);
