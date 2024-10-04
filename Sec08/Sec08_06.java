package sec08;
import java.util.*;

public class Sec08_06 {
	static int n, m;
	static int[] check, pm;
	
	public void DFS(int level, int[] numArr) {
		if(level==m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			for(int i=0; i<n; i++) {
				if(check[i]==0) {
					check[i] = 1;
					pm[level] = numArr[i];
					DFS(level+1, numArr);
					check[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Sec08_06 m6 = new Sec08_06();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		check = new int[n];
		pm = new int[m];
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		m6.DFS(0, arr);
		
	} 
}
