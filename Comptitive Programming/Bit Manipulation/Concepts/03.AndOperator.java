
/*
 * Particular use of the bitwise and is to check if particular bit is on or off
 * 1 & 1 = 1 otherwise 0
 * Application
 * In file system every file entry present in directory there is attribute byte, the status is governed by individual bit in it
 */
public class AndOperator {

	public static void main(String args[]) {
		int x = 65;
		checkNthBitSetOrNot(x);

	}

	static void checkNthBitSetOrNot(int x) {
		int y = x & 32; // why x -> x binary is 00100000 for 32 5th bit is set
		// so if x & y is performed then result will show whether i'th bit is set or not
		if (y == 0) {
			System.out.println("The fifth bit is of");
		} else {
			System.out.println("Fifth bit is on");
		}
	}

	/*
	 * Change status of bit or to switch off particular bit
	 */
	static void changeBitStatus(int x) {

	}

	/*
	 * Extracts portion of the bit
	 */
	static void copyrightmostNBits(int x) {

	}
}
