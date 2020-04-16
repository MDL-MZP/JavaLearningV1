package com.personal.API.Demo2;

import java.util.ArrayList;

/**
 * @description:
 * ArrayList当中常用的方法
 * public boolen add(E e);添加
 * public E get(int index);读取
 * public E remove(int index);删除
 * public int size();获取集合长度
 * 如果希望向集合ArrayList当中存储基本数据类型，必须使用基本类型对应的包装类
 * 基本类型->包装类（引用类型，包装类都位于java.lang包下）
 * byte      Byte
 * short     Short
 * int       Integer【特殊】
 * long      Long
 * float     Float
 * double    Double
 * char      Character【特殊】
 * boolean    Boolean
 * @author:
 * @time: 2020/4/16 21:57
 */
public class Demo1ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(200);
        Integer integer = integers.get(1);
        System.out.println(integer);
    }
}
