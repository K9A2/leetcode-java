package easy; /**
 * Created by K9A2S on 2016/12/5.
 */

import java.util.HashSet;

/**
 * Create by Stormlin. All rights reserved.
 **/

public class IntersectionOfTwoArrays {

    public void Show(int[] nums1, int[] nums2){
        System.out.println(intersection(nums1,nums2));
    }

    private int[] intersection(int[] nums1, int[] nums2) {

        HashSet hs=new HashSet();

        HashSet hs1=new HashSet();

        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            hs1.add(nums2[i]);
        }

        hs.retainAll(hs1);

        Object[] obj = hs.toArray();
        int temp[] = new int[obj.length];
        for (int i = 0; i < obj.length; i++) {
            temp[i] = (int) obj[i];
        }

        return temp;
    }

}
