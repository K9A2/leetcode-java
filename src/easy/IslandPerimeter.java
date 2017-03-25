/**
 * Created by K9A2S on 2016/12/1.
 */

/**
 * Create by Stormlin. All rights reserved.
 **/

/**
 *
 * Sample test case used in Main is shown below
 *
 *  FizzBuzz fizzBuzz=new FizzBuzz();
 *  fizzBuzz.Show(15);
 *
 */

public class IslandPerimeter {

    public void Show(int [][] grid){

        System.out.println(islandPerimeter(grid));

    }

    private int islandPerimeter(int [][] grid) {

        int rows=grid.length;
        int cols=grid[0].length;

        int result=0;

        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                int count=0;
                if (grid[i][j]==1){
                    if(i!=0&&grid[i-1][j]==1){
                        count++;
                    }
                    if (i!=rows-1&&grid[i+1][j]==1){
                        count++;
                    }
                    if (j!=0&&grid[i][j-1]==1){
                        count++;
                    }
                    if (j!=cols-1&&grid[i][j+1]==1){
                        count++;
                    }
                    result+=4-count;
                }
            }
        }

        return result;

    }

}
