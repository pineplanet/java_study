package EDU;

public class E4_11 {
    public static void main(String[] args) {
        for (int i = 1;i<10;i++){
            for ( int j = 1;j<4;j++){
                int x = j+1+(i-1)/3*3;

                int y = i%3==0?3:i%3;
                System.out.print(i+","+j+"\t");
                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.println();
        }

    }
}
