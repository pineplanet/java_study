package com.encore.java.app;


import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Contact cont = new Contact();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("===========연락처 프로그램 =============");
            System.out.println("1.연락처 추가 2. 연락처 출력 3. 연락처 검색 4. 연락처 삭제 5.연락처 수정 9.종료");
            System.out.println("메뉴를 선택해 주세요 ");

            String menu = scan.nextLine();

            if (menu.equals("1")) {
                System.out.println("이름과 전화번호를 입력하세요 ");
                System.out.println("예) 박보검,0101234567");
                String input = scan.nextLine();
                String[] info = input.split(",");
                Friend f = new Friend(info[0], info[1]);
                cont.add(f);

            } else if (menu.equals("9")) {
                System.out.println("프로그램을 종료 합니다.");
                System.exit(0);
            } else if (menu.equals("2")) {
                cont.getInfo();

            } else if (menu.equals("3")) {
                System.out.println("검색할 이름 입력: ");
                String name = scan.nextLine();
                ArrayList<Friend> result = cont.search(name);
                if (result.isEmpty()) {
                    System.out.println("검색 결과가 없습니다.");
                } else {
                    for (int i = 0; i < result.size(); i++) {
                        System.out.println(result.get(i));
                    }
                }

            } else if (menu.equals("4")) {
                System.out.println("삭제할 이름 입력: ");
                String name = scan.nextLine();
                cont.delete(name);
            } else if (menu.equals("5")){
                System.out.println("수정할 이름 입력: ");
                String name = scan.nextLine();
                System.out.println("새로운 전화번호 입력: ");
                String tel = scan.nextLine();

                ArrayList<Friend>result = cont.search(name);
                int count = result.size();
                if(count == 0){
                    System.out.println("등록된 연락처가 없습니다.");
                }else if (count == 1){
                    cont.modify(result.get(0),tel);
                }else{
                    System.out.println("수정할 연락처를 선택하세요.");
                    for (int i = 0; i < result.size(); i++) {
                        System.out.println((i+1)+"번");
                        System.out.println(result.get(i));

                    }
                    String num = scan.nextLine();
                    int idx = Integer.parseInt(num)-1;
                    cont.modify(result.get(idx),tel);
                }

                //cont.modify(name,tel);
            }
        }
    }
}
// 차은우,0100000000
// 박보검, 01011111111
// 이동욱, 010000001
// 차은우, 0100000001