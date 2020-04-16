package com.personal.Arrays;

import java.util.Arrays;

/**
 * @description:
 * java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组的常见操作,会改变操作的参数的
 * public static String toString(数组):将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3...]）
 * @author:
 * @time: 2020/4/17 1:46
 */
public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,78,3,34,23,123123,432,443246,5653,325};

        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println(intArray[i]);
        }
        String string = Arrays.toString(intArray);
        System.out.println(string);

    }
}
