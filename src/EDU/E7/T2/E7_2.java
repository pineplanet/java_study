package EDU.E7.T2;

class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){

        for (int i = 0; i < cards.length; i++) {
            int num = i%10+1;
            boolean isKwang = (i<10)&& (num==1||num == 3|| num== 8);

            cards[i] = new SutdaCard(num,isKwang);

        }
    }
    void Shuffle(){

        for (int k = 0; k < cards.length; k++) {
            int i = (int)(Math.random()*cards.length);
            int j = (int)(Math.random()*cards.length);

            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;

        }

    }
    SutdaCard pick(int index){
        return cards[index];
    }
    SutdaCard pick(){
        int a = (int)(Math.random()* cards.length);
        return cards[a];
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


class E7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.Shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
    }

}
