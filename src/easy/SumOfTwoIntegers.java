package easy; /**
 * Created by K9A2S on 2016/12/5.
 */

/**
 * Create by Stormlin. All rights reserved.
 **/

public class SumOfTwoIntegers {

    public void Show(int a,int b){
        System.out.println(getSum(a,b));
    }

    private int getSum(int a,int b){

        int carry=0;

        while (b!=0){
            carry=a&b;
            a=a^b;
            b=carry<<1;
        }

        return a;
    }

}
