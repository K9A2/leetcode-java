/**
 * Created by K9A2S on 2016/12/5.
 */

/**
 * Create by Stormlin. All rights reserved.
 **/

public class FindTheDifference {

    public void Show(String s,String t){
        System.out.println(findTheDifference(s,t));
    }

    private char findTheDifference(String s, String t) {
        char result=0;

        for(int i=0;i<s.length();i++){
            result^=s.charAt(i);
        }

        for(int j=0;j<t.length();j++){
            result^=t.charAt(j);
        }

        return result;
    }

}
