/**
 * Created by K9A2S on 2016/12/5.
 */

/**
 * Create by Stormlin. All rights reserved.
 **/

public class NimGame {

    public void Show(int n){
        System.out.println(canWinNim(n));
    }

    private boolean canWinNim(int n){
        return (n%4==0)?false:true;
    }

}
