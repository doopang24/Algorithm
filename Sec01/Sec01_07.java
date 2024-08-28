package sec01;
import java.util.*;

public class Sec01_07 {
	
	public String solution(String str) {
		String answer = "YES";
		String tmp = new StringBuilder(str).reverse().toString();
		if(!str.equalsIgnoreCase(tmp)) return "NO";
		
		return answer;
	}

	public static void main(String[] args) {
		Sec01_07 m7 = new Sec01_07();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(m7.solution(str));
	}
}
