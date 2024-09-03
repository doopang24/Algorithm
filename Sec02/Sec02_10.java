package sec02;
import java.util.*;

public class Sec02_10 {
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public int solution(int len, int[][] map) {
		int answer = 0; 
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				boolean top = true;
				for(int k=0; k<dx.length; k++) {
					int lenx = i + dx[k];
					int leny = j + dy[k];
					if(lenx>=0 && lenx<len && leny>=0 && leny<len && map[lenx][leny]>=map[i][j]) {
						top = false;
						break;
					}
				}
				if(top) answer++;
			}
		}
		
		return answer;
	}
	
/*	public int solution(int len, int[][] map) {
		int answer = 0;
		
		int[][] extend = new int[len+2][len+2];
		for(int i=0; i<len+2; i++) {
			for(int j=0; j<len+2; j++) {
				if(i==0 || j==0 || i==len+1 || j==len+1) {
					extend[i][j] = 0; 
				} else {
					extend[i][j] = map[i-1][j-1]; 
				}
			}
		}		
		for(int i=1; i<len+1; i++) {
			for(int j=1; j<len+1; j++) {
				if(extend[i][j]>extend[i-1][j] && extend[i][j]>extend[i][j-1] && extend[i][j]>extend[i+1][j] && extend[i][j]>extend[i][j+1]) {
					answer++;
				}
			}
		}		
		return answer;
	} */

	public static void main(String[] args) {
		Sec02_10 m10 = new Sec02_10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr2D = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr2D[i][j] = kb.nextInt();
			}
		}
		System.out.println(m10.solution(n, arr2D));

	}

}
