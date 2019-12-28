package oo;
public class Shiyan7 {
public static void main(String[] args) {
System.out.println("用户名："+ System.getProperty("user.name"));
System.out.println("目录："+ System.getProperty("user.dir"));
System.out.println("操作系统："+ System.getProperty("os.name"));
System.out.println("架构："+ System.getProperty("os.arch"));
System.out.println("版本："+ System.getProperty("os.version"));
System.out.println("分隔符："+ System.getProperty("file.separator"));
System.out.println("路径分隔符："+ System.getProperty("path.separator"));
}
}
//使用System类中的方法，编程实现获得并输出自己微机上的系统属性，包括用户名
//、用户目录、操作系统名、操作系统架构、操作系统版本、文件分隔符、路径分隔符等。
