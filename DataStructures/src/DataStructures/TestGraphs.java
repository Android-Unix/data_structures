package DataStructures;

public class TestGraphs {

	public static void main(String[] a) {
		
		Graphs g = new Graphs(7);
		
		g.addEdge(0 , 1);
		g.addEdge(0 , 2);
		g.addEdge(1 , 2);
		g.addEdge(1 , 3);
		g.addEdge(1 , 4);
		
		g.addEdge(2 , 5);
		
		
		g.addEdge(2 , 6);
		
		
		g.print();
		
		System.out.println();
		DFS dfs = new DFS(g , 0);
		
		System.out.println("---");
		
		BFS bfs = new BFS(g , 0);
		
		IsCyclic check = new IsCyclic(g, 0);
		System.out.println(check.isCyclic);
	}
}
