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

        long double a=0;
        long double b=0;
        long double one=1;

        for (int i=num1.length()-1;i>=0;i--){
            a+=(num1.charAt(i)-48)*one;
            one*=10;
        }

        one=1;

        for (int i=num2.length()-1;i>=0;i--){
            b+=(num2.charAt(i)-48)*one;
            one*=10;
        }

        String s=new String(String.format("%f",a+b));

        //return String.valueOf(s.substring(0,s.length()-7));
        return String.valueOf(s.toString());

    }

}
