package leetCode75Problems;


class ReverseVowel {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        
        while (start < end) {
           
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }
           
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }
            

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            
          
            start++;
            end--;
        }
        
        String answer = new String(word);
        return answer;
    }
    }


public class ReverseVowelsofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
