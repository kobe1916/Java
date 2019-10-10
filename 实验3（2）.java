
public class Line {
    //对象的声明
    Point a = new Point(5.0,5.0);
    Point b = new Point(3.0,2.0);

    public Line() {
        this.a = a;this.b = b;
    }//重载方法

    public Double Distance(){
        return Math.sqrt(Math.pow((a.getX()-b.getX()),2)
                + Math.pow((a.getY()-b.getY()),2));
    }//计算长度

    public Boolean isHorizontal(){
        if(a.getY()==b.getY()){
            return true;
        }
        else{
            return false;
        }
    }//判断水平

    public Boolean isVertical(){
        if(a.getX()==b.getX()){
            return true;
        }else{
            return false;
        }
    }

    public Double getSlope(){
        return (b.getY()-a.getY())
                /(b.getX()-a.getX());
    }//计算斜率

    public Point getMed(){
        return new Point((a.getX()+b.getX())
                /2,(a.getY()+b.getY())/2);
    }//计算中点
}

/*
class Main {
    public static void main(String[] args) {
        Line line = new Line();

        System.out.println("该线段的长度：" + line.Distance());
        System.out.println("该线段是否水平：" + line.isHorizontal());
        System.out.println("该线段是否垂直：" + line.isVertical());
        System.out.println("该线段的斜率为：" + line.getSlope());
        System.out.println("该线段的中点为： X:" + line.getMed().getX()
                + "  Y:" + line.getMed().getY());
    }
}

 */

import java.math.*;
public class Point {

    Double x;   Double y;
    public Point(Double x, Double y) {
        this.x = x; this.y = y;
    }
    public void setX(Double x) { this.x = x; }

    public void setY(Double y) { this.y = y; }

    public Double getX() { return x; }

    public Double getY() { return y; }


    public Point(){ }//构造重载方法

    public  Double Distance() {
        return Math.sqrt(x*x+y*y);
    }//返回距离
}
/*
class Main{
    public static void main(String[] args){
        System.out.println("距离为："+Point.Distance());
    }
}

*/
