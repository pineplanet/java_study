package EDU.E7;

class Circle extends Shape{
    double r;
    Circle(double r){
        this(new Point(0,0),r);

    }
    Circle(Point p, double r){
        super(p);
        this.r = r;
    }
    @Override
    double calcArea() {
        //pi*r^2
        return Math.PI*r*r;
    }
}

class Rectangle extends Shape{
    int width;
    int height;
    Rectangle(int width , int height){
        this(new Point(0,0),width,height);
    }
    Rectangle (Point p, int width, int height){
        super(p);
        this.width = width;
        this.height = height;
    }
    @Override
    double calcArea() {
        //width*height
        return width*height;
    }
    boolean isSquare(){
        return width*height !=0&& width==height;
        //return false;
    }
}

abstract class Shape{
    Point p;
    Shape(){
        this(new Point(0,0));
    }
    Shape(Point p){
        this.p = p;
    }
    abstract double calcArea();

    Point getPosition(){
        return p;
    }
    void setPosition(Point p){
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point (){
        this(0,0);
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "["+x+ ","+y+"]";
    }
}
public class E7_22 {
}
