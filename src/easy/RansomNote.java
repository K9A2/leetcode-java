package easy; /**
 * Created by K9A2S on 2016/12/5.
 */

import java.util.Arrays;

/**
 * Create by Stormlin. All rights reserved.
 **/

public class RansomNote {

    public void Show(String ramsomNote,String magazine){
        System.out.println(canConstruct(ramsomNote,magazine));
    }

    private boolean canConstruct(String ransomNote, String magazine) {

        char[] a= ransomNote.toCharArray();
        char[] b=magazine.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int location=0;

        int i=0;

        int j=0;

        for(i=0;i<a.length;i++){
            for(j=location;j<b.length;j++){
                if (a[i]==b[j]){
                    location=j+1;
                    break;
                }
            }
            if (j==b.length){
                return false;
            }
        }

        return true;
    }

}
