package oops.interfacedemo;

public class InterviewQuestion {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
//		driver.chromeIcon();
		driver.maximise();
		driver.get("https://www.google.com/");
		driver.sendKeys("Selenium by Shantosh");
		driver.click();
		driver.select();
		driver.quit();
		System.out.println("***************************************");
		
		driver = new FirefoxDriver();
//		driver.firefoxMenu();
		driver.maximise();
		driver.get("https://www.yahoo.com/");
		driver.sendKeys("News on Trump");
		driver.click();
		driver.select();
		driver.quit();
		System.out.println("***************************************");

	}

}
