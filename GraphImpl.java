//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class GraphImpl {
//
//	static class Edge {
//		int src, des;
//
//		public Edge(int src, int des) {
//			this.src = src;
//			this.des = des;
//		}
//	}
//
//	List<List<Integer>> adj = new ArrayList<>();
//
//	public GraphImpl(List<Edge> edges) {
//
//		for (int i = 0; i < edges.size(); i++)
//			adj.add(i, new ArrayList<>());
//
//		for (Edge current : edges) {
//			adj.get(current.src).add(current.des);
//			adj.get(current.des).add(current.src);
//		}
//
//	}
//
//	public static void main(String[] args) {
//
//		List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(1, 0), new Edge(2, 1), new Edge(1, 2), new Edge(0, 3),
//				new Edge(3, 0), new Edge(0, 4), new Edge(4, 0), new Edge(3, 4), new Edge(4, 3));
//
//		GraphImpl graph = new GraphImpl(edges);
//		printGraph(graph);
//	}
//
//	private static void printGraph(GraphImpl graph) {
//
//		int size = 0;
//		int n = graph.adj.size();
//
//		while (size < n) {
//			for (int dest : graph.adj.get(size))
//				System.out.println("(" + size + " ->" + dest + ")\n");
//			size++;
//
//		}
//
//	}
//
//}