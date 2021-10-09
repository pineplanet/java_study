package EDU.E8;

import java.util.Objects;

class E8_1 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);

        System.out.println("c1 =" + c1);
        System.out.println("c2 =" + c2);
        System.out.println("c1.equals(c2):" + c2.equals(c2));

    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj) {
        SutdaCard obj1 = (SutdaCard) obj;
        int ObjNum = obj1.num;
        return (this.num) == ObjNum && (this.isKwang) == obj1.isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}