package easy; /**
 * Created by K9A2S on 2016/12/5.
 */

/**
 * Create by Stormlin. All rights reserved.
 **/

public class AddDigits {

    public void Show(int num){
        System.out.println(addDigits(num));
    }

    private int addDigits(int num){
        String s=String.valueOf(num);
        return (s.length()==1)?s.charAt(0)-48:getCalculate(s);
    }

    private int getCalculate(String s){
        int sum=0;
        while(s.length()!=1){
            sum=0;
            for(int i=0;i<s.length();i++){
                sum+=s.charAt(i)-48;
            }
            s=String.valueOf(sum);
        }
        return s.charAt(0)-48;
    }

}
