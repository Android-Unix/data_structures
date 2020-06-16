package DataStructures;

import java.util.Queue;
import java.util.LinkedList;

public class BFS {
	
	private boolean[] marked;
	private Queue<Integer> queue;
	
	
	public BFS(Graphs g , int startingVertex) {
		
		marked = new boolean[g.getV()];
		queue = new LinkedList<Integer>();
		
		bfs(g , startingVertex);
		
	}
	
	private void bfs(Graphs g , int startingVertex) {
		
		marked[startingVertex] = true;
		
		queue.add(startingVertex);
		
		while(!queue.isEmpty()) {
			
			System.out.println(queue);
			
			startingVertex = queue.remove();
			
			System.out.println(startingVertex);
			
			for(int w : g.getAdj(startingVertex)) {
				if(!marked[w]) {
					
					marked[w] = true;
					queue.add(w);
					
				}
			}
			
		}
	}
}
