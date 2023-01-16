package tmep;

public class ToggleBitsRange {
	static int toggleBits(int N, int L, int R) {
		for (int i = L - 1; i <= R - 1; i++) {
			int mask = N << i;
			N = N ^ mask;
		}
		return N;
	}
}
