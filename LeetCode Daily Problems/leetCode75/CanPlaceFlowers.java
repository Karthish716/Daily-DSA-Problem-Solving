package leetCode75Problems;

class SolutionCanPlace {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
    	
    	
    	
    	
    	
        for (int i = 0; i < flowerbed.length; i+=2) {
            if (flowerbed[i] == 0) {
                if (i == flowerbed.length - 1 || flowerbed[i + 1]  == 0) {
                    n--;
                } else {
                    i++;
                }
             }
         }
         return n <= 0;
//        if (n == 0) {
//            return true;
//        }
//        for (int i = 0; i < flowerbed.length; i++) {
//            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
//                flowerbed[i] = 1;
//                n--;
//                if (n == 0) {
//                    return true;
//                }
//            }
//        }
//        return false;
    	
    	
    }
}

public class CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int[] arr=	{0,0,1,0,0};
		SolutionCanPlace s = new SolutionCanPlace();
		boolean b =s.canPlaceFlowers(arr, 2);
		System.out.println(b);

	}

}
