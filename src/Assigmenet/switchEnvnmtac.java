package Assigmenet;

public class switchEnvnmtac {

	public static void main(String[] args) {

		String browser = "chROme    ";
	
		switch (browser.toLowerCase().trim()) {
		case "chrome": {
			System.out.println("launching browser " + browser.toUpperCase());
			break;
		}
		case "firefox": {
			System.out.println("launching browser " + browser.toUpperCase());
			break;
		}
		default:
			System.out.println("select either chrome or firefox");
		}

	}

}
