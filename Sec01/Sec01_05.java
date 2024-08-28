package sec01;
import java.util.*;

public class Sec01_05 {
	
	public String solution(String str) {
		String answer = "";
		int lt = 0, rt = str.length()-1; 
		char[] ch = str.toCharArray();
		while(lt<rt) {
			if(!Character.isAlphabetic(ch[lt])) {
				lt++;
			} else if(!Character.isAlphabetic(ch[rt])) {
				rt--;
			} else {
				char tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				lt++;
				rt--;
			}
		}
		String a = String.valueOf(ch);
		answer = a;
				
		return answer;
	}

	public static void main(String[] args) {
		Sec01_05 m5 = new Sec01_05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(m5.solution(str));
	}

}
