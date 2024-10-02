package sec08;
import java.util.*;

public class Sec08_02 {
	static int c, n, max = Integer.MIN_VALUE;
	
	public void DFS(int level, int sum, int[] numArr) {
		if(sum>c) return;
		if(level==n) {
			max = Math.max(sum, max);
		} else {
			DFS(level+1, sum+numArr[level], numArr);
			DFS(level+1, sum, numArr);
		}
		
	}

	public static void main(String[] args) {
		Sec08_02 m2 = new Sec08_02();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt();
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		m2.DFS(0, 0, arr);
		System.out.println(max);
	}
}
