package easy; /**
 * Created by K9A2S on 2016/12/9.
 */

import java.awt.*;
import java.util.ArrayList;

/**
 * Create by Stormlin. All rights reserved.
 **/

public class MoveZeroes {

    public void Show(int[] nums){

    }

    private void moveZeroes(int[] nums) {
        ArrayList list=new ArrayList();
        ArrayList zero=new ArrayList();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==0){
                zero.add(0);
            }else{
                list.add(nums[i]);
            }
        }
        list.addAll(zero);
        for (int i=0;i<nums.length;i++){
            nums[i]=(int)list.get(i);
        }
    }

}
