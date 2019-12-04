/*
内部类： 成员内部类（非静态内部类、静态内部类）、匿名内部类、局部内部类

非静态内部类（外部类里使用非静态内部类和平时使用其他类没有什么不同）
1.非静态内部类必须寄存在一个外部类对象里。因此，如果有一个非静态内部类对象那么一定存在对应的外部类对象
非静态内部类对象单独属于外部类的某个对象
2.非静态内部类可以直接访问外部类的成员，但是外部类不能直接访问非静态内部类成员
3.非静态内部类不能有静态方法、静态属性和静态初始化块
4.外部类的静态方法、静态代码块不能访问非静态内部类，包括不能使用非静态内部类定义变量、创建实例

*/
