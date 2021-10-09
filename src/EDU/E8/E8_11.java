package EDU.E8;

public class E8_11 {
    public static void gugu(String x, String  y){
        int i,j;
        i = Integer.parseInt(x);
        j = Integer.parseInt(y);
        for (int k = i; k < j+1 ; k++) {
            for (int l = 1; l < 10; l++) {
                System.out.println(k +"*"+l+"="+k*l);

            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        gugu(args[0],args[1]);
    }
}
