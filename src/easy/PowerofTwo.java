/**
 * Created by K9A2S on 2016/11/28.
 */

/**
 * Create by Stormlin. All rights reserved.
 **/

/**
 *
 * Sample test case used in Main is shown below
 *
 *  PowerofTwo powerofTwo=new PowerofTwo();
 *  powerofTwo.Show(15);
 *
 */

public class PowerofTwo {

    public void Show(int n){
        if (isPowerOfTwo(n)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    private boolean isPowerOfTwo(int n) {

        int count=0;

        if(n==0){
            return false;
        }

        if(n<0){
            return false;
        }

        for (int i=0;i<32;i++){
            if ((n&1)==1){
                count++;
            }
            n=n>>1;
            if (count>1){
                return false;
            }
        }

        return true;

    }
}
