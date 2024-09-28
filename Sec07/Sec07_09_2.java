package sec07;
import java.util.*;

class Node6 {
	int data;
	Node6 lt, rt;
	public Node6(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Sec07_09_2 {
	Node6 root;
	
	public int BFS(Node6 root) {
		Queue<Node6> queue = new LinkedList<>();
		queue.offer(root);
		int level = 0;
		while(!queue.isEmpty()) {
			int length = queue.size();
			for(int i=0; i<length; i++) {
				Node6 current = queue.poll();
				if(current.lt==null && current.rt==null) return level;
				if(current.lt!=null) queue.offer(current.lt);
				if(current.rt!=null) queue.offer(current.rt);
			}
			level++;
		}
		return 0;
	}

	public static void main(String[] args) {
		Sec07_09_2 tree = new Sec07_09_2();
		tree.root = new Node6(1);
		tree.root.lt = new Node6(2);
		tree.root.rt = new Node6(3);
		tree.root.lt.lt = new Node6(4);
		tree.root.lt.rt = new Node6(5);
		System.out.println(tree.BFS(tree.root));

	}

}
