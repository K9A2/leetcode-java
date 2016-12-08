# Tutorial: Fizz Buzz
## 简介
*FizzBuzz*是LeetCode上的一道入门题目，难度相当低。
## 题目
原题链接[FizzBuzz](https://leetcode.com/problems/fizz-buzz/)，大家点进去就能看到LeetCode上的原题，注册个账号就能做题了。下面给出题目的大概翻译：
>给定一个正整数N，要求返回一个有N个元素的List<String>，对应从1到N的N个数。当对应的数为15的倍数时，在list中的对应位置添加FizzBuzz；当对应的数为5的倍数时，添加Buzz；当对应的数为3的倍数时，添加Fizz。
举例如下：<br>
n = 15,<br>
Return:<br>
[<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"1",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"2",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"Fizz",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"4",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"Buzz",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"Fizz",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"7",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"8",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"Fizz",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"Buzz",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"11",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"Fizz",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"13",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"14",<br>
    &nbsp;&nbsp;&nbsp;&nbsp;"FizzBuzz"<br>
]
## 算法
解这道题不需要链表之类的高级数据结构，用内置的List类型来解决就可以了。算法在题目中已经讲解的非常明白，这里就不在赘述了。
## 代码
```Java
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
```
## Copy Right
This is article first published in my blog [stormlin.com](www.stormlin.com). All rights reserved.