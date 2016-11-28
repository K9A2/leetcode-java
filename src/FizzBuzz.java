import java.util.ArrayList;
import java.util.List;

/**
 * Create by Stormlin. All rights reserved.
 **/
public class FizzBuzz {

    public void Show(int n){
        List<String> list=new ArrayList<>();

        list=fizzBuzz(n);

        for (int i=0;i<n;i++){
            System.out.println(list.get(i));
        }
    }

    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();


        for(int i=1;i<=n;i++){
            if (i%3==0&&i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0) {
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }

        return list;
    }

}
