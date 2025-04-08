package leetCodedailyChallenges;

import java.util.HashSet;
import java.util.Set;

class SolutionMinimumNumberofOperations {
 
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (seen.contains(nums[i])) {
                return i / 3 +1;
            }
            seen.add(nums[i]);
        }
        return 0;
    }
}

public class MinimumNumberofOperationstMakeElementsinArrayDistinct {

	public static void main(String[] args) {
	    int[] arr = {1,2,3,4,2,3,3,5,7};
		SolutionMinimumNumberofOperations sd = new SolutionMinimumNumberofOperations();
		int res = sd.minimumOperations(arr);
		System.out.println(res);
	}

}
