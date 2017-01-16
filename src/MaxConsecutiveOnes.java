/**
 * Created by K9A2S on 2017/1/16.
 */

/**
 * Create by Stormlin. All rights reserved.
 **/

public class MaxConsecutiveOnes {

    public void Show(int[] nums){
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0,j=0;i<nums.length;){
            if(nums[i]==1){
                j=i;
                count=0;
                while(j<nums.length&&nums[j]==1){
                    count++;
                    j++;
                }
                i+=count;
                if(count>max){
                    max=count;
                }
            }else{
                i++;
            }
        }
        return max;
    }
}
