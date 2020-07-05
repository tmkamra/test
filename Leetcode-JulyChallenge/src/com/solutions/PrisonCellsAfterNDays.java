package com.solutions;

import java.util.Arrays;

public class PrisonCellsAfterNDays {

	public static void main(String[] args) {
		PrisonCellsAfterNDays prisonCellsAfterNDays = new PrisonCellsAfterNDays();
		System.out.println(Arrays.toString(prisonCellsAfterNDays.prisonAfterNDays(new int[] {1,0,0,1,0,0,1,0}, 1000000000)));

	}

	private int[] prisonAfterNDays(int[] cells, int N) {
        for(int i=0; i<N; i++)
        {
        	int[] copy = new int[8];
        	for(int j=0; j<8; j++) {
        		if(j==0)
        			copy[0] = 0;
	        	if(j!=0 && j!=7) 
	        	{
	        		if(cells[j+1] == cells[j-1])
	        			copy[j] = 1;
	        	}
	        	if(j==7)
	            	copy[7] = 0;
        	}
        	cells = copy;
        }
		return cells;
    }
}













//
//class Solution {
//    public int[] prisonAfterNDays(int[] cells, int N) {
//       int prevLeft=0;
//       N = N%14 == 0 ? 14 : N%14;
//       while(N > 0){
//           for(int i=0; i<cells.length-1; i++){
//               if(i == 0){
//                   prevLeft = cells[i]; 
//                   cells[i] = 0;
//               } else {
//                   if(prevLeft == cells[i+1]){
//                       prevLeft = cells[i]; 
//                       cells[i] = 1;
//                   } else {
//                       prevLeft = cells[i]; 
//                       cells[i] = 0;
//                   }
//                   if(i == cells.length-2){
//                       cells[cells.length-1] = 0;
//                   }
//               }
//           }
//           N--;
//       }
//       return cells;
//   }
//}


//
//
//class Solution {
//    public int[] prisonAfterNDays(int[] cells, int N) {
//		if(cells==null || cells.length==0 || N<=0) return cells;
//        boolean hasCycle = false;
//        int cycle = 0;
//        HashSet<String> set = new HashSet<>(); 
//        for(int i=0;i<N;i++){
//            int[] next = nextDay(cells);
//            String key = Arrays.toString(next);
//            if(!set.contains(key)){ 
//                set.add(key);
//                cycle++;
//            }
//            else{
//                hasCycle = true;
//                break;
//            }
//            cells = next;
//        }
//        if(hasCycle){
//            N = N%cycle;
//            for(int i=0;i<N;i++){
//                cells = nextDay(cells);
//            }   
//        }
//       
//        return cells;
//    }
//    
//    private int[] nextDay(int[] cells){
//        int[] tmp = new int[cells.length];
//        for(int i=1;i<cells.length-1;i++){
//            if(cells[i-1]==cells[i+1])
//                tmp[i] = 1;
//        }
//        return tmp;
//    }
//}
