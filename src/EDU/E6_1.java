package EDU;

public class E6_1 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        card1.info();
        card2.info();
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard() {
        this(1, true);

    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;

    }

    public void info(){
        System.out.print(this.num);
        if (this.isKwang == true){
            System.out.println('K');
        }
        System.out.println();

    }

}