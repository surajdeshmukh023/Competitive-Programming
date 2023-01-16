package tmep;

//https://practice.geeksforgeeks.org/problems/odd-or-even3618/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=Odd+or+Even
public class OddOrEven {
	static String oddEven(int N) {
		if ((N & 1) == 0)
			return "even";
		return "odd";
	}
}
