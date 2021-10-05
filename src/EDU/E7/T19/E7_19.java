package EDU.E7.T19;


public class E7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족;" + p + "를 살 수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);

    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] tmp = new Product[cart.length * 2];
            System.arraycopy(cart, 0, tmp, 0, cart.length);
            cart = tmp;
        }
        cart[i++] = p;
    }

    void summary() {
        String itemList = "";
        int sum = 0;
        for (int j = 0; j < cart.length; j++) {
            if (cart[j] == null) {
                break;
            }
            itemList += cart[j] + ",";
            sum += cart[j].price;
        }
        System.out.println("구입한 물건: " + itemList);
        System.out.println("사용한 금액: " + sum);
        System.out.println("남은 금액: " + money);


    }
}

class Product {
    int price;

    Product(int price) {
        this.price = price;
    }

}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }

}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

