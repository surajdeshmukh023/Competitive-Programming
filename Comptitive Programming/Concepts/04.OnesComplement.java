
import java.util.Scanner;

/*
 * least significant bit is the lowest bit in binary numbers. 
 * It is either the leftmost or rightmost bit in a binary number, depending on the computer's architecture
 * The complement operator (~) JUST FLIPS BITS. It is up to the machine to interpret these bits.
 * This fliping of bits is called one's complement
 * LSB represents the sign 1 is -ve and 0 is +ve
 * 64 Bit application can process 64 bits at max at a time
 * 
 * To go from -5 to 5 first find 1 ones complement then add 1 to it  which is 2 s complement
 * Application - basic encryption utility
 */
public class OnesComplement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		decToBinary(n);
	}

	static void decToBinary(int n) {
		int[] binary = new int[100];
		int i = 0;
		while (n > 0) {
			binary[i] = n % 2;
			n = n / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binary[j] + " ");
		}
	}

}
