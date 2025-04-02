package leetCode75Problems;



class SolutionContainWater {
    public int maxArea(int[] height) {
        int left =0;
        int right =height.length-1;
        int max=-1;
        while(left<right){
            int w = right-left;
            int h = Math.min(height[left],height[right]);
            max = Math.max(max, w*h);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
