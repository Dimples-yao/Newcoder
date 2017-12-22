package com.lisy;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by NEUNB_Lisy on 2017/12/21.
 */
public class Iqiyi {

    /**
     * 时间限制：1秒 空间限制：65536K
     * 一个完整的括号字符串定义规则如下:
     * 1、空字符串是完整的。
     * 2、如果s是完整的字符串，那么(s)也是完整的。
     * 3、如果s和t是完整的字符串，将它们连接起来形成的st也是完整的。
     * 例如，"(()())", ""和"(())()"是完整的括号字符串，"())(", "()(" 和 ")"是不完整的括号字符串。
     * 牛牛有一个括号字符串s,现在需要在其中任意位置尽量少地添加括号,将其转化为一个完整的括号字符串。请问牛牛至少需要添加多少个括号。
     * 输入描述:
     * 输入包括一行,一个括号序列s,序列长度length(1 ≤ length ≤ 50).
     * s中每个字符都是左括号或者右括号,即'('或者')'.
     * 输出描述:
     * 输出一个整数,表示最少需要添加的括号数
     * 输入例子1:
     * (()(()
     * 输出例子1:
     * 2
     */
    public int bracketNum(String s){
        Stack stack = new Stack();
        for (int i=0;i<s.length();i++){
            if (stack.empty()){
                stack.push(s.charAt(i));
            }else {
                if (stack.peek().toString().equals("(")){
                    if (s.charAt(i)==')')
                        stack.pop();
                    else
                        stack.push(s.charAt(i));
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        int total = 0;
        while (!stack.empty()){
            total++;
            stack.pop();
        }
        return total;
    }

    /*
    * 时间限制：1秒 空间限制：65536K
    * 牛牛选择了一个正整数X,然后把它写在黑板上。然后每一天他会擦掉当前数字的最后一位,直到他擦掉所有数位。 在整个过程中,牛牛会把所有在黑板上出现过的数字记录下来,然后求出他们的总和sum.
    * 例如X = 509, 在黑板上出现过的数字依次是509, 50, 5, 他们的和就是564.
    * 牛牛现在给出一个sum,牛牛想让你求出一个正整数X经过上述过程的结果是sum.
    * 输入描述:
    * 输入包括正整数sum(1 ≤ sum ≤ 10^18)
    * 输出描述:
    * 输出一个正整数,即满足条件的X,如果没有这样的X,输出-1。
    * 输入例子1:
    * 564
    * 输出例子1:
    * 509
    */
    public long getNum(long sum){
        long result = 0,l = 0,r = sum;
        if (sum==0){
            return result;
        }else {
            while (l<r){
                long mid = (l+r)/2;
                if (sum == getResult(mid)){
                    result = mid;
                    return result;
                }else if (sum > getResult(mid)){
                    l = mid;
                }else {
                    r = mid;
                }
            }
        }
        return -1;
    }
    public static long getResult(long x){
        long result=0;
        while (x!=0){
            result+=x;
            x = x/10;
        }
        return result;
    }

    /*
    * 时间限制：1秒 空间限制：65536K
    * 牛牛学习了冒泡排序,并写下以下冒泡排序的伪代码,注意牛牛排序的数组a是从下标0开始的。
    * BubbleSort(a):
        Repeat length(a)-1 times:
            For every i from 0 to length(a) - 2:
                If a[i] > a[i+1] then:
                    Swap a[i] and a[i+1]
    * 牛牛现在要使用上述算法对一个数组A排序。
    * 在排序前牛牛允许执行最多k次特定操作(可以不使用完),每次特定操作选择一个连续子数组,然后对其进行翻转,并且k次特定操作选择的子数组不相交。
    * 例如A = {1, 2, 3, 4, 5, 6, 7}, k = 1,如果牛牛选择的子数组是[2,4](注意下标从0开始),那么翻转之后的数组变为A = {1, 2, 5, 4, 3, 6, 7}。
    * 牛牛知道冒泡排序的效率一定程度上取决于Swap操作次数,牛牛想知道对于一个数组A在进行k次特定操作之后,再进行上述冒泡排序最少的Swap操作次数是多少?
    * 输入描述:
    * 输入包括两行,第一行包括两个正整数n和k(2 ≤ n ≤ 50, 1 ≤ k ≤ 50),表示数组的长度和允许最多的特定操作次数。
    * 第二行n个正整数A[i](1 ≤ A[i] ≤ 1000),表示数组内的元素,以空格分割。
    * 输出描述:
    * 输出一个整数,表示在执行最多k次特定操作之后,对数组进行上述冒泡排序需要的Swap操作次数。
    * 输入例子1:
    * 3 2
    * 2 3 1
    * 输出例子1:
    * 1
    */

}
