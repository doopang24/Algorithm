package sec01;
import java.util.*;

public class Sec01_11 {
	
	public String solution(String str) {
		String answer = "";
		str += " ";
		int cnt = 1;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				cnt++;
			} else {
				answer += str.charAt(i);
				if(cnt>1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec01_11 m11 = new Sec01_11();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(m11.solution(s));
	}
}
