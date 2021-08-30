public class test {
    public static void main(String[] args) {
        int x= 1, y= 2, z= 3; //x = 2, y =3 z = 1   이 되도록 바꾸자.
        int tmp = x;
        x = y;
        y = z;
        z = tmp;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);

    }
}
