# 题目
给定两个字符串s和t，判断s是否为t的变位词（即s是否由t中的字母通过变换位置得到），以返回值true代表s是t的变位词，false代表不是。

# 算法
首先，这个题目有这种特殊情况，就是s跟t的长度都为0，此时返回true。

接着，如果不是这种特殊情况，则若两个字符串是变位词，那么组成这两个字符串的字母是同样的。如果我们对它们进行排序，则得到的结果应该是一样的。我们就可以设计出如下算法进行判断：
1. 新建两个char数组，用来放这两个字符串
2. 用Arrays.sort()方法对两个数组进行排序
3. 用String.valueOf(sa).equals(String.valueOf(st))就可以判断两者是否相等

下面代码段里面有一段被注释掉的代码，运行速度非常慢，然而却是一种思路上最简单的办法。即把两个字符串放到StringBuilder里面，然后逐个排除相同的字符串。想想就知道，这种办法的时间复杂度是O（n*n），因为里面有两个循环，组建StringBuilder的时间可以忽略不计。

# 代码
```Java
private boolean isAnagram(String s, String t){
    //Here is a optimized example, costs 5ms
    if (s.length()==0&&t.length()==0){
        return true;
    }
    char[] sa=s.toCharArray();
    char[] st=t.toCharArray();
    Arrays.sort(sa);
    Arrays.sort(st);
    return String.valueOf(sa).equals(String.valueOf(st));

    //Below is a example without optimization, costs 800+ms
    /**
    if (s.length()!=t.length()){
        return false;
    }else if (s.length()==0&&t.length()==0){
        return true;
    }else{
        StringBuilder sb=new StringBuilder();
        StringBuilder tb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=t.charAt(i)){
                sb.append(s.charAt(i));
                tb.append(t.charAt(i));
            }
        }
        int sl=sb.length();
        int tl=tb.length();
        for(int i=0;i<sl;i++){
            for (int j=0;j<tl;j++){
                if (sb.charAt(i)==tb.charAt(j)){
                    sb.deleteCharAt(i);
                    tb.deleteCharAt(j);
                    sl--;
                    tl--;
                    i=0;
                    j=-1;
                }
            }
        }
        if(sb.length()!=0||tb.length()!=0){
            return false;
        }
    }
    return true;
    **/
}
```

# Copyright
Copyright © 2015 - 2016 [stormlin](http://www.stormlin.com/). All Rights Reserved.
Go to my [CSDN blog](http://blog.csdn.net/atmiao) for more interesting things.
For more information, follow my Subscription Account: *Hello Programmer* by scanning the QR code below.

![QR Code](http://img.blog.csdn.net/20161209103948618?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYXRtaWFv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)