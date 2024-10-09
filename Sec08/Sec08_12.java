package sec08;
import java.util.*;

class Point2 {
	public int x, y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Sec08_12 {
	static int n, m;
	static int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
	static int[][] box, dist;
	Queue<Point2> queue = new LinkedList<>();
	
	public void BFS() {
		while(!queue.isEmpty()) {
			Point2 tmp = queue.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<m && box[nx][ny]==0) {
					box[nx][ny] = 1;
					dist[nx][ny] = dist[tmp.x][tmp.y] + 1;
					queue.offer(new Point2(nx, ny));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Sec08_12 m12 = new Sec08_12();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		box = new int[n][m];
		dist = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				box[i][j] = kb.nextInt();
				if(box[i][j]==1) m12.queue.offer(new Point2(i, j));
			}
		}
		m12.BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(box[i][j]==0) flag = false;
			}
		}
		if(flag) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					answer = Math.max(dist[i][j], answer);
				}
			}
			System.out.println(answer);
		} else {
			System.out.println(-1);
		}
	}
}
