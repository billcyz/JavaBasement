package leetCode;

import java.util.Scanner;

public class JudgeRoute_Solution {
	static int up = 1; // Up
	static int down= -1; // Down
	static int right = 1; // Right
	static int left = -1; // Left
	
	static int x, y = 0;
	
	public static void main(String[] args) {
		boolean circle = true;
		
		System.out.println("Please enter route: ");
		Scanner sc = new Scanner(System.in);
		String moves = sc.nextLine();
		
		sc.close();
		
		// process each char in string
		for(char c : moves.toCharArray()) {
			if(c == 'U') {
				y += up;
			} else if(c == 'D') {
				y += down;
			} else if(c == 'L') {
				x += left;
			} else if(c == 'R') {
				x += right;
			}
		}

		
		if(x == 0 && y == 0) {
			System.out.println(circle);
		} else {
			System.out.println("x is: " + x + " y is: " + y);
			System.out.println(circle = false);
		}
		
	}
}
