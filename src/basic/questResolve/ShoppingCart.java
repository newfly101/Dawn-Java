package basic.questResolve;

public class ShoppingCart {
     private Item[] items = new Item[10];
     private int itemCount = 0;

     public void addItem(Item item) {
          if  (itemCount < items.length) {
               items[itemCount] = item;
               itemCount++;
          } else {
               System.out.println("장바구니가 가득 찼습니다.");
          }
     }
     public void displayItems() {
          System.out.println("장바구니 상품 출력");
          int totalAmount = 0;
          for (int i = 0; i < itemCount; i++) {
             System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].getPrice() * items[i].getQuantity());
             totalAmount += items[i].getPrice()*items[i].getQuantity();
          }
          System.out.println("전체 가격 합:" + totalAmount);
     }
}
