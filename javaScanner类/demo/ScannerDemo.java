/*
 * @Author: maoguijun
 * @Date: 2021-08-19 22:49:56
 * @LastEditors: maoguijun
 * @LastEditTime: 2021-08-19 22:55:33
 * @FilePath: \javaNote\javaScanner类\demo\ScannerDemo.java
 */
import java.util.Scanner;

class ScannerDemo {

  public static void main(String[] args) {
    System.out.println("请输入数字：");
    Scanner scan = new Scanner(System.in);

    double sum = 0;
    int m = 0;

    while (scan.hasNextDouble()) {
      double x = scan.nextDouble();
      m = m + 1;
      sum = sum + x;
    }

    System.out.println(m + "个数的和为" + sum);
    System.out.println(m + "个数的平均值是" + (sum / m));
    scan.close();
  }
}
