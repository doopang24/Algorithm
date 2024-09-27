package sec07;
import java.util.*;

public class Sec07_08 {
	int[] dis = {1, -1, 5};
	int[] check;
	Queue<Integer> queue = new LinkedList<>();
	
	public int BFS(int s, int e) {
		check = new int[10001];									
		check[s] = 1;											
		queue.offer(s);											
		int level = 0;											
		while(!queue.isEmpty()) {								
			int length = queue.size();							
			for(int i=0; i<length; i++) {						
				int x = queue.poll();
				for(int j=0; j<3; j++) {
					int nx = x + dis[j];
					if(nx==e) return level+1;
					if(nx>=1 && nx<=10000 && check[nx]==0) { 	
						check[nx] = 1;							
						queue.offer(nx);						
					}
				}
			}
			level++;
		}
		return 0;
	}

	public static void main(String[] args) {
		Sec07_08 m8 = new Sec07_08();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();	// 현재 위치
		int e = kb.nextInt();	// 송아지 위치
		System.out.println(m8.BFS(s, e));		
	}
}
