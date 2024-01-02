package LeetCode;

public class intArrayandTarget {

	
	public boolean checkForTarget(int[] nums, int target) {
	    int left = 0;
	    int right = nums.length - 1;

	    while (left < right) {
	        // curr is the current sum
	        int curr = nums[left] + nums[right];
	        if (curr == target) {
	            return true;
	        }

	        if (curr > target) {
	            right--;
	        } else {
	            left++;
	        }
	    }

	    return false;
	}

	public static void main(String[] args) {
		
		int nums[]= {1,2,4,6,8,9,14,16};
		int target =14;
		intArrayandTarget aa= new intArrayandTarget();
		System.out.println(aa.checkForTarget(nums, target));
//		//sumIntArrayIsTarget({1,2,4,6,8,9,14,16},14);
//		int nums[]= {1,2,4,6,8,9,14,16};
//		int target =14;
//		int left = 0;
//		int right =nums.length-1;
//
//		while(left<right) {
//			int curr = nums[left]+nums[right];
//			if(curr==target) {
//				return true;
//			}
//			if(curr>target) {
//				right --;
//			}else {
//				left++;
//			}
//			}
//
//
//
//
//		return false;
	}
}
