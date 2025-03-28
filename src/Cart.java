import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Cart {
    private List<MenuItem> cart = new ArrayList<>();

    public void addItem(MenuItem menuItem){
        cart.add(menuItem);
        System.out.println(menuItem.getMenuName()+" 이 장바구니에 추가되었습니다.");
    }

    // cart 리스트가 비어있는지 확인하는 매서드
    public boolean cartIsNull(){
        return cart.isEmpty(); // 비어있으면 true를 반환
    }

    // 메뉴를 주문하기 전 담긴 메뉴목록을 출력해주는 메서드
    public void printedCart(){
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println("[ Orders ]");
        cart.stream()
                .forEach(c ->{
                    System.out.println(String.format(
                            "%-20s | W%-6.2f | %s",
                            c.getMenuName(),c.getPrice(),c.getDescription()
                    ));
                });
    }

    // 메뉴를 삭제하기 위해 장바구니의 메뉴목록을 출력해주는 메서드
    public void printedForDeleteCartMenu(){
        AtomicInteger num = new AtomicInteger(1);
        cart.stream()
                .forEach(c ->{
                    System.out.println(String.format(
                            "%-3d %-20s | W%-6.2f | %s",
                            num.getAndIncrement(),
                            c.getMenuName(),c.getPrice(),c.getDescription()
                    ));
                });
        System.out.println("선택하신 메뉴가 삭제 되었습니다.");
    }

    // Cart에 담긴 물품의 총 가격을 출력해주는 메서드
    public void printTotalPrice(){
        double totalPrice = 0;
        for(MenuItem totalP : cart){
            totalPrice += totalP.getPrice();
        }
        System.out.println("[ Total ]");
        System.out.printf("W %.1f\n", totalPrice);
    }

    // 카트의 총 가격을 반환해주는 메서드
    public double getPrintTotalP(){
        double totalP = 0;
        for(MenuItem menuItem : cart){
            totalP += menuItem.getPrice();
        }
        return totalP;
    }


    public void removeCartItem(int num){
        String name = cart.get(num-1).getMenuName();
        cart.removeIf(s -> s.getMenuName().equals(name));  // 해당 이름의 메뉴 삭제
    }

}
