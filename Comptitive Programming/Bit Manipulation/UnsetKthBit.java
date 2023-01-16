package tmep;

public class UnsetKthBit {
	static int unSetKthBit(int N, int K) {
		int mask = ~(1 << K);
		return (mask & N);
	}
}
