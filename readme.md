# This is all the problems I had solved in LeetCode.
I will update this repo whenever I had solved a problem. All the solutions in this repo are written in Java. The solutions written in C# and other languages will be published in other repo.

You can follow my repo, read my code, and provide me better solution. Also, pointing out the mistakes in my solutions is welcomed.

You can find this repo at [GitHub|stormlin-LeetCode](https://github.com/K9A2/LeetCode).

# Usage
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

# Tutorial
If you had any question after reading both the question and solutions, you can turn to the tutorials in the dictionary "tutorials". The solution for each problem is written in Markdown file with corresponding name. For example, the   tutorial of *FizzBuzz* is written in *FizBuzz.md*.

# Problem List
Easy:
|No.|Name        |Date|Runtime
|-----|------------|-----------|-------|
|1  |412. Fizz Buzz|2016/11/28-09:46|3ms|
|2  |231. Power of Two|2016/11/28-12:01|2ms|
|3  |344. Reverse String|2016/11/28-19:17|6ms|
|4  |242. Valid Anagram|2016/11/29-00:12|5ms|
|5  |463. Island Perimeter|2016/12/01-15:27|154ms|
|6  |415. Add String|2016/12/5-00:10|30ms|
|7  |389. Find the Difference|2016/12/05-09:20|8ms|
|8  |371. Sum of Two Integers|2016/12/05-09:53|0ms|
|9  |258. Add Digits|2016/12/05-10:19|3ms|
|10 |169. Majority Element|2016/12/05-11:02|5ms|
|11 |292. Nim Game|2016/12/05-11:09|1ms|
|12 |383. Ransom Note|2016/12/05-15:26|27ms|
|13 |349. IntersectionOfTwoArrays|2016/12/05-16:06|10ms|
|14 |136. Single Number|2016/12/09-15:06|1ms|
|15 |455. Assign Cookies|2016/12/09-15:24|19ms|
|16 |283. Move Zeroes|2016/12/09-15:50|6ms|
|17 |217. Contains Duplicate|2016/12/09-16:10|10ms|
|18 |461. Hamming Distance|2017/1/16-17:55|12ms|
|19 |485. Max Consecutive Ones|2017/1/16-19:19|9ms|
|20 |448. Find All Numbers Disappeared in an Array|2017/1/16-20:24|23ms|
|21|476. Number Complement|2017/3/25|13ms|


# Copy Right
Copyright © 2015 - 2016 [stormlin](http://www.stormlin.com/). All Rights Reserved.
Go to my [CSDN blog](http://blog.csdn.net/atmiao) for more interesting things.
For more information, follow my Subscription Account: *Hello Programmer* by scanning the QR code below.

![QR Code](http://img.blog.csdn.net/20161209103948618?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYXRtaWFv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)