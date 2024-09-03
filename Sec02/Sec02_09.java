package sec02;
import java.util.*;

public class Sec02_09 {
	
	public int solution(int n, int[][] arr2D) {
		int answer = Integer.MIN_VALUE, sumMax = 0;
		
		for(int i=0; i<n; i++) {
			int sumH = 0, sumV = 0, sumE = 0, sumO = 0;
			for(int j=0; j<n; j++) {
				sumH += arr2D[i][j];
				sumV += arr2D[j][i];
			}
			if(sumH>sumMax || sumV>sumMax) sumMax = Math.max(sumH, sumV);
		}
		
		int sumE = 0, sumO = 0;
		for(int i=0; i<n; i++) {
			sumE += arr2D[i][i];
			sumO += arr2D[i][n-1-i];
		}
		if(sumE>sumMax || sumO>sumMax) sumMax = Math.max(sumE, sumO);		
		
		answer = sumMax;		
		
		return answer;
	}

	public static void main(String[] args) {
		Sec02_09 m9 = new Sec02_09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr2D = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr2D[i][j] = kb.nextInt();
			}
		}		
		System.out.println(m9.solution(n, arr2D));
	}
}
