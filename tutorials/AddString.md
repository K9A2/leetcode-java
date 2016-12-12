# Tutorial: 415. Add String

## 题目
给定两个数对应的字符串，要求返回两数之和所对应的字符串。这两个数最大长度<5100。

## 算法
由题目所得，由于数字的长度超过了double所能支持的最大长度，所以我们不能通过系统内置的数字类型来对这两个数求和。
我们所要做的就是像我们自己手工计算一样，把这两个数一位一位地做加法，处理好进位就行。就可以提出以下算法：
1. 判定这两个数哪一个比较长一点，给长一点的数在前面补零，是两个数长度对齐
2. 新建一个StringBuilder类型变量stringBuilder，和int类型的变量sum，carry
3. 令sum，carry为0
4. 从低位到高位，一位一位地计算两者之和。这里，可以把该位的字符-48来的到对应的数字，用于后续计算。如有进位，则置carry为0。把sum转成字符append到stringBuilder里面。
5. 重复操作直至两个数中的所有位均为计算
6. 判定carry是否为1，若true，则在stringBuilder中append一个1
7. 把这个StringBuilder反过来输出（stringBuilder.reverse().toString()）

## 代码
```java
//主算法
private String addStrings(String num1, String num2) {
    int carry=0;
    int sum=0;
    StringBuilder stringBuilder=new StringBuilder();
    if (num1.length()>num2.length()){
        num2=AddZero(num2,num1.length()-num2.length());
    }else {
        num1=AddZero(num1,num2.length()-num1.length());
    }
    for(int i=num1.length()-1;i>=0;i--){
        sum=(num1.charAt(i)-48)+(num2.charAt(i)-48)+carry;
        if (sum>9){
            stringBuilder.append(sum-10);
            carry=1;
        }else {
            stringBuilder.append(sum);
            carry=0;
        }
    }
    if (carry==1){
        stringBuilder.append(1);
    }
    return stringBuilder.reverse().toString();
}

//通过补0来对齐两个数
private String AddZero(String s,int count){
    StringBuilder stringBuilder=new StringBuilder();
    for(int i=0;i<count;i++){
        stringBuilder.append("0");
    }
    stringBuilder.append(s);
    return stringBuilder.toString();
}
```

## Copy Right
Copyright © 2015 - 2016 [stormlin](http://www.stormlin.com/). All Rights Reserved.
Go to my [CSDN blog](http://blog.csdn.net/atmiao) for more interesting things.
For more information, follow my Subscription Account: *Hello Programmer* by scanning the QR code below.

![QR Code](http://img.blog.csdn.net/20161209103948618?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYXRtaWFv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)