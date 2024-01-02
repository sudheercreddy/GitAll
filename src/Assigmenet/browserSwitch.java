package Assigmenet;

public class browserSwitch {

	public static void main(String[] args) {

		String browser = "IE";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome");

			break;
		case "ie":
			System.out.println("ie");

			break;
		case "safari":
			System.out.println("safari");

			break;
		case "edge":
			System.out.println("edge");

			break;

		default:
			System.out.println("invalida selected browser");
			break;
		}

	}

}
