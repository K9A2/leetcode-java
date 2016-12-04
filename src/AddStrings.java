/**
 * Created by K9A2S on 2016/12/1.
 */

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Create by Stormlin. All rights reserved.
 **/

public class AddStrings {

    public void Show(String num1,String num2){

        System.out.println(addStrings(num1,num2));

    }

    private String addStrings(String num1, String num2) {

        int max=(num1.length()<=num2.length())?num1.length():num2.length();

        StringBuilder stringBuilder=new StringBuilder();

        int carry=0;

        int sum=0;

        int l1=num1.length()-1;
        int l2=num2.length()-1;

        int i=0;

        for (i=0;i<max;i++){
            sum=(num1.charAt(l1-i)-48)+(num2.charAt(l2-i)-48)+carry;
            if(sum>=10){
                carry=1;
                stringBuilder.append(sum-10);
            }else{
                stringBuilder.append(sum);
            }
        }

        i=max;
        if(num1.length()>num2.length()){
            while(carry!=0){
                int result=(((num1.charAt(i-1)-48)+carry)>=10)?ture:false;
                stringBuilder.append()
            }
        }else if (num1.length()==num2.length()){
            stringBuilder.append(1);
        }else{
            while(carry!=0){

            }
        }

        return stringBuilder.reverse().toString();
    }

}
