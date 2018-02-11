package leetCode;

// Problem link: https://leetcode.com/problems/friend-circles/description/

import java.util.Random;

public class FriendCircles_solution {
	
	/*generate class matrix*/
	private static int[][] getMatrix(int m) {
		int[][] M = new int[m][m];
		int max = 1;
		int min = 0;
		
		Random random = new Random();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				if(i == j) {
					M[i][j] = 1;
				} else {
					if(M[i][j] == 0) {
						/*
						randomly give value between 0 and 1 
						to matrix
						*/
						int randomValue = random.nextInt(max - min + 1) + min;
						if(randomValue == 1) {
							M[i][j] = randomValue;
							M[j][i] = randomValue;
						} else {
							M[i][j] = randomValue;
						}
					}
				}
			}
		}
		return M;
	}
	
	public static void main(String[] args) {
		
		int x = 5;
		int[][] Y = getMatrix(x);
		
		System.out.println(Y[0].length); // get size of array
		System.out.println(Y.length);
//		for(int i = 0; i < x; i++) {
//			for(int j = 0; j < x; j++) {
//				System.out.print(Y[i][j] + " ");
//				if(j == x - 1) {
//					System.out.println("");
//				}
//			}
//		}
	}
}


class FSolution {
	public int findCircleNum(int[][] M) {
		int arraySize = M[0].length;
		int count = 0;
		for(int i = 0; i < arraySize; i++) {
			if(M[i][i + 1] == 1 && i + 1 < arraySize) {
				count++;
			}
		}
		
		return count;
	}
}

