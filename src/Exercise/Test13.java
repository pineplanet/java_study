package Exercise;

public class Test13 {
    public static void main(String[] args) {
        String nation = "python";
        //KOR, JPN, CHN => "아시아"
        //GBR, FRA, EUA => "유럽"
        //USA, CAN, MEX => "아메리카"
        //if문으로 만들어보자
        if (nation.equals("KOR") || nation.equals("JPN") || nation.equals("CHN")) {
            System.out.println("아시아");
        } else if (nation.equals("GBR") || nation.equals("FRA") || nation.equals("EUA")) {
            System.out.println("유럽");
        } else if (nation.equals("USA") || nation.equals("CAN") || nation.equals("MEX")) {
            System.out.println("아메리카");
        } else {
            System.out.println("외계 문명");
        }
        //switch 문
        switch (nation) {
            case "KOR":
            case "JPN":
            case "CHN":
                System.out.println("아시아");
                break;

            case "GBR":
            case "FRA":
            case "EUA":
                System.out.println("유럽");
                break;
            case "USA":
            case "CAN":
            case "MEX":
                System.out.println("유럽");
                break;
            default:
                System.out.println("기타지역");
                break;
        }
    }
}
