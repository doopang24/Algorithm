package sec06;
import java.util.*;

public class Sec06_08 {
	
	public int solution(int size, int target, int[] numArr) {
		int answer = 0, lt = 0, rt = size-1;
		Arrays.sort(numArr);
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(numArr[mid]==target) {
				answer = mid+1;
				break;
			} else if(numArr[mid] > target) {
				rt = mid-1;
			} else {
				lt = mid+1;
			}
		}				
		return answer;
	}

	public static void main(String[] args) {
		Sec06_08 m8 = new Sec06_08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		System.out.println(m8.solution(n, m, arr));
	}
}
