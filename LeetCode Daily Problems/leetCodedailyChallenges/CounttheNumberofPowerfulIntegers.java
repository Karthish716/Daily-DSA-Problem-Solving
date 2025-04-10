package leetCodedailyChallenges;


class SolutionPowerfulIntegers {
	 public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
	        String startStr = Long.toString(start - 1);
	        String finishStr = Long.toString(finish);
	        return calculate(finishStr, s, limit) - calculate(startStr, s, limit);
	    }

	    private long calculate(String x, String s, int limit) {
	        if (x.length() < s.length()) {
	            return 0;
	        }

	        if (x.length() == s.length()) {
	            return x.compareTo(s) >= 0 ? 1 : 0;
	        }

	        for (char c : s.toCharArray()) {
	            if (c - '0' > limit) return 0;
	        }

	        long count = 0;
	        int prefixLen = x.length() - s.length();
	        boolean tight = true;

	        for (int i = 0; i < prefixLen; i++) {
	            int maxDigit = tight ? (x.charAt(i) - '0') : limit;

	            for (int d = 0; d <= Math.min(limit, maxDigit - 1); d++) {
	                count += (long) Math.pow(limit + 1, prefixLen - 1 - i);
	            }

	            if ((x.charAt(i) - '0') > limit) {
	                return count;
	            }

	            if ((x.charAt(i) - '0') < maxDigit) {
	                tight = false;
	            }
	        }

	        String candidate = x.substring(0, prefixLen) + s;
	        if (candidate.compareTo(x) <= 0) {
	            count++;
	        }

	        return count;
	    }
	    
//	    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
//	        long suffix = 0L;
//	        for (char c : s.toCharArray())
//	            suffix = suffix * 10 + c - '0';
//	        if (suffix > finish)
//	            return 0;
//	        long div = (long) Math.pow(10, s.length()), ps = start / div, pf = finish / div;
//	        if (finish % div >= suffix)
//	            pf++;
//	        if (start % div > suffix)
//	            ps++;
//	        return getAvailNum(pf, limit) - getAvailNum(ps, limit);
//	    }
//
//	    private long getAvailNum(long num, long limit) {
//	        if (num == 0)
//	            return 0;
//	        if (limit == 9)
//	            return num;
//	        int digits = (int) Math.log10(num);
//	        long div = (long) Math.pow(10, digits), res = 0L;
//	        for (int i = digits; i >= 0; i--) {
//	            int d = (int) (num / div);
//	            if (d > limit)
//	                return res + (long) Math.pow(limit + 1, i + 1);
//	            else
//	                res += d * (long) Math.pow(limit + 1, i);
//	            num %= div;
//	            div /= 10;
//	        }
//	        return res;
//	    }
	    
	    
}


public class CounttheNumberofPowerfulIntegers {

	public static void main(String[] args) {
		SolutionPowerfulIntegers sp = new SolutionPowerfulIntegers();
		long ans = sp.numberOfPowerfulInt(1, 6000, 4, "124");
		System.out.println(ans);

	}

}
