package easy; /**
 * Created by K9A2S on 2016/11/28.
 */

/**
 * Create by Stormlin. All rights reserved.
 **/

public class ReverseString {

    public void Show(String input){
        System.out.println(reverseString(input));
    }

    private String reverseString(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
