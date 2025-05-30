package leetCodeInterviewPrep.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.

A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

 

Example 1:


Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
Output: 1
Explanation: There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]
Example 2:


Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
Output: 3
Explanation: There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]
 

Constraints:

n == grid.length == grid[i].length
1 <= n <= 200
1 <= grid[i][j] <= 105
 */
public class EqualRowandColumn {




    public static void main(String[] args) {
        int[][] grid = {{3,1,2,2},
                        {1,4,4,4},
                        {2,4,2,2},
                        {2,5,2,2}};

        int[][] grid2 = {{3,2,1},
                         {1,7,6},
                         {2,7,7}};

        int[][] grid3 = {{3,1,2,2},
                         {1,4,4,5},
                         {2,4,2,2},
                         {2,4,2,2}};
        

        System.out.println(equalPairs(grid));
    }


    public static int equalPairs(int[][] grid) {
        
        Map<List<Integer>, Integer> map = new HashMap<>();


//  rows
        for (int i = 0; i < grid.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0;j<grid.length;j++){
                row.add(grid[i][j]);
            }
            map.put(row, map.getOrDefault(row,0)+1);
        }
        int result = 0;
//columns
        for (int i = 0; i < grid.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0;j<grid.length;j++){
                row.add(grid[j][i]);
            }

            if(map.containsKey(row)){
                result += map.get(row);
            }
        }


       


        return result;

    }
}
