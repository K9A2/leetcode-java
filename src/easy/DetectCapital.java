/*
  Author: stormlin
  Personal Website: www.stormlin.com
  Problem Name: 520. Detect Capital
  Problem Address: https://leetcode.com/problems/detect-capital/#/description
  Solution Date: Apr. 18, 2017
  -----------------------------------------------------------------------------
  Problem Description:
  Given a word, you need to judge whether the usage of capitals in it is right
  or not.

  We define the usage of capitals in a word to be right when one of the
  following cases holds:

  All letters in this word are capitals, like "USA".
  All letters in this word are not capitals, like "leetcode".
  Only the first letter in this word is capital if it has more than one letter,
  like "Google".
  Otherwise, we define that this word doesn't use capitals in a right way.
  -----------------------------------------------------------------------------
  Example 1:
  Input: "USA"
  Output: True
  -----------------------------------------------------------------------------
  Example 2:
  Input: "FlaG"
  Output: False
  -----------------------------------------------------------------------------
  Note: The input will be a non-empty word consisting of uppercase and lowercase
  latin letters.
 */

package easy;

/**
 * Verify the input string whether it is a "right-used" word.
 */

public class DetectCapital {

    /**
     * Use regular expression to match the input. If it matches the patterns
     * designed for "right-used" word, it returns true. If not, it returns
     * false.
     *
     * @param word Words input.
     * @return A boolean value. If matches, it is true, while the rest is false.
     */
    public boolean detectCapitalUse(String word) {


        //The first expression is designed for words like "USA";
        //The second expression is designed for words like "leetcode";
        //The third expression is designed for words like "Google".
        return word.matches("[A-Z]*") || word.matches("[A-Z]{1}[a-z]*") || word
                .matches("[a-z]*");

    }

}
