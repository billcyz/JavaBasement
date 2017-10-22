
import java.util.Arrays;

public class ListTrueAndFalse {
	
	static int[] result = new int[4];
	
	public static void main(String[] args) {
		for(int i = 0; i < 2; i++) {
			result[0] = i;
			for(int j = 0; j < 2; j++) {
				result[1] = j;
				for(int k = 0; k < 2; k++) {
					result[2] = k;
					for(int l = 0; l < 2; l++) {
						result[3] = l;
						System.out.println(Arrays.toString(result));
//						System.out.println("%d%d%d%d", result[0], result[1], result[2], result[3]);
					}
				}
			}
		}
	}

}
