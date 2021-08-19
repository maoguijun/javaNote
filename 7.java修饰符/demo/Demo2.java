/*
 * @Author: maoguijun
 * @Date: 2021-08-19 20:19:51
 * @LastEditors: maoguijun
 * @LastEditTime: 2021-08-19 20:39:42
 * @FilePath: \javaNote\7.java修饰符\demo\Demo2.java
 */

import java.io.*;

public class Demo2 {

  private boolean myFlag;
  static final double weeks = 11.5;
  protected static final int BOXWIDTH = 42;
  public static String name = "aaa";

  public void setWeeks(double w) {
    // weeks = w;  // 无法为最终变量weeks分配值
  }

  public void setName(String n) {
    // weeks = w;  // 无法为最终变量weeks分配值
    name = n;
  }
}
