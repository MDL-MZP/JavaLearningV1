package com.personal.String;

/**
 * @description:
 * 字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中。
 *
 * 对于基本类型来说，==是进行数值的比较
 * 对于引用类型来说，==是进行地址值的比较
 * 具体关系详见资料的图解！！很明了
 * @author:
 * @time: 2020/4/16 22:24
 */
public class Demo1String {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        char[] charArray = {'a','b','c'};
        String s3 = new String(charArray);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}
