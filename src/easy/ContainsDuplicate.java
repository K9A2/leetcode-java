/**
 * Created by K9A2S on 2016/12/9.
 */

import java.util.HashSet;

/**
 * Create by Stormlin. All rights reserved.
 **/

public class ContainsDuplicate {

    public void Show(int[] nums){
        System.out.println(containsDuplicate(nums));
    }

    private boolean containsDuplicate(int[] nums) {
        HashSet hashSet=new HashSet();
        if (nums.length==0||nums.length==1){
            return false;
        }
        //HashSet hashSet=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!hashSet.add(nums[i])){
                return true;
            }
        }
        return false;
    }

}
