package Gmail_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Inbox_page {
	public  WebDriver Driver;
	public Inbox_page(WebDriver Driver) {
		this.Driver=Driver;
	}	

	
	
By compose= By.xpath("//div[@class='z0']/div");
By receivermailid= By.name("to");
By subject= By.xpath("//input[@class='aoT']");
By message=By.cssSelector("div[role='textbox']");
By emoji1=By.xpath("//tr[@class='btC']");
By emoji2=By.xpath("//div[@class='bAK']/div[3]/div");
By linkoption=By.xpath("//div[@class='bAK']/div");
By emoji3=By.xpath("//div[@class='a8E']");
By emoji4=By.xpath("//div[@class='wVboN'][3]/button");
By emoji5=By.xpath("//div[@class='a8C']/button");
By emoji6=By.xpath("//div[@class='bAK']/div[1]/div");
By sent=By.xpath("//div[@class='dC']/div[@role='button'][1]");
By option1=By.xpath("//div[@class='aio UKr6le']");
By option2=By.xpath("//div[@class='aio UKr6le']/span/a");
By option3=By.xpath("//div[@class='aio UKr6le']/span");
By emoji0=By.xpath("//div[@class='a8E']/button");
By attachmentbox=By.xpath("//div[@class='Kj-JD LW-JD']");
By Linkname=By.xpath("//input[@id='linkdialog-text']");
By Linkurl=By.xpath("//input[@id='linkdialog-onweb-tab-input']");
By ok=By.xpath("//button[@name='ok']");
	
By Delete =By.xpath("//div[@class='og T-I-J3']");


	public  WebElement compose() {
	return	Driver.findElement(compose);
		}
	
	public  WebElement receivermailid() {
		return	Driver.findElement(receivermailid);
			}
	public  WebElement subject() {
		return	Driver.findElement(subject);
			}
	
	public  WebElement message() {
		return	Driver.findElement(message);
			}
	
	public  WebElement emoji1() {
		return	Driver.findElement(emoji1);
			}
	public  WebElement emoji2(WebElement emoji) {
		return	emoji.findElement(emoji2);
			}
	
	public  List<WebElement> emoji0(WebElement w1) {
		return	w1.findElements(emoji0);
			}
	
	
	
	
	public  WebElement emoji3() {
		return	Driver.findElement(emoji3);
			}
	public  List<WebElement> emoji4(WebElement w1 ) {
		return	w1.findElements(emoji4);
			}
	public  WebElement emoji5(WebElement w1) {
		return	w1.findElement(emoji5);
			}
	public  WebElement emoji6(WebElement emoji) {
		return	emoji.findElement(emoji6);
			}
	public  WebElement sent(WebElement emoji) {
		return	emoji.findElement(sent);
			}
	public  List<WebElement> option1() {
		return	Driver.findElements(option1);
			}
	public  List<WebElement> option2() {
		return	Driver.findElements(option2);
			}
	public  List<WebElement> option3() {
		return	Driver.findElements(option3);
			}
	
	public  List<WebElement> linkoption(WebElement emoji) {
		return	Driver.findElements(linkoption);
			}
	
	public  WebElement attachmentbox() {
		return	Driver.findElement(attachmentbox);
			}

	public  WebElement Linkname(WebElement we1) {
		return	we1.findElement(Linkname);
			}
	public  WebElement Linkurl(WebElement we1) {
		return	we1.findElement(Linkurl);
			}
	public  WebElement Ok(WebElement we1) {
		return	we1.findElement(ok);
			}
	public  WebElement Delete(WebElement emoji) {
		return	emoji.findElement(Delete);
			}
}
