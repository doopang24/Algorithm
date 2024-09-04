package sec02;
import java.util.*;

public class Sec02_11 {
	
	public int solution(int p, int[][] cRecord) {
		int answer = 0, max = Integer.MIN_VALUE;
		
		for(int i=1; i<=p; i++) {
			int cnt = 0;
			for(int j=1; j<=p; j++) {
				for(int k=1; k<=5; k++) {
					if(cRecord[i][k]==cRecord[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}		
		return answer;
	}
	
//	public int solution(int p, int[][] cRecord) {
//		int answer = 0; 
//		int[] cnt = new int[p];
//		
//		for(int i=0; i<p; i++) {
//			for(int j=0; j<p; j++) {
//				for(int k=0; k<p; k++) {
//					if(cRecord[i][k]==cRecord[j][k]) {
//						cnt[i]++;
//						break;
//					}
//				}
//			}
//		}
//		for(int i=0; i<p; i++) {
//			if(cnt[i]>answer) answer = i + 1;
//		}
//		
//		return answer;
//	}

	public static void main(String[] args) {
		Sec02_11 m11 = new Sec02_11();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr2D = new int[n+1][6];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5; j++) {
				arr2D[i][j] = kb.nextInt();
			}
		}
		System.out.println(m11.solution(n, arr2D));
	}
}
