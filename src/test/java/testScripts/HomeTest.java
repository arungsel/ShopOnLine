package testScripts;
import java.util.Random;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BaseClass;
import pageObjects.DressObjects;
import pageObjects.HomeObjects;
import pageObjects.TshirtObjects;
import pageObjects.WomenObjects;
public class HomeTest {

	HomeObjects ho;
	BaseClass bc;
	WomenObjects wo;
	DressObjects dos;
	TshirtObjects to;
	
	int value = new Random().nextInt(5000);

	public HomeTest(){
		ho = new HomeObjects();
		bc = new BaseClass();
		wo = new WomenObjects();
		dos = new DressObjects();
		to = new TshirtObjects();
	}
	
	@Test (priority=1)
	public void verifyPageNavigation(){
		ho.clickWomen();
		Assert.assertTrue(wo.getheaderText().getText().trim().equals("Women"), "Failed : Women Page not navigated");
		ho.clickDresses();
		Assert.assertTrue(dos.getheaderText().getText().trim().equals("Dresses"), "Failed : Women Page not navigated");
		ho.clickTshirts();
		Assert.assertTrue(to.getheaderText().getText().trim().equals("T-shirts"), "Failed : Women Page not navigated");
	}
    
	@Test (priority=2)
	public void verifyTabs(){
		Assert.assertTrue(ho.DressesHeaderMenu().isDisplayed(),	"The Dresses tab is not Displayed");
		Assert.assertTrue(ho.TshirtHdrMenu().isDisplayed(),	"The Tshirt tab is not Displayed");
		Assert.assertTrue(ho.WomenHeaderMenu().isDisplayed(),"The Womens tab is not Displayed");
	}
    
	@Test (priority=3)
    public void verifyNewsLetter(){
    	String email = "abcdf"+ value+"@gmail.com";
    	ho.enterEmailInNewsLetter(email);
    	String alertMessage = ho.getAlertMsg();
    	Assert.assertTrue(alertMessage.contains("Newsletter: You have successfully subscribed to this newsletter."),"Failed:Substription isnot succeful");
    }
}
