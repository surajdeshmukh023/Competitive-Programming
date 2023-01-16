package tmep;

//https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		if (n <= 0)
			return false;
		// return Integer.bitCount(n) == 1;
		return (n & (n - 1)) == 0;
	}
}
