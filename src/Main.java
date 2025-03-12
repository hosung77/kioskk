import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        List<String> categories = List.of("Burgers","Drinks","Deserts"); // 메뉴 객체 생성시 넣어줄 카테고리 리스트
        Cart cart = new Cart();
        List<String> orderNames = List.of("Orders(장바구니를 확인 후 주문)","Cancel(주문 취소)");
        Order order = new Order(orderNames);

        Menu menu = new Menu(categories); // 객체 생성 동시에 카테고리 이름을 매개변수로 넣어서 카테고리 리스트에 값을 설정

        Kiosk kiosk = new Kiosk();
        kiosk.start(menu, cart, order);
    }
}
