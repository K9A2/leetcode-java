# Tutorial: 344. Reverse String

## 题目
将输入的字符串反过来，再输出

## 算法
1. 新建一个StringBuilder
2. 把原来的字符串里面的字（char），倒着用charAt（）方法倒着读出来，添加到这个StringBuilder
3. 把这个StringBuilder用toString（）方法转成字符串

## 代码
```Java
private String reverseString(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
```

## Copy Right
Copyright © 2015 - 2016 [stormlin](http://www.stormlin.com/). All Rights Reserved.
Go to my [CSDN blog](http://blog.csdn.net/atmiao) for more interesting things.
For more information, follow my Subscription Account: *Hello Programmer* by scanning the QR code below.

![QR Code](http://img.blog.csdn.net/20161209103948618?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYXRtaWFv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)