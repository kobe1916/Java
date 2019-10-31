/*
定义Rectangle类，使其具有以下成员方法：
class  Rectangle{
    public Rectangle();               //将矩形的宽和高都设为1
public Rectangle(int w, int h);
public Rectangle(Rectangle r);
public double getArea();          //计算矩形面积
public double getPerimeter();     //计算矩形周长
public int getWidth();            //返回矩形的宽
public int getHeight();           //返回矩形的长
public String toString(); //以格式“矩形（w，h）”返回当前矩形的字符串表示
    public boolean equals(Rectangle  r);//测试矩形是否相等
}
定义测试类测试该类。

*/


import java.util.*;

class Rectangle{
    int w,h;
    public Rectangle(int w,int h){
        this.w = w;
        this.h = h;
    }
    public Rectangle(){
        this(1,1);
    }
    public int getWidth(){
        return w;
    }
    public int getHeigth(){
        return h;
    }
    public void setH(int H){
        this.h = h;
    }
    public void setW(int w){
        this.w = w;
    }
    public double getArea(){
        return w*h;
    }
    public double getPerimeter(){
        return 2*(w+h);

    }
    public String toString(){
        return "矩形("+w+","+h+")";
    }
    public boolean equals(Rectangle r){
        if(r.getWidth() == this.w && r.getHeigth() == this.h)
            return true;
        return false;
    }

}

public class Rectangle1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int w,h;
        Rectangle o1,o2;
        w = scanner.nextInt();
        h = scanner.nextInt();
        o1 = new Rectangle(w,h);
        o2 = new Rectangle();
        System.out.println("矩形面积为：>"+o1.getArea());
        System.out.println("矩形周长为：>"+o1.getPerimeter());
        System.out.println("矩形长为：>"+o1.getHeigth());
        System.out.println("矩形宽为：>"+o1.getWidth());
        System.out.println(o1.toString());
        System.out.println("判断是否相等:");
        System.out.println(o1.equals(o2));


    }
}
