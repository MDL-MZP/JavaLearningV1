package com.personal.API.Demo1;

import java.util.ArrayList;

/**
 * @description:
 * 数组的长度是不可以发生改变的在定义之后
 * 但是ArrayList集合的长度是可以随意变化的。
 * 对于ArrayList来说，有一个尖括号<E>代表泛型。
 * 泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
 * 注意：泛型之孽那个是引用类型，不能是基本类型
 *       对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
 *       如果内容是空，得到的是空的中括号：[]
 * @author:
 * @time: 2020/4/16 21:44
 */
public class Demo1ArrayList {
    public static void main(String[] args) {
        //右侧尖括号内部可不写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合添加一些数据，需要用到add方法
        list.add("MDL");
        list.add("MMM");
        System.out.println(list);

    }
}
