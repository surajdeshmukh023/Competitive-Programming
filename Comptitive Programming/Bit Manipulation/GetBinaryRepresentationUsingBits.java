package tmep;

//https://practice.geeksforgeeks.org/problems/binary-representation5003/1
public class GetBinaryRepresentationUsingBits {

	static String getBinaryRep(int N) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < 30; i++) {
			res.append(N & 1); // extract the last digit by doing and with 1 ones binary representation OR N %
								// 2
			N = N >> 1; // right shift 1 = divide by 2 OR N / 2
		}

		return res.reverse().toString();
	}

}
