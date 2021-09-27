package EDU;
//주어진 배열을 시계방향으로 90도 회전 시켜서 출력하는 프로그램을 완성하시오
public class E5_9 {
    public static void main(String[] args) {
        char[][] star = {
                { '*', '*', ' ', ' ', ' ' },
                { '*', '*', ' ', ' ', ' ' },
                { '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*' }
        };
        char[][] result = new char[star[0].length][star.length];
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                //star[3][0] -> result[0][0], star[2][0] -> result[0][1], star[1][0] -> result[0][2], star[0][0] -> result[0],[3]
                //x==j;
                //i+y = 3;
                int x = j;
                int y =  star.length-1 -i;

                result[x][y] =star[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    } // end of main
} // end of class

