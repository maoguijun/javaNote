/*
 * @Author: maoguijun
 * @Date: 2021-08-20 18:50:31
 * @LastEditors: maoguijun
 * @LastEditTime: 2021-08-20 18:56:34
 * @FilePath: \javaNote\javaOverride_Overload\demo\demo.js
 */

// 测试一下js 的重写

// 可以看到js 的重写没有参数和返回值的限制

class Animal {
  move(s) {
    console.log(s);
  }
}

class Dog extends Animal {
  move(t, b, a) {
    console.log(t, b, a);
    return a;
  }
}

const dog = new Dog();

dog.move(1, 2, 3);
