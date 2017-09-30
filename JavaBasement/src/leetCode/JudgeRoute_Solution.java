package leetCode;

// logic is wrong

public class JudgeRoute_Solution {
	static int up = 1; // Up
	static int down= -1; // Down
	static int right = 1; // Right
	static int left = -1; // Left
	
	public static void main(String[] args) {
		int result = 0;
		boolean circle = true;
		String[] moves = {"U", "D", "R", "D"};
		
		for(int i = 0; i < moves.length; i++) {
			
			if(moves[i] == "U") {
				result += up;
			} else if(moves[i] == "D") {
				result += down;
			} else if(moves[i] == "R") {
				result += right;
			} else if(moves[i] == "L") {
				result += left;
			}
			
		}
		
		if(result == 0) {
			System.out.println(circle);
		} else {
			System.out.println(circle = false);
		}
	}
}
