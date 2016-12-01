import java.util.ArrayList;
import java.util.List;

/**
 * Create by Stormlin. All rights reserved.
 **/

public class Main {

    public static void main(String []args){

        int [][] gird={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};

        IslandPerimeter islandPerimeter=new IslandPerimeter();
        islandPerimeter.Show(gird);

    }

}

