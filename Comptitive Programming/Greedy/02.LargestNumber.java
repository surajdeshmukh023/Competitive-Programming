//https://leetcode.com/problems/largest-number/description/s

import java.util.Arrays;

public class LargestNumber {
	public String largestNumber(int[] nums) {
		String[] arr = new String[nums.length];

		for (int idx = 0; idx < nums.length; idx++)
			arr[idx] = Integer.toString(nums[idx]);

		Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

		StringBuilder res = new StringBuilder();

		for (String str : arr)
			res.append(str);
		/*
		 * int idx = 0;
		 * 
		 * while (idx < res.length() && res.charAt(idx) == '0') idx++;
		 * 
		 * if (idx == res.length()) return "0";
		 */

		// return res.toString().substring(idx);
		if (res.charAt(0) == '0')
			return "0";
		return res.toString();
	}
}
