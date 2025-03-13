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
        List<Menu> allMenu = new ArrayList<>();

        Menu burgers = new Menu("Burger"); // 객체 생성 동시에 카테고리 이름을 매개변수로 넣어서 카테고리 리스트에 값을 설정
        burgers.addItem(new MenuItem("ChickenBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치킨버거"));
        burgers.addItem(new MenuItem("PsyBurger", 8.9, "베이컨에 통치킨 패티가 들어간 쉑소스 치킨버거"));
        burgers.addItem(new MenuItem("BulgogiBurger", 6.9, "한우 + 치즈가 토핑된 불고기버거"));
        burgers.addItem(new MenuItem("DaeriBurger", 5.4 , "비프패티 + 야채 기본버거"));

        Menu drinks = new Menu("Drinks");
        drinks.addItem(new MenuItem("Cola",1.2,"탄산 가득한 코카콜라"));
        drinks.addItem(new MenuItem("Zero Cola",1.2,"탄산 가득한 코카콜라 제로"));
        drinks.addItem(new MenuItem("Sprite",1.2,"탄산 가득한 스프라이트"));
        drinks.addItem(new MenuItem("Sprite Zero",1.2,"탄산 가득한 스프라이트 제로"));

        Menu sides = new Menu("Sides");
        sides.addItem(new MenuItem("French Fries", 2.5,"갓 튀긴 감자튀김"));
        sides.addItem(new MenuItem("Shake Fries", 3.0,"시즈닝을 넣고 흔들어 먹는 감자튀김"));
        sides.addItem(new MenuItem("Onion Ring", 2.5,"갓 튀겨낸 신선한 양파 튀김"));
        sides.addItem(new MenuItem("Chicken Nuggets", 2.5,"버x킹 보다 맛있는 치킨너겟"));

        allMenu.add(burgers);
        allMenu.add(drinks);
        allMenu.add(sides);


        Kiosk kiosk = new Kiosk();
        kiosk.start(allMenu, cart, order);
    }
}
