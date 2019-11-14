package 面向对象;

class Point{
    double x,y;

    //构造器的方法名必须和类名一致
    public Point(double _x,double _y){
        x = _x;
        y = _y;
    }
    public double getDistance(Point p/*和下面p不是一个这个是getDistance方法的下边是main方法的*/){
        return Math.sqrt((x-p.x)*(x-p.x)+(y - p.y)*(y - p.y));
    }
}

public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0, 4.0);
        Point origin = new Point(0.0, 0.0);
        System.out.println(p.getDistance(origin));
    }
}
