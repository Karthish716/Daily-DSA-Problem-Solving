package leetCode75Problems;

class SolutionSubsequence {
    public boolean increasingTriplet(int[] nums) {
 
    int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
    for (int n : nums) {
        if (n <= first) {
            first = n;
        } else if (n <= second) {
            second = n;
        } else {
            return true;
        }
    }
    return false;
    
    
    
//    if(nums.length < 3) {
//    	return false;
//    }
//    for(int i=0;i<nums.length-2;i++) {
//    	if(nums[i]<nums[i+1] && nums[i+1]<nums[i+2]) {
//    		return true;
//    	}
//    }
//    return false;
}
}

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		int[] arr = {20,100,10,12,5,13};
		SolutionSubsequence sp = new SolutionSubsequence();
		boolean b =sp.increasingTriplet(arr);
         System.out.println(b);
	}

}
