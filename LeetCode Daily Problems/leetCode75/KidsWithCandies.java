package leetCode75Problems;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	       int maxCandies = 0;
	        for (int candy : candies) {
	            maxCandies = Math.max(maxCandies, candy);
	        }
	           List<Boolean> result = new ArrayList<>();

	             for (int candy : candies) {
	            if (candy + extraCandies >= maxCandies) {
	                result.add(true);
	            } else {
	                result.add(false);
	            }
	        }
	        
	        return result;
	        
	        
	        
			/* Favour------>
			 * int max = candies[0]; for(int i=0;i<candies.length;i++) max =
			 * Math.max(max,candies[i]);
			 * 
			 * List<Boolean> list = new ArrayList<>(candies.length); for(int
			 * i=0;i<candies.length;i++){
			 * 
			 * list.add(candies[i]+extraCandies>=max);
			 * 
			 * } return list;
			 */
	        
    }
}


public class KidsWithCandies {

	public static void main(String[] args) {
		int[] arr = {2,3,5,1,3};
		
		Solution s = new Solution();
		List<Boolean> l = s.kidsWithCandies(arr, 3);
       for(Boolean b : l) {
    	   System.out.println(b);
       }
	}

}
