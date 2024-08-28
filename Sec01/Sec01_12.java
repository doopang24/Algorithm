package sec01;
import java.util.*;

public class Sec01_12 {
	
	public String solution(int num, String str) {
		String answer = "";
		for(int i=0; i<num; i++) {
			String tmp = str.substring(0,7).replace("#", "1").replace("*", "0");
			int word = Integer.parseInt(tmp,2);
			answer += (char)word;
			str = str.substring(7);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec01_12 m12 = new Sec01_12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s = kb.next();
		System.out.println(m12.solution(n, s));
	}
}
