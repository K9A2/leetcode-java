# Tutorial: 231. Power of Two

## 题目
给定一个数，确认其是否为2的幂。返回true表明其为2的幂，否则返回false。

## 算法
首先分析一下是2的幂的数在二进制上面有什么特点。以四位表示，例如2是0010,4是0100。而0101等有两位以上1是1的数肯定不是2的幂。所以，假定这里的int类型是32位的，那我们先把它跟1与，的到的结果如果是1，证明这一位为1。然后再右移一位。重复32次就能得到32位整数中1的个数。若1的个数大于1，则此数字不是2的幂，返回false。否则返回true。

## 代码
```Java
private boolean isPowerOfTwo(int n) {
    int count=0;
    if(n==0){
        return false;
    }
    if(n<0){
        return false;
    }
    for (int i=0;i<32;i++){
        if ((n&1)==1){
            count++;
        }
        n=n>>1;
        if (count>1){
            return false;
        }
    }
    return true;
}
```

# Copy Right
Copyright © 2015 - 2016 [stormlin](http://www.stormlin.com/). All Rights Reserved.
Go to my [CSDN blog](http://blog.csdn.net/atmiao) for more interesting things.
For more detail, follow my WeChat Subscription by scanning the QR code below.

![QR Code](http://img.blog.csdn.net/20161209103948618?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYXRtaWFv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)