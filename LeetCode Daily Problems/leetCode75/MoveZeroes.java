package leetCode75Problems;


class SolutionMove {
    public void moveZeroes(int[] nums) {
        
        
     int z=1;
		int i = 0;
	while(z<nums.length) {
		if(nums[i]==0) {
			if(nums[z]!=0) {
			int temp=nums[i];
			 nums[i]=nums[z];
			nums[z]=temp;
			i++;
			z++;
		}
		else {
			z++;
		}
		}
		else {
		i++;
		z++;
		}
	
		}
		

    }
}

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
