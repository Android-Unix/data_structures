package DataStructures;

public class IsCyclic {
	boolean isCyclic;
	
	boolean[] marked;
	
	public IsCyclic(Graphs g , int v) {
		marked = new boolean[g.getV()];
		
		checkCyclic(g , v , v);
		
	}
	
	private void checkCyclic(Graphs g , int startingVertex , int adj) {
		
		marked[startingVertex] = true;
		
		for(int w : g.getAdj(startingVertex)) {
			if(isCyclic)
				return;
			
			if(!marked[w]) {
				
				System.out.println("w: " + w );
				
				marked[w] = true;
				
				checkCyclic(g , w , startingVertex);
				
			}
			else if(adj != w)
			{
				isCyclic = true;
			}
		}
		
	}
}
