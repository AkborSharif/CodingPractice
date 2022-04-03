package com.company.akbor.codingProblems.array;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class AmazonKClosestPointToOrigin {

    public static int[][] kClosest(int[][] points, int k) {

        Queue<int[]> queue = new PriorityQueue<>((a, b) -> b[0] * b[0] + b[1] * b[1] - a[0] * a[0] - a[1] * a[1]);

        for (int i = 0; i < points.length; i++) {
            queue.add(new int[]{points[i][0], points[i][1]});

            queue.stream().forEach(a-> System.out.print(Arrays.toString(a)));
            System.out.println();
            if (queue.size() > k) {
                queue.poll();
            }
        }



        int[][] answer = new int[k][2];

        for (int i = 0; i < k; i++) {
            answer[i] = queue.poll();
        }

        return answer;

    }

    public static void main(String[] args) {
        int [][] points = {{3,3},{5,-1}, {-2, 4}, {0,0}};
        int k = 2;
        int [][] ans = kClosest(points,k);

        for (int [] i:ans) {
            System.out.print(Arrays.toString(i) + " ");
            }
    }
}
