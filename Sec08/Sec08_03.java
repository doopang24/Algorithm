package sec08;
import java.util.*;

public class Sec08_03 {
	static int n, m, maxS = Integer.MIN_VALUE;
	
	public void DFS(int level, int sum, int time, int[] a, int[] b) {
		if(time>m) return;
		if(level==n) {
			maxS = Math.max(sum, maxS);
		} else {
			DFS(level+1, sum+a[level], time+b[level], a, b);
			DFS(level+1, sum, time, a, b);
		}		
	}

	public static void main(String[] args) {
		Sec08_03 m3 = new Sec08_03();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		int[] score = new int[n];
		int[] minuite = new int[n];
		for(int i=0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			score[i] = a;
			minuite[i] = b;
		}
		m3.DFS(0, 0, 0, score, minuite);
		System.out.println(maxS);
	}
}
