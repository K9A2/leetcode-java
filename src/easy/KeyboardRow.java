/*
  Author: stormlin
  Personal Website: www.stormlin.com
  Problem Name: 500. Keyboard Row
  Problem Address: https://leetcode.com/problems/keyboard-row/#/description
  Solution Date: Apr. 18, 2017
  -----------------------------------------------------------------------------
  Problem Description:
  Given a List of words, return the words that can be typed using
  letters of alphabet on only one row's of American keyboard.
  -----------------------------------------------------------------------------
  Example:

  Input:
  ["Hello", "Alaska", "Dad", "Peace"]

  Output:
  ["Alaska", "Dad"]

  Explanation:

  Only "Alaska" and "Dad" contains the letters in a single row.
  "Hello" contains the letter from row "qwertyuiop" and row "asdfghjkl".
 */

package easy;

import java.util.ArrayList;

public class KeyboardRow {

    /**
     * Match the words with regular expression for each row. If all failed,
     * meaning that this word can not be type within one of the three single
     * row.
     *
     * @param words Words array.
     * @return Words that can be typed with a single row in American keyboard.
     */
    public String[] findWords(String[] words) {

        //This is a relatively slow but with a good looking, made by lixx2100.
        //return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            String com = word.toLowerCase();
            if (com.matches("[qwertyuiop]*") || com.matches("[asdfghjkl]*") || com.matches("[zxcvbnm]*")) {
                result.add(word);
            }
        }

        String[] ret = new String[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ret[i] = result.get(i);
        }

        return ret;

    }

}
