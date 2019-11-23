/*
包机制是Java中管理类的重要方法。
开发中，我们会遇到大量同名的类，通过包我们很容易对解决类重名的问题，
也可以实现对类的有效管理。
包对于类，相当于文件夹对于文件的作用

package使用的两个要点：
1.通常是类的第一句非注释性语句
2.包名：域名倒着写即可，再加上模块名，便于内部管理类
eg.   com.sun.test;

*通配符  降低编译速度  而不是运行速度

如果我们要使用其他包的类，需要用import导入，从而可以在奔雷中直接通过类名来调用，
否则就需要书写类的完整包名和类名。
import后，便于编写代码，提高可维护性。

Java会默认导入java.lang包下所有的类，因此这些类我们可以直接使用。
如果要导入两个同名的类，只能用包名+类名来显示调用相关类
 java.util.Date date = new java.util.Date();
*/
package 面向对象.cn.user1;

import 面向对象.cn.user.User;
public class user {
    public static void main(String[] args){
        User user = new User();
        //System.out.println("456");
    }
}


/*
package 面向对象.cn.user;

public class User {
    public static void main(String[] args){
        System.out.println("123");
    }

}

*/
