package EDU;

class MyPoint{
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1,int y1){
        //루트 (x^2+y2)
        int x3,y3;
        x3 = (x1-x)*(x1-x);
        y3 = (y1-y)*(y1-y);
        double d = x3+y3;
        d = Math.sqrt(d);
        return d;
    }
}

class E6_7{
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        //p(1,1)과 (2,2)의 거리를 구한다.
        System.out.println(p.getDistance(2,2));
    }
}