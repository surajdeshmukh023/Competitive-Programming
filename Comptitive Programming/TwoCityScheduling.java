//https://leetcode.com/problems/two-city-scheduling/

import java.util.Arrays;

public class TwoCityScheduling {

	public int twoCitySchedCost(int[][] costs) {
		Arrays.sort(costs, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

		int cost = 0;
		for (int i = 0; i < costs.length / 2; i++) {
			cost = cost + costs[i][0];
		}
		for (int i = costs.length / 2; i < costs.length; i++) {
			cost = cost + costs[i][1];
		}
		return cost;
	}

}
