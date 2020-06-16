package DataStructures;

public class DFS {
	boolean[] marked;
	
	
	public DFS(Graphs G , int startingVertex) {
		
		marked = new boolean[G.getV()];
		
		dfs(G , startingVertex);
		
	}
	
	private void dfs(Graphs G , int startingVertex) {
		
		marked[startingVertex] = true;
		
		System.out.println(startingVertex);
		
		for(int w : G.getAdj(startingVertex)) {
			
			if(!marked[w]){
				dfs(G , w);
			}
		}
		
		
	}
	
}
