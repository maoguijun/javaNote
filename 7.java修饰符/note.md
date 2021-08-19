<!--
 * @Author: maoguijun
 * @Date: 2021-08-19 20:02:47
 * @LastEditors: maoguijun
 * @LastEditTime: 2021-08-19 20:14:19
 * @FilePath: \javaNote\7.java修饰符\note.md
-->

# Java 修饰符

Java 语言提供了很多修饰符，主要分为以下两类：

- 访问修饰符
- 非访问修饰符

## 访问修饰符

```java
  public class ClassName {
    // ...
  }
  private boolean myFlag;
  static final double weeks = 9.5;
  protected static final int BOXWIDTH = 42;
  public static void main(String[] arguments) {
    // 方法体
  }
```

Java 中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限,按严格来排序。

- public : 对所有类可见。使用对象：类、接口、变量、方法

- default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。

- protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。

- private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）

<mark>使用默认访问修饰符声明的变量和方法，对同一个包内的类是可见的。接口里的变量都隐式声明为 public static final,而接口里的方法默认情况下访问权限为 public。</mark>

## 非访问修饰符

- static 修饰符，用来修饰类方法和类变量。

- final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。

- abstract 修饰符，用来创建抽象类和抽象方法。

- synchronized 和 volatile 修饰符，主要用于线程的编程。
