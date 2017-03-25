package easy; /**
 * Created by K9A2S on 2016/12/5.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Create by Stormlin. All rights reserved.
 **/

public class MajorityElement {

    public void Show(int[] nums){
        System.out.println(majorityElement(nums));
    }

    private int majorityElement(int[] nums){

        if(nums.length==1){
            return nums[0];
        }

        int count=0;

        int max=0;

        Arrays.sort(nums);

        int result=nums[0];

        int target=nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }else{
                if (count > max) {
                    max=count;
                    result=target;
                }
                target=nums[i];
                count=1;
            }
        }

        if (count > max) {
            max=count;
            result=target;
        }

        return result;
    }

}
