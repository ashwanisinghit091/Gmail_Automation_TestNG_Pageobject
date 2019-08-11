package Gmail;

import org.testng.annotations.Test;

import Gmail_Pages.Inbox_page;
import Gmail_Pages.Sent_Page;
import helper_pac.Hold;

import java.awt.AWTException;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Gmail_Login2 extends Base{

	
	@Test
	public static void Gmaill2() throws IOException, AWTException, InterruptedException{
		Inbox_page ip=new Inbox_page(Driver);
		
		ip.compose().click();
        ip.receivermailid().sendKeys(pr.getProperty("receiverusername1"));;
	//	Driver.findElement(By.name("to")).sendKeys("");//put receiver mail id
		//Driver.findElement(By.xpath("//input[@class='aoT']")).sendKeys("Automated Mail");
		ip.subject().sendKeys("Automated Mail");
		Hold.waitt(Driver, By.xpath("//tr[@class='btC']"));
		WebElement emoji=ip.emoji1();
		Hold.waitt(Driver, By.xpath("//div[@class='bAK']/div"));
		int size=ip.linkoption(emoji).size();
		for(int i=0;i<size;i++) {
		String text=ip.linkoption(emoji).get(i).getAttribute("command");
		if(text.equalsIgnoreCase("+link")) {
			
			ip.linkoption(emoji).get(i).click();
			
	}
	
	}
	WebElement we1=	ip.attachmentbox()	;
	ip.Linkname(we1).sendKeys("Happy Bday");
	
	ip.Linkurl(we1).sendKeys("www.fb.com");
	ip.Ok(we1).click();
	
	ip.sent(emoji).click();
	
	int size1=ip.option1().size();
	

	for(int k=0;k<size1;k++) {
	String Option=	ip.option2().get(k).getAttribute("title");
		
	if(Option.equalsIgnoreCase("Sent")) {
	ip.option3().get(k).click();
		}}

	Hold.waitt(Driver, By.xpath("//div[2]/div/div[@class='Cp']/div/table/tbody"));
	Sent_Page sp=new Sent_Page(Driver);
		WebElement we23=sp.sentmails();
		for(int l=0;l<sp.requiredsentmail(we23).size();l++) {
		String Subject=sp.requiredsentmail(we23).get(l).getText();
		
		if(Subject.equalsIgnoreCase("Automated Mail")) {
			sp.requiredsentmail(we23).get(l).click();	
		}
		}
	
	}
}
