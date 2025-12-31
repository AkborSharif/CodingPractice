package com.company.akbor.dataStructure.graph;

import java.util.ArrayList;
import java.util.List;

public class ArrayGrrayRep {
    public static void main(String[] args) {
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 4}, {3, 4}, {2, 3}};
        List<List<Integer>> adjlist = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            adjlist.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjlist.get(edge[0]).add(edge[1]);
            adjlist.get(edge[1]).add(edge[0]);
        }
        int i = 0;
        for (List<Integer> list : adjlist) {
            System.out.println(i + ": " + list.toString());
            i++;
        }
    }
}
