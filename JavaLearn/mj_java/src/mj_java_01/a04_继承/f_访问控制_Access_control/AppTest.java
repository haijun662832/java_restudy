package mj_java_01.a04_继承.f_访问控制_Access_control;

import mj_java_01.a04_继承.f_访问控制_Access_control.models.Person;

/**
 * java包的权限:
 * 1. public 所有地方可以访问.
 * 2. protected 本包 和 子类中可以访问 使用
 * 3. 无修饰符 什么都不写是 一种特殊的访问权限: (package-private) : 仅在自己包中可见.
 * 4. private 本类作用域中都可以访问
 *
 * 不可以修饰 局部类 和 局部变量.
 *
 * 什么叫顶级类和嵌套类:
 * 一个文件中的类 最外层的类叫顶级类.定义出来就是希望让别人用的.
 * 嵌套类:在类的内部定义的类.
 *
 * 顶级类的修饰符只能是: public  和 不写(package-private).
 *  顶级类如果用了 public 修饰那么 该源文件 必须用这个 public 修饰的顶级类 的类名一致.
 */

/**
 * 一个Java 源文件 可以定义多个顶级类. public 顶级类的名字必须和文件名一致.
 * 下面的👇🏻的 Student Teacher 也是顶级类. 不写修饰符:package-private
 *  一个java的源文件,只能有一个 和 文件名一致 的 public 修饰的 顶级类.
 *  如下的 public class AppTest 顶级类, 源文件名:AppTest.java  的   AppTest 要一致.
 */
class Animal {
    void showInfo() {
    }

    public void speak() {
    }
}

/**
 * 子类override 的方法的权限 必须 >= 父类的方法 的权限.
 * 子类重写的方法的访问权限 要 >= 父类的. 但是不能比父类的小.
 * 如下的: showInfo() 和 speak() 方法.
 */
class Student extends Animal { //顶级类

    @Override
    public void showInfo() {
        super.showInfo();
    }

    @Override
   // void speak() { //访问权限不能比父类的小 不写是 包权限.
    public void speak() {
        super.speak();
    }
}
class Teacher { //顶级类

}

public class AppTest { //顶级类 public 修饰的要和 源文件一致.

    public static void main(String[] args) {
        //访问不在同一个包下的类:models包中的Person
        Person person = new Person();
        // person.age = 20;       // protected 不是自己包就不能访问
        // person.name = "原始人"; // 默认仅在自己包中可以访问,所以这里访问不了
    }
}

/**
 * 还有一个注意点:
 * 包的作用
 * 1.组织结构管理:
 * 2. 还有一个就是 访问权限的控制 比如 什么不写就是包权限
 */
