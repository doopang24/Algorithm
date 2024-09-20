package sec06;
import java.util.*;

public class Sec06_06 {
	
	public ArrayList<Integer> solution(int num, int[] hights) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		int[] tmp = hights.clone();
		Arrays.sort(hights);
		
		for(int i=0; i<num; i++) {
			if(tmp[i]!=hights[i]) answer.add(i+1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec06_06 m6 = new Sec06_06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		for(int x : m6.solution(n, arr)) System.out.print(x + " ");
	}
}
