package com.personal.object.demo05;

/**
 * @description:
 * 标准的类
 * 1.所有的成员变量都要使用private关键字修饰
 * 2.为每一个成员变量编写一对儿Getter/Setter方法
 * 3.编写一个无参数的构造方法
 * 4.编写一个全参数的构造方法
 * 一个标准类也叫做Javabean
 * @author:
 * @time: 2020/4/16 15:49
 */
public class Students {
    private String name;
    private int age;

    public Students() {//无参数构造方法：alt+insert，然后选择select none
    }

    public Students(String name, int age) {//全参数的构造方法
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
