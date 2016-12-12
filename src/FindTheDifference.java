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
        int length=(s.length()>=t.length())?t.length():s.length();

        for(int i=0;i<length;i++){
            result^=s.charAt(i);
            result^=t.charAt(i);
        }

        return (s.length()>=t.length())?(char)(result^s.charAt(s.length()-1)):(char)(result^t.charAt(t.length()-1));

        //Code below runs more slower than the code shown above
        /**
        char result=0;

        for(int i=0;i<s.length();i++){
            result^=s.charAt(i);
        }

        for(int j=0;j<t.length();j++){
            result^=t.charAt(j);
        }

        return result;
         **/
    }

}
