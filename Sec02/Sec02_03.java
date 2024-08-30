package sec02;

import java.util.Scanner;

public class Sec02_03 {
	
	public String solution(int n, int[] A, int[] B) {
		String answer = "";
		for(int i=0; i<n; i++) {
			if((A[i]==1 && B[i]==2) || (A[i]==2 && B[i]==3) || (A[i]==3 && B[i]==1)) {
				answer += "B";
			} else if((A[i]==2 && B[i]==1) || (A[i]==3 && B[i]==2) || (A[i]==1 && B[i]==3)) {
				answer += "A";
			} else {
				answer += "D";
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec02_03 m3 = new Sec02_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		for(int i=0; i<n; i++) A[i] = kb.nextInt();
		for(int i=0; i<n; i++) B[i] = kb.nextInt();
		
		for(char x : m3.solution(n, A, B).toCharArray()) {
			System.out.println(x);
		}
	}

}
