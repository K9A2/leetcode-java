# Tutorial: 389. Find the Difference

## 题目
给定两个只含有小写字母的字符串s和t。t是打乱字符顺序之后的s，而且还在其中某个随机位置添加了一个字符c。请找出这个字符c。

## 算法
由于t只比s多了一个字符，我们可以认为s和t中的字母是“成对出现的”。如果我们把这些字母当做数字，那么就可以用异或操作来排除所有成对出现的字母，最后的结果就是那个多出来的字母。

例如，A⊕A=0，而A⊕A⊕B=B，我们就可以用异或来找出这个多出来的字母。

## 代码
```java
//由于这个算法里面有两个循环，这是一种比较慢的解决方案
private char findTheDifference(String s, String t) {
    char result=0;
    for(int i=0;i<s.length();i++){
        result^=s.charAt(i);
    }
    for(int j=0;j<t.length();j++){
        result^=t.charAt(j);
    }
    return result;
}

//使用一个循环的算法，速度有明显提升
private char findTheDifference(String s, String t) {
    char result=0;
    int length=(s.length()>=t.length())?t.length():s.length();

    for(int i=0;i<length;i++){
        result^=s.charAt(i);
        result^=t.charAt(i);
    }

    return (s.length()>=t.length())?(char)(result^s.charAt(s.length()-1)):(char)(result^t.charAt(t.length()-1));
}
```

## Copy Right
Copyright © 2015 - 2016 [stormlin](http://www.stormlin.com/). All Rights Reserved.
Go to my [CSDN blog](http://blog.csdn.net/atmiao) for more interesting things.
For more information, follow my Subscription Account: *Hello Programmer* by scanning the QR code below.

![QR Code](http://img.blog.csdn.net/20161209103948618?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYXRtaWFv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)