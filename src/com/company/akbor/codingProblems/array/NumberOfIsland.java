package com.company.akbor.codingProblems.array;

public class NumberOfIsland {
    public static int numIslands(char[][] grid) {
        int count =0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){

                if(grid[i][j] == '1'){
                    count++;
                    DFS(grid, i , j);
                }
            }
        }
        return count;
    }
    public static void DFS (char[][] grid, int i, int j){
        if(i<0 || i>= grid.length|| j<0 || j>= grid[i].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        DFS(grid, i+1 , j); //down
        DFS(grid, i-1 , j); //up
        DFS(grid, i , j-1); //left
        DFS(grid, i , j+1); //right


    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int numOfIsland = numIslands(grid);
        System.out.println(numOfIsland);
    }
}
