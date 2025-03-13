import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        List<String> orderNames = List.of("Orders(장바구니를 확인 후 주문)","Cancel(주문 취소)");
        Order order = new Order(orderNames);

        Menu burgers = new Menu("Burger"); // 객체 생성 동시에 카테고리 이름을 매개변수로 넣어서 카테고리 리스트에 값을 설정
        burgers.addItem(new MenuItem("ChickenBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치킨버거"));
        burgers.addItem(new MenuItem("PsyBurger", 8.9, "베이컨에 통치킨 패티가 들어간 쉑소스 치킨버거"));
        burgers.addItem(new MenuItem("BulgogiBurger", 6.9, "한우 + 치즈가 토핑된 불고기버거"));
        burgers.addItem(new MenuItem("DaeriBurger", 5.4 , "비프패티 + 야채 기본버거"));

        Kiosk kiosk = new Kiosk();
        kiosk.start(menu, cart, order);
    }
}
