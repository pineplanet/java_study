package EDU.E7.T1;

class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        boolean isKwang = false;
        for (int i = 0; i < CARD_NUM/2; i++) {
            int num = i+1;
            if (num==1||num ==3||num ==8)
                isKwang = true;
            else
                isKwang = false;
            cards[i] = new SutdaCard(num,isKwang);
        }
        for (int i = 0; i < CARD_NUM/2; i++) {
            int num = i+1;
            isKwang = false;
            cards[i+10] = new SutdaCard(num,isKwang);

        }
        // 답안
        /*for (int i = 0; i < card.length; i++) {
            int num = i%10+1;
            boolean isKwang = (i<10)&& (num==1||num == 3|| num== 8);

            cards[i] = new SutdaCard(num,isKwang);

        }*/
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }
    SutdaCard(int num,boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString(){
        return num + (isKwang? "K":"");
    }
}



class E7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
    }

}
