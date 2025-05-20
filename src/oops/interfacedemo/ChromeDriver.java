package oops.interfacedemo;

public class ChromeDriver implements WebDriver {
	
	public void chromeIcon() {
		System.out.println("Chrome Icon");
	}

	public void maximise() {
		System.out.println("Maximise the browser");
	}

	public void get(String url) {
		System.out.println("Navigated to the URL : "+url);
	}

	public void sendKeys(String text) {
		System.out.println("Entered Text : "+text);
	}

	public void click() {
		System.out.println("Clicked on an element");
	}

	public void select() {
		System.out.println("Selected an option from dropdown");
	}

	public void quit() {
		System.out.println("Closed the browser");
	}

}
