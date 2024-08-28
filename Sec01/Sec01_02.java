package sec01;
import java.util.*;

public class Sec01_02 {
	
	public String solution(String str) {
		String answer = "";
		for(char ch : str.toCharArray()) {
			if('A'<=ch && ch<='Z') {
				answer += (char)(ch - 'A' + 'a');
			} else {
				answer += (char)(ch - 'a' + 'A');
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Sec01_02 m2 = new Sec01_02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(m2.solution(str));
	}

}
