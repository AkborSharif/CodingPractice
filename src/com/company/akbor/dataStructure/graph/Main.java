package com.company.akbor.dataStructure.graph;

/*
 * vertex: each node is called vertex, vertices is plural of vertex
 * edge: two connected vertices makes an edge
 * Order: The number of vertices in the graph
 * Size: The number of edges in the graph
 * Vertex degree: The number of edges that are incident to a vertex
 * Isolated vertex: A vertex that is not connected to any other vertices in the graph
 * self-loop: An edge from a vertex to itself
 * Directed graph: A graph where all the edges have a direction indicating what is the start vertex and what is the end vertex
 * Undirected graph: A graph with edges that have no direction
 * Weighted graph: Edges of the graph has weights
 * Unweighted graph: Edges of the graph has no weights
 * */
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(3);
        graph.addEdges(0, 1);
        graph.addEdges(0, 2);
        graph.addEdges(2, 1);
        graph.print();

        GraphBFS bfs = new GraphBFS(3);
        bfs.addEdges(0, 1);
        bfs.addEdges(0, 2);
        bfs.addEdges(2, 1);
        bfs.bfsOnGrapgh(0);

        GraphDFS dfs = new GraphDFS(3);
        dfs.addEdges(0, 1);
        dfs.addEdges(0, 2);
        dfs.addEdges(2, 1);
        dfs.dfsOnGrapgh(0);
    }
}
