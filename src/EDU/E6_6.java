package EDU;

public class E6_6{
    //두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
    static double getDistance(int x,int y,int x1,int y1){
        //루트 (x^2+y2)
        int x3,y3;
        x3 = (x1-x)*(x1-x);
        y3 = (y1-y)*(y1-y);
        double d = x3+y3;
        d = Math.sqrt(d);
        return d;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}
