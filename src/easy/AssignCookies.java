/**
 * Created by K9A2S on 2016/12/9.
 */

import java.util.Arrays;

/**
 * Create by Stormlin. All rights reserved.
 **/

public class AssignCookies {

    public void Show(int[] g, int[] s){
        System.out.println(findContentChildren(g,s));
    }

    private int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int m=0;
        int n=0;
        int q=0;
        for(m = 0; m < g.length; m++)
        {
            for(n = q; n < s.length; n++)
            {
                if (s[n] >= g[m]&&s[n]>0) {
                    s[n] = 0;
                    count++;
                    q = n++;
                    break;
                }
            }
        }
        return count;
    }

}
