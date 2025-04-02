package leetCode75Problems;

class ReverseWords {
    public String reverseWords(String s) {
        String[] words= s.split(" +");
		StringBuilder sb = new StringBuilder();
		
		for(int i =words.length-1;i>=0;i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
    }
}

public class ReverseWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
