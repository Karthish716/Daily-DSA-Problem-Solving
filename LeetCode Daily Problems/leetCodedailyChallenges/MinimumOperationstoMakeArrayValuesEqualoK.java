package leetCodedailyChallenges;

import java.util.HashSet;
import java.util.Set;

class SolutionEqualoK {

    public int minOperations(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for (int x : nums) {
            if (x < k) {
                return -1;
            } else if (x > k) {
                st.add(x);
            }
        }
        return st.size();
    }
}

public class MinimumOperationstoMakeArrayValuesEqualoK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		int[] arr = {3,4,5,6,7,8};
		SolutionEqualoK sd = new SolutionEqualoK();
		int c = sd.minOperations(arr, 3);
		System.out.println(c);
		
	}

}
