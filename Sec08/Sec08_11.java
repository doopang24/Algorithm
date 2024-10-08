package sec08;
import java.util.*;

class Point {
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Sec08_11 {
	static int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
	static int[][] maze, dist; 
	
	public void BFS(int x, int y) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(x, y));
		dist[x][y] = 0;
		while(!queue.isEmpty()) {
			Point tmp = queue.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && maze[nx][ny]==0) {
					maze[nx][ny] = 1;
					queue.offer(new Point(nx, ny));
					dist[nx][ny] = dist[tmp.x][tmp.y] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Sec08_11 m11 = new Sec08_11();
		Scanner kb = new Scanner(System.in);
		maze = new int[8][8];
		dist = new int[8][8];
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				maze[i][j] = kb.nextInt(); 
			}
		}
		m11.BFS(1, 1);
		if(dist[7][7]==0) System.out.println(-1);
		else System.out.println(dist[7][7]);
	}
}
