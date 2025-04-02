package leetCode75Problems;


class SolutionisSeq {
    public boolean isSubsequence(String s, String t) {
      char p[] = s.toCharArray();
        char r[] = t.toCharArray();
        int i = 0;
        int j = 0;

        while(j < r.length && i < p.length){
            if(p[i] == r[j] ) i++;
            j++;
        }
        return i == s.length();
    }
}


public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
