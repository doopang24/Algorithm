package sec02;
import java.util.*;

public class Sec02_06 {
	
	public boolean isPrime(int num) {
		if(num==1) return false;
		for(int i=2; i<num; i++) {
			if(num%i==0) return false;
		}
		
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			int tmp = arr[i];
			int reverse = 0; 
			while(tmp>0) {
				int t = tmp%10;
				reverse  = reverse*10 + t;
				tmp /= 10;
			}
			if(isPrime(reverse)) answer.add(reverse);
		}
		return answer;
	}
		

	public static void main(String[] args) {
		Sec02_06 m6 = new Sec02_06();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] numArr = new int[num];
		for(int i=0; i<num; i++) numArr[i] = kb.nextInt();
		
		for(int x : m6.solution(num, numArr)) {
			System.out.print(x + " ");
		}
	}
}
