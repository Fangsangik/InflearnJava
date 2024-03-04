package chap15.shopping;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCnt;


    public void addItem(Item item) {
        if (itemCnt >= items.length) {
            System.out.println("장바구나 가득 참");
            return;
        }

        items[itemCnt] = item;
        itemCnt++;
    }

    public void showInfo(){
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCnt; i++) {
            Item item = items[i];
            System.out.println("상품명 " + item.getName()
            + item.getTotalPrice());
        }

        System.out.println("전체 가격 합 " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCnt; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
    }
}
