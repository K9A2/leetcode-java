package easy; /**
 * Created by K9A2S on 2016/12/9.
 */

/**
 * Create by Stormlin. All rights reserved.
 **/

public class SingleNumber {

    public void Show(int[] nums){
        System.out.println(singleNumber(nums));
    }

    private int singleNumber(int[] nums) {
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }

}
