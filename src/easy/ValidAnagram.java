/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 242. Valid Anagram
 * Problem Address: https://leetcode.com/problems/valid-anagram/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * -----------------------------------------------------------------------------
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * -----------------------------------------------------------------------------
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */

package easy;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        //Here is a optimized example, costs 5ms
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }

        char[] sa = s.toCharArray();
        char[] st = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(st);

        return String.valueOf(sa).equals(String.valueOf(st));

        //Below is a example without optimization, costs 800+ms

        /**
         if (s.length()!=t.length()){
         return false;
         }else if (s.length()==0&&t.length()==0){
         return true;
         }else{
         StringBuilder sb=new StringBuilder();
         StringBuilder tb=new StringBuilder();
         for (int i=0;i<s.length();i++){
         if (s.charAt(i)!=t.charAt(i)){
         sb.append(s.charAt(i));
         tb.append(t.charAt(i));
         }
         }
         int sl=sb.length();
         int tl=tb.length();
         for(int i=0;i<sl;i++){
         for (int j=0;j<tl;j++){
         if (sb.charAt(i)==tb.charAt(j)){
         sb.deleteCharAt(i);
         tb.deleteCharAt(j);
         sl--;
         tl--;
         i=0;
         j=-1;
         }
         }
         }
         if(sb.length()!=0||tb.length()!=0){
         return false;
         }
         }

         return true;
         **/
    }

}
