import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<String> orders = new ArrayList<>();

    public Order(List<String> orderName){
        this.orders = orderName;
    }

    // 장바구니에 메뉴가 있을때 4,5번 보기를 출력해주는 메서드
    public void printOrders(){
        int orderNum = 4;
        for(String order : orders){
            System.out.println(orderNum+". "+ order);
            orderNum++;
        }
    }

    // 선택지를 출력해주는 메서드
    public void showOrderNum() {
        System.out.println("1. 주문       2. 메뉴판");
    }

    // 주문할지 메뉴판으로 돌아갈지 정하는 메서드
    public void finalChoice(int choiceNum, double totalPrice) {

        switch (choiceNum) {
            case 1:
                System.out.println("할인 정보를 입력해주세요.");
                int num = 1;
                for(Discount d: Discount.values()){
                    System.out.print(num+". ");
                    System.out.println(d.name()+" : "+ (d.getDiscountRatio()*100)+"%");
                    num++;
                }
                Scanner sc = new Scanner(System.in);
                int selectedType = sc.nextInt();
                double seltectedDiscountRatio = Discount.getSelectedRatio(selectedType);
                System.out.printf("총 금액은 W %.2f 입니다.\n", totalPrice * (1-seltectedDiscountRatio));
                System.exit(0);
            case 2:
                break;
            default:
                System.out.println("번호를 알맞게 다시 입력해주세요");

        }
    }


}
