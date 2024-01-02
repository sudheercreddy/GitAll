package Assigmenet;

public class browserIfElse {

	public static void main(String[] args) {
		String browser= "charome";
		browser.toLowerCase().trim();
		if(browser.equals("chrome")) {
			System.out.println("Launching the  browser"+browser );
		}else if(browser.equals("firefox")) {
			System.out.println("Launching browser" + browser);
		}else if(browser.equals("ie")) {
			System.out.println("launching the browser" + browser);
		}else if(browser.equals("safari")) {
		System.out.println("launhing the browser"+ browser);
		}else {
			System.out.println("invalid browser select the browser");
		}
	}

}
