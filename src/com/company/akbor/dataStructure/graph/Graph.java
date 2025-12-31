package com.company.akbor.dataStructure.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    int vertices;
    public List<List<Integer>> adjacentList = new ArrayList<>();

    Graph(int vertices) {
        this.vertices = vertices;
        for (int i = 0; i < vertices; i++) {
            adjacentList.add(new ArrayList<>());
        }
    }

    public void addEdges(int from, int to) {
        adjacentList.get(from).add(to);
    }

    public int getVertices() {
        return vertices;
    }

    public void print() {
        int i = 0;
        System.out.println("Graph(Adjacent List): ");
        for (List<Integer> a : adjacentList) {
            System.out.println(i + ": " + a);
            i++;
        }
        System.out.println("Edges:");
        for (int j = 0; j < vertices; j++) {
            for (int k = 0; k < adjacentList.get(j).size(); k++) {
                System.out.print("(" + j + "->" + adjacentList.get(j).get(k) + "),");
            }
        }
        System.out.println();
    }
}
