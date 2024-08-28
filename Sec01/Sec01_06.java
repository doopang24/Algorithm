package sec01;
import java.util.*;

public class Sec01_06 {
	
	public String solution(String str) {
		String answer = "";
		for(int i=0; i<str.length(); i++) {
			if(i==str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec01_06 m6 = new Sec01_06();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(m6.solution(str));
	}
}
