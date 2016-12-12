# Tutorial: 258. Add Digits

## 题目
给定一个数，把它的各位数字相加，直至只有一位数字。

## 算法
做出一个循环来求这个值是很容易的，但是这种算法的时间复杂度是很高的。

仔细观察输入的数字和结果之间，我们可以发现以下特点：
1. 结果肯定为0~9中的值
2. 除第一组外，每一组都是以九个数为一组（第一组有0~9共十个数）

给一个例子来说明一下：

input:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20

output： 0,1,2,3,4,5,6,7,8,9,1&nbsp; ,2&nbsp; ,3&nbsp; ,4&nbsp; ,5&nbsp; ,6&nbsp; ,7&nbsp; ,8&nbsp; ,9&nbsp;,0&nbsp; ,1

## 代码
```java
//重复累加，比较慢的方法，时间复杂度为O（n×n）
private int addDigits(int num){
    String s=String.valueOf(num);
    return (s.length()==1)?s.charAt(0)-48:getCalculate(s);
}

private int getCalculate(String s){
    int sum=0;
    while(s.length()!=1){
        sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-48;
        }
        s=String.valueOf(sum);
    }
    return s.charAt(0)-48;
}

//按照规律来做的方法，时间复杂度为O（1）
public int addDigits(int num) {
    return 1 + (num - 1) % 9;
}
//不过此算法仍有不足。取余的运算太慢，导致整个算法非常慢。
```

## Copy Right
Copyright © 2015 - 2016 [stormlin](http://www.stormlin.com/). All Rights Reserved.
Go to my [CSDN blog](http://blog.csdn.net/atmiao) for more interesting things.
For more information, follow my Subscription Account: *Hello Programmer* by scanning the QR code below.

![QR Code](http://img.blog.csdn.net/20161209103948618?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYXRtaWFv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)