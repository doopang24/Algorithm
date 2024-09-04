package sec02;
import java.util.*;

public class Sec02_12 {
	
	public int solution(int std, int test, int[][] report) {
		int answer = 0;
		
		for(int i=1; i<=std; i++) {					// iÇĞ»ı (¸àÅä)
			for(int j=1; j<=std; j++) {				// jÇĞ»ı (¸àÆ¼)	(i, j)
				int cnt = 0;
				for(int k=0; k<test; k++) {			// Å×½ºÆ® È½¼ö
					int pi = 0, pj = 0;
					for(int s=0; s<std; s++) {		// µî¼ö
						if(report[k][s]==i) pi = s;
						if(report[k][s]==j) pj = s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==test) answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec02_12 m12 = new Sec02_12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr2D = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr2D[i][j] = kb.nextInt();
			}
		}		
		System.out.println(m12.solution(n, m, arr2D));
	}
}
