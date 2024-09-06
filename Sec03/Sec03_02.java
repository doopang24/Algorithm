package sec03;
import java.util.*;

public class Sec03_02 {
	
	public ArrayList<Integer> solution(int a, int[] arrA, int b, int[] arrB) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		int pa = 0, pb = 0;
		
		while(pa<a && pb<b) {
			if(arrA[pa]==arrB[pb]) {
				answer.add(arrA[pa]);
				pa++;
				pb++;
			} else {
				if(arrA[pa] > arrB[pb]) pb++;
				else pa++;
			}
		}
		return answer;
	}
	
//	public ArrayList<Integer> solution(int a, int[] arrA, int b, int[] arrB) {
//		ArrayList<Integer> answer = new ArrayList<Integer>();
//		Arrays.sort(arrA);
//		Arrays.sort(arrB);
//		
//		for(int i=0; i<a; i++) {
//			for(int j=0; j<b; j++) {
//				if(arrA[i]==arrB[j]) answer.add(arrA[i]);
//			}
//		}		
//		return answer;
//	}


	public static void main(String[] args) {
		Sec03_02 m2 = new Sec03_02();
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		int[] arrA = new int[a];
		for(int i=0; i<a; i++) arrA[i] = kb.nextInt();
		
		int b = kb.nextInt();
		int[] arrB = new int[b];
		for(int i=0; i<b; i++) arrB[i] = kb.nextInt();
		
		for(int x : m2.solution(a, arrA, b, arrB)) {
			System.out.print(x + " ");
		}
	}
}
