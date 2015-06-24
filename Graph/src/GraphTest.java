public class GraphTest {
	public static void main(String[] args) {
		Graph g = new Graph();
		for(int i = 0; i<=5; i++){
			g.insert(new Node(i*2), new Node(i*2+1));
			
			int rand = (int) (Math.random()*i+1);
			Node b = g.getNode(i);
			Node a = g.getNode(rand);
			g.insert(b, a);
		}
	
		
		
		g.printAdList();
		g.printAdMatrix();
	}
}
