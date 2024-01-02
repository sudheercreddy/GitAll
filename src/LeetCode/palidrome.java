package LeetCode;

public class palidrome {

	public static void main(String[] args) {
		System.out.println(isPalidrome("madama"));
		//String name  ="madam";
		
		//
		
//		System.out.println(name.charAt(0));
//		System.out.println(name.length());
//		
//		for(int i =0 ; i<=name.length()-1; i++) {
//			System.out.println(name.charAt(i));
//		}

	}
	
	public static boolean isPalidrome(String s) {
		
		
		int left = 0;
		int right = s.length()-1;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
		
	}

}
