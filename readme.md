# This is all the problems I had solved in LeetCode.
I will update this repo whenever I had solved a problem. All the solutions in this repo are written in Java. The solutions written in C# and other languages will be published in other repo.

You can follow my repo, read my code, and provide me better solution. Also, pointing out the mistakes in my solutions is welcomed.

You can find this repo at [GitHub|stormlin-LeetCode](https://github.com/K9A2/LeetCode).

# Instruction Manual
This repo are edited under IntelliJ IDEA 2016.
All calsses are given the corresponding name in LeetCode. For example, problem *FizzBuzz* are solved in *FizzBuzz.java*. You can use this class by initialize and use it as below.

```java
//Sample
FizzBuzz fizzbuzz=new FizzBuzz();
fizzbuzz.Show(15);    //15 is represents input argument n

//I just implemented requirements in code below.
//FizzBuzz.java contains the implementation and its demonstration menthod Show()

//Implementation
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
//Demonstrative method Show(int n)
public void Show(int n){
    List<String> list=new ArrayList<>();
    list=fizzBuzz(n);
    for (int i=0;i<n;i++){
        System.out.println(list.get(i));
    }
}
```

# Problem List

|No.|Name        |Update Date|Runtime|
|-----|------------|-----------|-------|
|1|FizzBuzz|2016\11\28-09:46|3ms|
|2|Power of Two|2016\11\28-12:01|2ms|
|3|Reverse String|2016\11\28-19:17|6ms|
|4|ValidAnagram|2016\11\29-00:12|5ms|
|5|IslandPerimeter|2016\12\1-15:27|154ms|
|6|AddString|2016\12\5-00:10|30ms|