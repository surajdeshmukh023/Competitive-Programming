package tmep;
//https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1?

public class CheckKthBitSetOrNot {

	static boolean checkKthBit(int n, int k) {
		int mask = 1 << k;
		if ((n & mask) == 0)
			return false;
		return true;
	}
}
