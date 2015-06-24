import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;


public class Graph {
	HashMap<Integer, Node> nodes;
	HashMap<Integer, HashMap<Integer, Node>> adList;
	
	public Graph(HashMap<Integer, Node> V, HashMap<Integer, HashMap<Integer, Node>> E) {
		nodes = V;
		adList = E;
		
	}
	public Graph(){
		nodes = new HashMap<Integer, Node>();
		adList = new HashMap<Integer, HashMap<Integer, Node>>();
	}
	
	//SETter 
	
	//GETter 
	
	public int nodeSize(){
		return nodes.size();
	}
	
	public Node getNode(int index){
		if(index < nodes.size()&& index >=0){
			return nodes.get(index);
		}else{
			throw new RuntimeException("GetNode Error: Bereichsüberschreitung");
		}
	}
	
	//Operations
	public void insert(Node a, Node b){
		nodes.put(a.getKey(), a);
		nodes.put(b.getKey(), b);
		if(adList.get(a.getKey())== null) adList.put(a.getKey(), new HashMap<Integer, Node>());
		if(adList.get(b.getKey())== null) adList.put(b.getKey(), new HashMap<Integer, Node>());
		adList.get(a.getKey()).put(b.getKey(),b);
		adList.get(b.getKey()).put(a.getKey(),a);
	}
	
	//Visualization
	public void printAdList(){
		
		for(Node n : nodes.values()){
			System.out.print(n.getKey());
			for(Node t: adList.get(n.getKey()).values()){
				System.out.print("-> " + t.getKey());
			}
			System.out.println();
			
		}
	}
}
