package sec01;
import java.util.*;

public class Sec01_10 {
	
	public int[] solution(String str, char ch) {
		int[] answer = new int[str.length()];
		int p = 1000;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		p = 1000;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==ch) {
				p = 0;
			} else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec01_10 m10 = new Sec01_10();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		char t = kb.next().charAt(0);
		for(int x : m10.solution(s, t)) {
			System.out.print(x + " ");
		}
	}

}
