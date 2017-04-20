# This is all the problems I had solved in LeetCode.

I will update this repo whenever I had solved a problem. All the solutions in this repo are written in Java.

You can follow my repo, read my code, and provide me better solution. Also, pointing out the mistakes in my solutions is welcomed.

# Usage

This repo are edited under IntelliJ IDEA 2016.
All calsses are given the corresponding name in LeetCode. For example, problem *FizzBuzz* are solved in *FizzBuzz.java*. You can use this class by initialize and use it as below.

```java
//Below is a sample usage for problem: "492. Construct the Rectangle".

//ConstructTheRectangle.java
package easy;
public class ConstructTheRectangle {
    //The method has been made static, which is different from the original non-static method.
    public static int[] constructRectangle(int area) {
        int[] result = new int[2];
        int sqrt = (int) Math.sqrt(area);
        while (area % sqrt != 0) {
            sqrt--;
        }
        result[1] = sqrt;
        result[0] = area / sqrt;
        return result;
    }
}

//Main.java
import easy.ConstructTheRectangle;
public class Main {
    public static void main(String[] args) {
        //As it is a static method, we can use it directly.
        //For those non-static method, we should instantiate it before use.
        for (int edge : ConstructTheRectangle.constructRectangle(5)) {
            System.out.println(edge);
        }
    }
}

```

# Tutorial

If you had any question after reading both the question and solutions, you can turn to the tutorials in the dictionary "tutorials" or send me a e-mail at *lin-jinting@outlook.com*. The solution for each problem is written in Markdown file with corresponding name. For example, the   tutorial of *FizzBuzz* is written in *FizBuzz.md*.

# Problem List

Easy:

|No.|Name        |Date|
|-----|------------|-----------|
|1  |412. Fizz Buzz|Nov. 28, 2016|
|2  |231. Power of Two|Nov. 28, 2016|
|3  |344. Reverse String|Nov. 28, 2016|
|4  |242. Valid Anagram|Nov. 29, 2016|
|5  |463. Island Perimeter|Dec. 01, 2016|
|6  |415. Add String|Dec. 05, 2016|
|7  |389. Find the Difference|Dec. 05, 2016|
|8  |371. Sum of Two Integers|Dec. 05, 2016|
|9  |258. Add Digits|Dec. 05, 2016|
|10 |169. Majority Element|Dec. 05, 2016|
|11 |292. Nim Game|Dec. 05, 2016|
|12 |383. Ransom Note|Dec. 05, 2016|
|13 |349. IntersectionOfTwoArrays|Dec. 05, 2016|
|14 |136. Single Number|Dec. 09, 2016|
|15 |455. Assign Cookies|Dec. 09, 2016|
|16 |283. Move Zeroes|Dec. 09, 2016|
|17 |217. Contains Duplicate|Dec. 09, 2016|
|18 |461. Hamming Distance|Jan. 16, 2017|
|19 |485. Max Consecutive Ones|Jan. 16, 2017|
|20 |448. Find All Numbers Disappeared in an Array|Jan. 16, 2017|
|21|476. Number Complement|Mar. 3, 2017|
|22|168. Excel Sheet Column Title|Apr. 18, 2017|
|23|171. Excel Sheet Column Number|Apr. 18, 2017|
|24|520. Detect Capital|Apr. 18, 2017|
|25|492. Construct the Rectangle|Apr. 20, 2017|
|26|167. Two Sum II - Input array is sorted|Apr. 20, 2017|
