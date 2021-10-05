package EDU.E7;
// 에러가 나는 이유 :
//Tv 클래스 는 Product를 상속 하고 있다.
//그런데 Product의 생성자는 price를 인자 값으로 넣고 있으므로,
// 인자값을 받지 않는 Product 생성자를 만들거나,
// Tv 생성자에서 Product 생성자를 호출할 때 인자 값을 넣도록 추가 해야한다.
class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv extends Product {

    Tv(){
        super(0);
    }

    public String toString(){
        return "Tv";
    }
}
public class E7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
