package Assigmenet;

public class IfelseChrome {

	public static void main(String[] args) {
		String 	browser = "ie";
		browser=browser.toLowerCase();
		if(browser.equals("chrome")) {
			System.out.println("Launchig firefox driver");
		}else if(browser.equals("firefox")) {
			System.out.println("Lauch firefox driver");
		}else if (browser.startsWith("ie")) {
			System.out.println("Launch the IE browser");
		}else {
			System.out.println("SAfari lauching");
		}
	}

}
