package com.company.akbor.dataStructure.graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class GraphDFS extends Graph {
    GraphDFS(int vertices) {
        super(vertices);
    }

    public void dfsOnGrapgh(int start) {
        System.out.print("DFS: ");
        Stack<Integer> s = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        s.add(start);
        visited.add(start);

        while (!s.isEmpty()) {
            int pop = s.pop();
            System.out.print(pop + " ");
            for (Integer l : adjacentList.get(pop)) {
                if (!visited.contains(l)) {
                    s.add(l);
                    visited.add(l);
                }
            }
        }
        System.out.println();
    }
}
