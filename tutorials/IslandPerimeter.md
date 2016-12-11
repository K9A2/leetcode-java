# Tutorial： 463.Island Perimeter

## 题目
给定一个2×2矩阵，整个矩阵认为是地球。其中的1代表这一块是陆地，0代表这一块是海洋。陆地中不会有“湖”，即一群1所围成的图形中不会有0。所有的陆地都是连接在一起的。每一个格子的边长认为是1。求这块陆地的周长。下面是样例输入：

[[0,1,0,0],

[1,1,1,0],

[0,1,0,0],

[1,1,0,0]]

周长为: 16

解释：图中的黄色边界就是我们所要求的陆地的周长，一共十六个单位长度。

![题图](https://leetcode.com/static/images/problemset/island.png)

## 算法
本题的核心算法就是找出当前格子“与大海相邻”的边长。通过仔细观察题图，我们可以发现，每一个格子的边长最大为4（假定只有它一个）。而每多一个相邻的格子，其“与大海相邻”的边长就会减少一个单位。例如图中位置（1,1）的格子，其四面都是其他格子，故其周长为0。

本题涉及到了对矩阵的处理，就不可避免地要处理与矩阵边界相关的问题，例如边界溢出。我们在判断某一个格子的周长时就要考虑到这个问题。例如位置（0,0）的格子的值为1（即此处是陆地），那么我们就应该判断这个格子周边的格子数目，然后用4减去这个数，就可以得到这个格子贡献的边长值。但是由于这个格子是位于矩阵的左上角，我们如果检查其左、上两个方向的格子的值，就会导致边界溢出问题。故在检测格子的时候，要按下面的算法逐个比较：
1. 不是第一行：如果下面还有格子，才比较
2. 不是最后一行：如果上面还有格子，才比较
3. 不是第一列：右边还有格子，才比较
4. 不是最后一列：左边还有格子，才比较

用文字写的算法始终不能说的很详细，大家还是直接看算法吧。

## 代码
```Java
private int islandPerimeter(int [][] grid) {
    int rows=grid.length;                
    int cols=grid[0].length;          
    int result=0;
    for(int i=0;i<rows;i++){
        for (int j=0;j<cols;j++){
            int count=0;
            if (grid[i][j]==1){
                if(i!=0&&grid[i-1][j]==1){
                    count++;
                }
                if (i!=rows-1&&grid[i+1][j]==1){
                    count++;
                }
                if (j!=0&&grid[i][j-1]==1){
                    count++;
                }
                if (j!=cols-1&&grid[i][j+1]==1){
                    count++;
                }
                result+=4-count;
            }
        }
    }
    return result;
}
```

## Copy Right
Copyright © 2015 - 2016 [stormlin](http://www.stormlin.com/). All Rights Reserved.
Go to my [CSDN blog](http://blog.csdn.net/atmiao) for more interesting things.
For more information, follow my Subscription Account: *Hello Programmer* by scanning the QR code below.

![QR Code](http://img.blog.csdn.net/20161209103948618?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYXRtaWFv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)