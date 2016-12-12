# Tutorial: 371. Sum of Two Integers

## 题目
给定两个int变量a、b，要求返回两者之和，但不准使用运算符+和-。

## 算法
这个题目不准使用运算符，那就只能通过位操作来模拟加减运算了。
1. a和b相与，能得出产生进位的地方carry
2. a和b相异或，能得到本次加法结果
3. b=carry<<1，作为下一个循环的加数

## 代码
```java
private int getSum(int a,int b){
    int carry=0;
    while (b!=0){
        carry=a&b;
        a=a^b;
        b=carry<<1;
    }
    return a;
}
```

## Copy Right
Copyright © 2015 - 2016 [stormlin](http://www.stormlin.com/). All Rights Reserved.
Go to my [CSDN blog](http://blog.csdn.net/atmiao) for more interesting things.
For more information, follow my Subscription Account: *Hello Programmer* by scanning the QR code below.

![QR Code](http://img.blog.csdn.net/20161209103948618?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYXRtaWFv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)