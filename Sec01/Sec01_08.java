package sec01;
import java.util.*;

public class Sec01_08 {
	
	public String solution(String s) {
		String answer = "YES";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(!s.equalsIgnoreCase(tmp)) return "NO";
		
		return answer;
	}

	public static void main(String[] args) {
		Sec01_08 m8 = new Sec01_08();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(m8.solution(str));
	}
}
