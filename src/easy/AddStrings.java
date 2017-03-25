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
        int carry=0;

        int sum=0;

        StringBuilder stringBuilder=new StringBuilder();

        if (num1.length()>num2.length()){
            num2=AddZero(num2,num1.length()-num2.length());
        }else {
            num1=AddZero(num1,num2.length()-num1.length());
        }

        for(int i=num1.length()-1;i>=0;i--){
            sum=(num1.charAt(i)-48)+(num2.charAt(i)-48)+carry;
            if (sum>9){
                stringBuilder.append(sum-10);
                carry=1;
            }else {
                stringBuilder.append(sum);
                carry=0;
            }
        }

        if (carry==1){
            stringBuilder.append(1);
        }

        return stringBuilder.reverse().toString();
    }
    private String AddZero(String s,int count){

        StringBuilder stringBuilder=new StringBuilder();

        for(int i=0;i<count;i++){
            stringBuilder.append("0");
        }

        stringBuilder.append(s);

        return stringBuilder.toString();
    }

}
