import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {


    public void start(Menu menu, Cart cart, Order order){ // 메인에서 옮겨온 로직. 메인에서 사용하여 kiosk 실행
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("[ MAIN MENU ]");
            menu.printedCategories();

            if (cart.cartIsNull() == false){
                System.out.println("[ ORDER MENU ]");
                order.printOrders();
            }

            System.out.println("0. 종료      | 종료");
            System.out.println("원하시는 메뉴를 선택해주세요.");
            int selectedMNum= sc.nextInt();

            switch (selectedMNum){
                case 0:
                    System.out.println("프로그램이 종료됩니다.");
                    return;
                case 1:
                case 2:
                case 3:
                    break;
                case 4:
                    try{
                        if(cart.cartIsNull()){
                            throw new IllegalStateException("장바구니에 상품이 없습니다. 메뉴를 다시 선택해주세요.");
                        }else{
                            cart.printedCart();
                            cart.printTotalPrice();
                            order.showOrderNum();
                            int selectFinalNum = sc.nextInt();
                            double totalP = cart.getPrintTotalP();
                            order.finalChoice(selectFinalNum, totalP);
                            continue; // 루프 처음으로 돌아가기
                        }
                    }catch (IllegalStateException e){
                        System.out.println(e.getMessage());
                    }
                case 5:
                    System.out.println("주문을 종료합니다.");
                    System.exit(0);

                default:
                    System.out.println("입력하신 번호는 없는 메뉴입니다. 다시 입력해주세요.");
            }

            menu.printMenuItem();
            System.out.println("0. 종료      | 종료");

            System.out.println("원하시는 메뉴를 입력해주세요.");
            int selectedNum = sc.nextInt();

            switch (selectedNum){
                case 0:
                    System.out.println("프로그램이 종료됩니다.");
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                    MenuItem selectedIndex = menu.getMenuItems().get(selectedNum-1);
                    // 인덱스는 0부터 시작이라 선택한 숫자에 -1을 빼줘야 첫번째에 접근가능.
                    selectedIndex.printSelectedMenu(selectedIndex.getMenuName(),selectedIndex.getPrice(),selectedIndex.getDescription());
                    selectedIndex.printSelectedMenuMore(selectedIndex.getMenuName(),selectedIndex.getPrice(),selectedIndex.getDescription());
                    int selectedOrder = sc.nextInt();
                    if (selectedOrder == 1){
                        cart.addItem(selectedIndex);
                        break;
                    } else
                        break;
                    default:
                    System.out.println("입력하신 번호는 없는 메뉴입니다. 다시 입력해주세요.");
            }

        }
    }

}
