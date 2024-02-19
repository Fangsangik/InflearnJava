package chap8.practice2;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        int maxProdcut = 10;
        int productCnt = 0;
        String[] productNames = new String[maxProdcut];
        int[] priceProduct = new int[maxProdcut];


        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.print("1. 상품등록 | 2. 상품 목록 | 3. 종료");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1){
                if (productCnt >= maxProdcut){
                    System.out.println("더이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.println("상품 이름을 등록하세요 ");
                productNames[productCnt] = sc.nextLine();

                System.out.println("상품 가격을 입력하세요");
                priceProduct[productCnt] = sc.nextInt();

                productCnt++;
            } else if (menu == 2){
                if (productCnt == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCnt; i++) {
                    System.out.println(productNames[i] + " : " + priceProduct[i]);
                }
            } else if (menu == 3){
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다");
            }
        }
    }
}

