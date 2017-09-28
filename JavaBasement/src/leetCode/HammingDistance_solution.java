package leetCode;

public class HammingDistance_solution {
	
	public static void main(String[] args) {
		SolutionForHammingDistance a = new SolutionForHammingDistance();
		int distance = a.hammingDistance(23, 24);
		System.out.println("Distance is: " + distance);
	}
}

class SolutionForHammingDistance {
	public int hammingDistance(int x, int y) {
		
		int c = x ^ y;
		int count = 0;
		
		while(c != 0) {
			count += c & 1;
			c >>= 1;
		}
		return count;
		
	}
}