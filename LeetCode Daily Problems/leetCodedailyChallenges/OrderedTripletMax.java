package leetCodedailyChallenges;

// April 2
//2873. Maximum Value of an Ordered Triplet I

class Solution2 {
    public long maximumTripletValue(int[] nums) {
                int n = nums.length;
        long res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    res = Math.max(res, (long) (nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        return res;
    }
}


public class OrderedTripletMax {

	public static void main(String[] args) {


	}

}
