package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects extends BaseClass{

	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement WomenHeaderMenu;

	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement DressesHeaderMenu;
	
	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement TshirtHdrMenu;
	
	@FindBy(xpath="//*[@id='newsletter-input']")
	private WebElement EmailText;
	
	@FindBy(xpath="//*[@name='submitNewsletter']")
	private WebElement EmailButton;
	// alternate way 
	@FindBy(id="newsletter-input")
	private WebElement txtBoxNewsLetter;
	
	@FindBy(name = "submitNewsletter")
	private WebElement submitNewLetter;
	
	@FindBy(xpath=".//*[@class='alert alert-success']") 
	private WebElement txtAlertmsg;
	
	@FindBy(xpath =".//[@href='https://www.facebook.com/groups/525066904174158/'")
	private WebElement fbUrl;
	
	@FindBy(xpath=".//[@href='https://twitter.com/seleniumfrmwrk'")
	private WebElement twtUrl;
	
	@FindBy(xpath ="//ul[@id='homefeatured']/li[1]//a[@class='product-name']")
	private WebElement product_1;
	
	public HomeObjects(){
		PageFactory.initElements(driver,this);
	}

	public void clickWomen(){
		WomenHeaderMenu.click();
	}
	
	public void clickDresses(){
		DressesHeaderMenu.click();
	}
	
	public void clickTshirts(){
		TshirtHdrMenu.click();
	}
	
	public WebElement DressesHeaderMenu(){
		return DressesHeaderMenu;
	}

	public WebElement WomenHeaderMenu(){
		return WomenHeaderMenu;
	}

	public WebElement TshirtHdrMenu(){
		return TshirtHdrMenu;
	}

	public WebElement getemailtext(){
	    return EmailText; 	
	}
	public WebElement getemailbutton(){
		return EmailButton;
	}
	// alternate way methods..
	public WebElement getDreses(){
		return DressesHeaderMenu;
	}
	
	public void enterEmailInNewsLetter(String email){
		setText(txtBoxNewsLetter, email);
		submitNewLetter.click();
	}
		
	public String getAlertMsg(){
		return txtAlertmsg.getText();
	}
	
	public WebElement fbUrlClk(){
		return fbUrl;
	}
	
	public WebElement twtUrlClk(){
		return twtUrl;
	}
	
	public void clickProductButton(){
		product_1.click();}
		
	}
