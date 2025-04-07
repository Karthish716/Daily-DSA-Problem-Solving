package leetCodedailyChallenges;

import java.util.Arrays;

class SolutionCanPart {
    public boolean canPartition(int[] nums) {
    	 int sum = 0, n = nums.length;
         
         for (int i = 0; i < n; i++)
             sum += nums[i];
         
         if (sum % 2 != 0) 
             return false;

         boolean[] dp = new boolean[10001];
         dp[0] = true;
         for (int num : nums) {
             for (int j = 10000; j >= num; j--) {
                 dp[j] = dp[j] || dp[j - num];
             }
             if (dp[sum / 2]) 
                 return true;
         }
         return dp[sum / 2];
    }
}

public class PartitionEqualSubsetSum {

	public static void main(String[] args) {
		SolutionCanPart s = new SolutionCanPart();
		int[] arr = {2,2,1,1};
		boolean b = s.canPartition(arr);
		System.out.print(b);

	}

}
