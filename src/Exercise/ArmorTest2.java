package Exercise;

public class ArmorTest2 {
    public static void main(String[] args) {
        Armor a = new Armor(); //a -> stack Armor -> heap
        System.out.println("ok");
        int r = a.takeOff(); //메소드 호출하러 가서 (Armor.java(stack영역))-> 사라짐
        System.out.println("good");
        System.out.println(r);
    }
}
