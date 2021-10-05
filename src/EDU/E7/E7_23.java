package EDU.E7;

public class E7_23 {
    static double sumArea(Shape[] shapes){
        double sum =0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].calcArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape [] arr = {new Circle(5.0),new Rectangle(3,4),new Circle(1)};
        System.out.println(sumArea(arr));

    }
}
