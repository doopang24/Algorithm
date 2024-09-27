package sec07;
import java.util.*;

class Node3 {
	int data;
	Node3 lt, rt;
	public Node3(int val) {
		data = val;
		lt=rt=null;
	}
}

public class Sec07_07 {
	Node3 root;
	
	public void BFS(Node3 root) {
		Queue<Node3> queue = new LinkedList<>();				
		queue.offer(root);										
		int Level = 0;											
		while(!queue.isEmpty()) {								
			System.out.print(Level + " : ");					
			int length = queue.size();							
			for(int i=0; i<length; i++) {						
				Node3 current = queue.poll();					
				System.out.print(current.data + " ");			
				if(current.lt!=null) queue.offer(current.lt);	
				if(current.rt!=null) queue.offer(current.rt);	
			}
			Level++;											
			System.out.println();								
		}
	}

	public static void main(String[] args) {
		Sec07_07 tree = new Sec07_07();
		tree.root = new Node3(1);
		tree.root.lt = new Node3(2);
		tree.root.rt = new Node3(3);
		tree.root.lt.lt = new Node3(4);
		tree.root.lt.rt = new Node3(5);
		tree.root.rt.lt = new Node3(6);
		tree.root.rt.rt = new Node3(7);
		tree.BFS(tree.root);
	}
}
