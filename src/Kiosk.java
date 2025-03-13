import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {


    public void start(List<Menu> menu, Cart cart, Order order){ // 메인에서 옮겨온 로직. 메인에서 사용하여 kiosk 실행
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("[ MAIN MENU ]");
            System.out.printf("1. Burgers\n2. Drinks\n3. Sides\n0. 종료\n"); // ln으로 하면 3줄에 걸쳐서 작성해야된다.
            if (cart.cartIsNull() == false){
                System.out.println("[ ORDER MENU ]");
                order.printOrders();
            }
            int selectNum = sc.nextInt();

            switch (selectNum) {
                case 0:
                    System.out.println("프로그램이 종료됩니다.");
                    System.exit(0);
                case 1:
                case 2:
                case 3:
                    Menu selectedCategoryMenu = menu.get(selectNum-1);
                    selectedCategoryMenu.printSelectedMenu();

                    int selectNum2 = sc.nextInt(); // 출력한 카테고리의 메뉴 선택
                    if (selectNum2 == 0){
                        continue;
                    }
                    MenuItem selectedMenu = selectedCategoryMenu.getIndexMenu(selectNum2);
                    selectedMenu.printSelectedMenu(selectedMenu);
                    selectedMenu.printSelectedMenuMore(selectedMenu);
                    System.out.println("위 메뉴를 장바구니 추가하시겠습니까?");
                    System.out.println("1. 확인         2.취소");
                    int selectAddToCart= sc.nextInt();
                    if(selectAddToCart == 1){
                        cart.addItem(selectedMenu);
                        continue;
                    } else if(selectAddToCart == 2){
                        System.out.println("장바구니 담기를 취소하셨습니다.");
                        continue;
                    }

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
                    System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");
                    continue; // 잘못된 입력은 다시 입력 받도록
            }


        }
    }

}
