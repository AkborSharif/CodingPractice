package com.company.akbor.dataStructure.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphBFS extends Graph {
    GraphBFS(int vertices) {
        super(vertices);
    }

    public void bfsOnGrapgh(int start) {
        System.out.print("BFS: ");
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            int pop = q.poll();
            System.out.print(pop + " ");
            for (Integer l : adjacentList.get(pop)) {
                if (!visited.contains(l)) {
                    q.add(l);
                    visited.add(l);
                }
            }
        }
        System.out.println();
    }
}
