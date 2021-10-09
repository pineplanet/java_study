package EDU.E8;
import java.util.Arrays;


public class E8_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2? "+ (p1==p2));
        System.out.println("p1.equals(p2)?"+p1.equals(p2));
    }
}

class Point3D {
    int x, y, z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }
    Point3D(){
        this(0,0,0);
    }
    public boolean equals(Object obj){
        Point3D object = (Point3D) obj;
        return this.x == object.x && this.y == object.y&&this.z == object.z;
    }
    public String toString(){

        //return "["+this.x+","+this.y+","+this.z+"]";
        int Array [] = {this.x,this.y,this.z};
        return Arrays.toString(Array);

    }

}
