package Gmail;


import org.testng.annotations.Test;

import Gmail_Pages.Inbox_page;
import Gmail_Pages.Sent_Page;
import helper_pac.ClickScreenshot;
import helper_pac.Hold;
import helper_pac.Upload;

import java.awt.AWTException;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Gamil_Login extends Base{

	
	

	@Test
	public static void Gmail() throws IOException, AWTException, InterruptedException {
		Inbox_page ip=new Inbox_page( Driver);
		ip.compose().click();
//Thread.sleep(4000);
		
		Hold.waitt(Driver, By.name("to"));
		
		
		
		
		ip.receivermailid().sendKeys(pr.getProperty("receiverusername1"));
		ip.subject().sendKeys("Automated mail");
		ip.message().sendKeys("Do Not Reply as it is automated generated mail");
		//.sleep(4000);
		Hold.waitt(Driver, By.xpath("//tr[@class='btC']"));
		WebElement emoji=ip.emoji1();
		//Thread.sleep(4000);
		Hold.waitt(Driver, By.xpath("//div[@class='bAK']/div[3]/div"));
		ip.emoji2(emoji).click();
		
	
	
	WebElement w1=ip.emoji3();
	int size=	ip.emoji0(w1).size();
		
		for(int i=0;i<size;i++){
			
			String emojitype=ip.emoji0(w1).get(i).getAttribute("title");
			
					
			
			if(emojitype.equalsIgnoreCase("Show nature emoticons")) {
				//w1.findElements(By.xpath("//div[@class='a8E']/button")).get(i).click();
				
				ip.emoji0(w1).get(i).click();
			}
		}
		int size2=ip.emoji4(w1).size();
for(int j=0;j<size2;j++) {
	String emojiname=ip.emoji4(w1).get(j).getAttribute("aria-label");
	if(emojiname.equalsIgnoreCase("monkey")) {
		ip.emoji4(w1).get(j).click();
ip.emoji5(w1).click();
	}
}
	
ip.emoji6(emoji).click();
ClickScreenshot.page_screenshot(Driver);

Upload.uploadFileWithRobot("D:\\error.png");
//Thread.sleep(3000);
Hold.waitt(Driver, By.xpath("//div[@class='dC']/div[@role='button'][1]"));
ip.sent(emoji).click();
int size1=ip.option1().size();


for(int k=0;k<size1;k++) {
String Option=	ip.option2().get(k).getAttribute("title");
	
if(Option.equalsIgnoreCase("Sent")) {
ip.option2().get(k).click();
	}}



	//Thread.sleep(4000);
	Hold.waitt(Driver, By.xpath("//div[2]/div/div[@class='Cp']/div/table/tbody"));
	
	
	
	Sent_Page sp=new Sent_Page(Driver);
	System.out.println(sp);
	//WebElement we2=ip.option3();
	for(int l=0;l<sp.requiredsentmail().size();l++) {
	String Subject=sp.requiredsentmail().get(l).getText();
	System.out.println(Subject);
	if(Subject.equalsIgnoreCase("Automated Mail")) {
		sp.requiredsentmail().get(l).click();	
	}
	}}
}

