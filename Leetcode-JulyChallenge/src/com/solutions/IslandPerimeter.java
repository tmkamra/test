package com.leetcode.july;

public class IslandPerimeter {

	int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandPerimeter islandPerimeter = new IslandPerimeter();
		System.out.println(islandPerimeter.islandPerimeter(new int[][]{{0,1,0,0},
													 {1,1,1,0},
													 {0,1,0,0},
													 {1,1,0,0}}));

	}
	
	public int islandPerimeter(int[][] grid) {
		
		for(int i=0; i<grid.length; i++)
		{
			for(int j=0; j<grid[i].length; j++)
			{
				if(grid[i][j]==1)
				{
					dfs(i, j, grid);
					break;
				}
			}
		}
      return count;  
    }

	private void dfs(int i, int j, int[][] grid) {
		// TODO Auto-generated method stub
		if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]==0)
		{
			count++;
			return;
		}
		
		if(grid[i][j]==-1)
			return;
		
		grid[i][j] = -1;
		
		dfs(i+1, j, grid);
		dfs(i-1, j, grid);
		dfs(i, j+1, grid);
		dfs(i, j-1, grid);
		
	}

}



//class Solution {
//    public int islandPerimeter(int[][] grid) {
//        int count = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 1) {
//                    count += 4;
//                    if (i > 0 && grid[i - 1][j] == 1) {
//                        count -= 2;
//                    }
//                    if (j > 0 && grid[i][j - 1] == 1) {
//                        count -= 2;
//                    }
//                }
//            }
//        }
//        return count;
//    }
//}


//class Solution {
//    public int islandPerimeter(int[][] grid) {
//        // List<int[]> list = new ArrayList<>();
//        int res =0;
//        for(int i=0;i<grid.length;i++){
//            for(int j=0;j<grid[0].length;j++){
//                int[] index = {i,j};
//                if(grid[i][j]==1) {
//                    res = res + 4;
//                    //north
//                    if(i>0 && grid[i-1][j]==1){
//                        res=res-2;
//                    }
//                    //west
//                    if(j>0 && grid[i][j-1]==1){
//                        res=res-2;
//                    }
//                    // list.add(index);
//                }
//                    // if(!list.contains(index)){
//                    //     list.add(index);
//                    // }
//            }
//        }
//        // int res =0;
//        // for(int k=0;k<list.size();k++){
//        //     int count = 4;
//        //     int[] el = list.get(k);
//        //     int i=el[0];
//        //     int j=el[1];
//        //     // System.out.println(i+" "+j);
//        //     //north
//        //     if(i>0 && grid[i-1][j]==1){
//        //         count--;
//        //     }
//        //     //south
//        //     if(i<grid.length-1 && grid[i+1][j]==1){
//        //         count--;
//        //     }
//        //     //east
//        //     if(j<grid[0].length-1 && grid[i][j+1]==1){
//        //         count--;
//        //     }
//        //     //west
//        //     if(j>0 && grid[i][j-1]==1){
//        //         count--;
//        //     }
//        //     res = res+count;
//        // }
//        return res;
//    }
//}

//
//You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
//
//Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
//
//The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
//
// 
//
//Example:
//
//Input:
//[[0,1,0,0],
// [1,1,1,0],
// [0,1,0,0],
// [1,1,0,0]]
//
//Output: 16
//
//Explanation: The perimeter is the 16 yellow stripes in the image below:
//
