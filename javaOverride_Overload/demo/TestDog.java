/*
 * @Author: maoguijun
 * @Date: 2021-08-20 18:22:58
 * @LastEditors: maoguijun
 * @LastEditTime: 2021-08-20 18:45:32
 * @FilePath: \javaNote\javaOverride_Overload\demo\TestDog.java
 */
class Animal {

  public void move(String s) {
    System.out.println("动物可以移动" + s);
  }
}

class Dog extends Animal {

  public void move(int n) {
    System.out.println("狗可以跑和走" + n + "步");
  }
}

public class TestDog {

  public static void main(String args[]) {
    Animal a = new Animal(); // Animal 对象
    Animal b = new Dog(); // Dog 对象

    a.move("2步"); // 执行 Animal 类的方法

    b.move(1); //执行 Dog 类的方法
    // b.bark(); // 类型为Animal的变量 b 错误: 找不到符号
  }
}
