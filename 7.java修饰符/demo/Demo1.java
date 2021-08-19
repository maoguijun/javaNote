/*
 * @Author: maoguijun
 * @Date: 2021-08-19 20:17:19
 * @LastEditors: maoguijun
 * @LastEditTime: 2021-08-19 20:40:20
 * @FilePath: \javaNote\7.java修饰符\demo\Demo1.java
 */
import java.io.*;

public class Demo1 {

  private boolean myFlag;
  static final double weeks = 9.5;
  protected static final int BOXWIDTH = 42;

  public static void main(String[] arguments) {

    // 直接访问Demo1 类变量
    // System.out.println("Demo1 myFlag: " + myFlag); //无法从静态上下文中引用非静态 变量 myFlag
    System.out.println("Demo1 weeks: " + weeks);
    System.out.println("Demo1 BOXWIDTH: " + BOXWIDTH);

    // 直接访问Demo2 类变量
    // System.out.println("Demo2 myFlag: " + Demo2.myFlag); // myFlag 在 Demo2 中是 private 访问控制
    System.out.println("Demo2 weeks: " + Demo2.weeks);
    System.out.println("Demo2 BOXWIDTH: " + Demo2.BOXWIDTH);
    System.out.println("Demo2 name: " + Demo2.name);

    // 访问实例demo2 变量
    Demo2 demo2 = new Demo2();

    // System.out.println("demo2 myFlag: " + demo2.myFlag); // myFlag 在 Demo2 中是 private 访问控制
    // demo2.setWeeks(23.5); // 无法为最终变量weeks分配值
    System.out.println("demo2 weeks: " + demo2.weeks);
    System.out.println("demo2 BOXWIDTH: " + demo2.BOXWIDTH);
    demo2.setName("dog");
    System.out.println("demo2 name: " + demo2.name);
  }
}
