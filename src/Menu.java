import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Menu {
    // 필드
    private List<MenuItem>menuList  = new ArrayList<>(); // MenuItem 클래스를 List로 관리
    private String category;

    // 생성자

    public Menu(String cate) {
        this.category = cate;
    }

    // 메서드

    public void addItem(MenuItem menuItem){
        menuList.add(menuItem);
    }

    public List<MenuItem> getMenuList() {
        return menuList;
    }

    public String getCategory(){
        return this.category;
    }

    public void printSelectedMenu(){
        System.out.println("[ " + category + " ]" );
        AtomicInteger num = new AtomicInteger(1); //  내부 값 증가가 가능해서 람다 안에서 num++ 같은 역할
        menuList.stream()
                .forEach(m -> {
                    // String.format을 사용하여 출력 형식 통일
                    System.out.println(String.format("%-1d. %-20s | W%-6.2f | %s",
                            num.getAndIncrement(),
                            m.getMenuName(),
                            m.getPrice(),
                            m.getDescription()));
                });
        // -1d num 왼쪽 정렬로 1자리 공간을 확보
        // %-20s m.getMenuName()을 출력하는데, 왼쪽 정렬로 20자리 공간을 확보
        // %-6.2f m.getPrice()는 W 뒤에 6자리 공간을 확보, 소수점 2자리로 출력
        //  m.getDescription()은 그대로 출력

    }

    public MenuItem getIndexMenu(int num){
       MenuItem m = menuList.get(num-1);

        return m;
    }


}
