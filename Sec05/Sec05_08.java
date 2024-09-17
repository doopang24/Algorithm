package sec05;
import java.util.*;
import java.io.*;

class Person {
	int id; 
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Sec05_08 {
	
	public int solution(int num, int me, int[] emerList) {
		int answer = 0;
		Queue<Person> queue = new LinkedList<>();
		for(int i=0; i<num; i++) {
			queue.offer(new Person(i, emerList[i]));
		}
		while(!queue.isEmpty()) {
			Person tmp = queue.poll();
			for(Person x : queue) {
				if(tmp.priority < x.priority) {
					queue.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==me) return answer;
			}
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		Sec05_08 m8 = new Sec05_08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		System.out.println(m8.solution(n, m, arr));		
	}
}
