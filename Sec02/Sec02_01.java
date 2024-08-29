package sec02;
import java.util.*;

public class Sec02_01 {
	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec02_01 m1 = new Sec02_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++ ) {
			arr[i] = kb.nextInt();
		}
		for(int x : m1.solution(n, arr)) {
			System.out.print(x + " ");
		}

	}

}
