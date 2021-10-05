package ch08.Test4;

public class Test3 {
    public static void eat(Animal a) {

        if (a instanceof Cat) {
            System.out.println("생선을 먹습니다.");
            //고양이 꼬리 길이를 30.5 저장
            Cat c = (Cat) a;
            c.tail = 30.5;
        } else if (a instanceof Dog) {
            System.out.println("사료를 먹습니다.");
            //강아지 종은 푸들 저장
            Dog d = (Dog) a;
            d.species = "푸들";
        } else if (a instanceof Bird) {
            System.out.println("애벌레를 먹습니다.");
            //새의 비행 여부 는 true로 저장
            Bird b = (Bird) a;
            b.isFly = true;
        }
        //인자 값이 Cat 이면 "생선"
        //인자 값이 Dog 이면 "사료"
        //인자 값이 Bird 이면 "애벌레"
    }

    public static void main(String[] args) {
        //Cat, Dog, Bird 인스턴스를 생성 합니다.
        //앞에서 생성한 3개의 인스턴스 주소를 전달하며 eat 메소드를 호출

        Cat c = new Cat();
        Dog d = new Dog();
        Bird b = new Bird();

        eat(c);
        eat(d);
        eat(b);

        System.out.println(c.tail);
        System.out.println(d.species);
        System.out.println(b.isFly);
        //배열을 만들어서 각 인스턴스의 주소값을 넣을것
        Cat c1 = new Cat("나비");
        Cat c2 = new Cat("야옹이");
        Cat c3 = new Cat("멍군");

        Cat[] list = new Cat[3];
        list[0] = c1;
        list[1] = c2;
        list[2] = c3;

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].name);

        }
        Animal[] list2 = new Animal[3];
        list2[0]= c;
        list2[1]= d;
        list2[2]= b;
        
    }
}

class Animal {
    String name;

    Animal() {
        this.name = "no name";
    }

    Animal(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("움직입니다.");

    }
}

class Cat extends Animal {

    double tail;

    Cat() {
    }

    Cat(String name) {
        super(name);
    }

}

class Dog extends Animal {
    String species;
}

class Bird extends Animal {
    boolean isFly;
}