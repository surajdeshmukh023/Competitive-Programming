package tmep;

//https://practice.geeksforgeeks.org/problems/set-kth-bit3724/1
public class SetKthBit {
	static int setKthBit(int N, int K) {
		int mask = 1 << K;
		return (mask | N);
	}
}
