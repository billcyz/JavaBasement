package leetCode;

public class TwoSum_solution {

	static int[] input = { 1, 7, 15, 2 };
	static int target = 9;
	static int[] output;

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.twoSum(input, target);
	}
}

class Solution {
	public int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				int total = nums[i] + nums[j];
				if(total == target) {
					System.out.println(i);
					System.out.println(j);
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}