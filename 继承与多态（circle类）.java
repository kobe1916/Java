import java.text.DecimalFormat;

class circle{
    int r;
    public circle(int r){
        this.r =  r;
    }
    public double getArea(){
        return Math.PI*r*r;
    }
    public double getPerimeter(){
        return Math.PI*r*2;
    }
}
class Sphere extends circle{
    public Sphere(int r){
        super(r);
    }
    public double getSArea(){
        return Math.PI*4*r*r;
    }
    public double getVolume(){
        return (Math.PI*4*r*r*r)/3;
    }
}

public class Circle1 {
    public static void main(String[] args){
        DecimalFormat d = new DecimalFormat("#.####");
        Sphere a = new Sphere(5);
        System.out.println("球的半径为："+a.r);
        System.out.println("球的截面圆元面积为："+d.format(a.getArea()));
        System.out.println("球的截面圆的周长为："+d.format(a.getPerimeter()));
        System.out.println("球的表面积为："+d.format(a.getSArea()));
        System.out.println("球的体积为："+d.format(a.getVolume()));

    }
}
 
