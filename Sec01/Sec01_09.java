package sec01;
import java.util.*;

public class Sec01_09 {
	
	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		Sec01_09 m9 = new Sec01_09();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(m9.solution(str));
	}
}
