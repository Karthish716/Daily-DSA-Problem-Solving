package leetCode75Problems;

import java.util.Arrays;

class SolutionMaxPair {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
          int count = 0;
           int s = 0, e = nums.length - 1;
         while (s < e) {
            int temp = nums[s] + nums[e];
            if (temp == k) {
                s++;
                e--;
                count++;
            } else if (temp > k) {
                e--;
            } else {
                s++;
            }
        }
        return count;  
    }
}


public class MaxNumberofKSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
