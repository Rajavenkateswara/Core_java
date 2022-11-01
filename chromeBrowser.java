package Day_8;

public class chromeBrowser implements WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Child class reference and child class object we can access Both base and child.
			/*chromeBrowser obj1=new chromeBrowser();
			obj1.closeBrowser();
			obj1.savePassWord();
			obj1.startApplicaton();
			obj1.startBrowser();
			obj1.prinPdf();
			*/
//Base class reference and child class object we can access only base class methods		
		WebDriver obj1=new chromeBrowser();
		System.out.println(obj1.name);
		System.out.println(WebDriver.name);
		obj1.startBrowser();
		obj1.startApplicaton();
		obj1.closeBrowser();
//Child class reference and Base class object we can't create object of base class (Interface)		
		//chromeBrowser obj1=new WrbDriver();
//Base class reference and base class object We can't create object of  Base class(Interface)		
		//WebDriver obj1=new webdriver();
		

	}
	public void prinPdf(){
		System.out.println("Chrome can genarate the pdf files");
		
	}
	public void savePassWord(){
		System.out.println("Chrome can be save the password");
	}
	
	public void startBrowser() {
		System.out.println("Start the chromebrowser");
		
	}
	
	public void closeBrowser() {
		System.out.println("close chromeBrowser i ");
		// TODO Auto-generated method stub
		
	}

	public void startApplicaton() {
		System.out.println("Start the application in chromeBrowser");
		// TODO Auto-generated method stub
		
	}
	

}
