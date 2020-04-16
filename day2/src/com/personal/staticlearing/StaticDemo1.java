package com.personal.staticlearing;

/**
 * @description:
 * 静态代码块格式是：
 * public class类名称{
 *     static{
 *         //静态代码块
 *     }
 * }
 * 特点：当第一次使用到本类的时候，静态代码块执行唯一的一次。
 * 静态代码块总是优先于非静态，所以静态代码块比构造方法先执行
 * 静态代码块的典型用途：
 * 用来一次性地对静态成员变量进行赋值！
 * @author:
 * @time: 2020/4/17 1:37
 */
public class StaticDemo1 {
    static {
        System.out.println("静态代码块执行！");
    }

    public StaticDemo1(){
        System.out.println("构造方法执行！");
    }
}
