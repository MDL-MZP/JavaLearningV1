package com.personal.staticlearing;

/**
 * @description:
 * @author:
 * @time: 2020/4/17 1:40
 */
public class Static {
    public static void main(String[] args) {
        StaticDemo1 staticDemo1 = new StaticDemo1();
        StaticDemo1 staticDemo11 = new StaticDemo1();//第二次不会执行静态代码块
    }
}
