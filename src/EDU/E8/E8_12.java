package EDU.E8;

public class E8_12 {
    public static int getRand(int from, int to){
       /*int num = Math.abs(from - to);
       return (int)(Math.random()*num);*/
        // - 값이 안나옴

        //해답
        return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from,to);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(getRand(1,-3)+",");
        }
    }
}
