package leetCode75Problems;



class SolutionMaxAvV {
    public double findMaxAverage(int[] nums, int k) {
          
    int sum = 0;

       for(int i = 0; i < k; i ++) {
            sum += nums[i];
       }

       int maxSum = sum;

       for(int i = k; i < nums.length; i ++) {
           sum += nums[i] - nums[i - k];
           maxSum = Math.max(maxSum, sum);
       }
       return (double)maxSum / k;
    }
}

//class SolutionMAV {
//    public double findMaxAverage(int[] nums, int k) {
//        double max=Integer.MIN_VALUE;
//        for(int i=k-1;i<nums.length;i++){
//            double res=0;
//            for(int j =i;j>=i-k+1;j--){
//               res= res+nums[j];
//            }
//            max= Math.max(max,res/k);
//        }
//    return max;
//    }
//}


public class MaximumAverageSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
