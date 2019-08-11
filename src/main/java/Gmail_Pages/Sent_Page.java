package Gmail_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Sent_Page {
	WebDriver Driver;
	
	public Sent_Page(WebDriver Driver){
		
		this.Driver=Driver;
	}
	

	
	By sentmails=By.xpath("//div[2]/div/div[@class='Cp']/div/table/tbody");
	By requiredsentmail=By.xpath("//tr[@jsmodel='nXDxbd']/td[6]/div/div/div/span/span");
	
	
	public  WebElement sentmails() {
		return	Driver.findElement(sentmails);
			}
		
	
	
	public  List<WebElement> requiredsentmail() {
		return	Driver.findElements(requiredsentmail);
			}
	public  List<WebElement> requiredsentmail(WebElement we23) {
		return	we23.findElements(requiredsentmail);
			}
	
}

