package DataStructures;

import java.util.LinkedList;

public class Graphs {
	private int v;
	private LinkedList<Integer>[]  adj;
	
	
	@SuppressWarnings("unchecked")
	public Graphs(int v){
		this.v = v;
		
		adj = new LinkedList[v];

		for(int i = 0; i < this.v; i++)
			adj[i] = new LinkedList<Integer>();
	}
	
	public int getV() {
		return this.v;
	}
	
	public void addEdge(int source , int destination) {
		
		//linking source vertex with destination vertex
		adj[source].add(destination);
		
		//linking destinaiton vertex with source vertex
		adj[destination].add(source);	
		
	}
	
	public LinkedList<Integer> getAdj(int v){	
		return adj[v];
	}
	
	
	public void print() {
		
		for(int i = 0; i < this.v; i++) {
			System.out.println(i + "-->" + getAdj(i));
		}
	}
}
