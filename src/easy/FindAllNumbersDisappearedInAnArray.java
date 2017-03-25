package easy; /**
 * Created by K9A2S on 2017/1/16.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Create by Stormlin. All rights reserved.
 **/

public class FindAllNumbersDisappearedInAnArray {

    public void Show(int[] nums){
        System.out.println(findDisappearedNumbers(nums));
    }

    private List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result=new ArrayList<Integer>();

        int index=0;

        for(int i=0;i<nums.length;i++){
            index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }

        return result;

    }

}
