package oops.interfacedemo;

public class TestApplication {

	public static void main(String[] args) {
		
		// if an object refered by its own typ then its called compile time polymorphism
		ChromeDriver driver = new ChromeDriver();
		driver.chromeIcon();
		driver.maximise();
		driver.get("https://www.google.com/");
		driver.sendKeys("Selenium by Shantosh");
		driver.click();
		driver.select();
		driver.quit();
		System.out.println("***************************************");
		
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.firefoxMenu();
		driver1.maximise();
		driver1.get("https://www.yahoo.com/");
		driver1.sendKeys("News on Trump");
		driver1.click();
		driver1.select();
		driver1.quit();
		System.out.println("***************************************");
		
		// if an object refered by its own typ then its called run time polymorphism
		WebDriver driver2 = new ChromeDriver();
		// driver2.chromeIcon(); -> this is child specific method
		driver2.maximise();
		driver2.get("https://www.google.com/");
		driver2.sendKeys("Selenium by Shantosh");
		driver2.click();
		driver2.select();
		driver2.quit();
		System.out.println("***************************************");

	}

}
