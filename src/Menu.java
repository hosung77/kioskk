import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<String> categoryNames = new ArrayList<>(); // 카테고리 이름 필드
    private List<MenuItem> menuItems = new ArrayList<>(); // MenuItem 클래스를 List로 관리

    public Menu(List<String> categoryName) {

        this.categoryNames = categoryName;

        MenuItem m1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem m2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem m3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem m4 = new MenuItem("Hamburger", 5.4 , "비프패티를 기반으로 야채가 들어간 기본버거");

        menuItems.add(m1);
        menuItems.add(m2);
        menuItems.add(m3);
        menuItems.add(m4);
    }

    // List에 포함된 MenuItem을 순차적으로 보여주는 함수
    public void printMenuItem (){
        // 메뉴 앞에 매겨줄 번호
        int menuNum = 1;
        for(MenuItem menuItem : menuItems){
            System.out.print(menuNum + ". ");
            menuItem.printedMenu();
            menuNum++; // 메뉴마다 번호를 다르게 매겨주기 위해 반복할떄마다 1을 증가시켜줌.
        }
    }

    public void printedCategories(){
        // 메뉴 앞에 매겨줄 번호
        int categoriesNum = 1;
        for(String category : categoryNames){
            System.out.print(categoriesNum + ". ");
            System.out.println(category);
            categoriesNum++;
        }
    }

    // List를 리턴하는 함수
    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }


}
