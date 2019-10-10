class Fenshu {
    int x;
    int y;
    public Fenshu(int x, int y) {
        this.x = x;this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(Integer x) { this.x = x; }

    public int getY() { return y; }

    public void setY(int y) { this.y = y; }

    public void getIt(){
        System.out.println("该分数为：" + this.x + "/" + this.y);
    }
}

class Main {
    public static void main(String[] args) {
        Fenshu a = new Fenshu(5,8);
        Fenshu b = new Fenshu(3,7);
        a.getIt();
        b.getIt();
        System.out.println("俩数相乘结果为："
                + (a.getX()*b.getX())+"/"+(a.getY()*b.getY()));
    }
}

