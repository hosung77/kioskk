import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;

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
        int num = 1;
        for(MenuItem m : menuList){
            System.out.println(num +". " + m.getMenuName()+"  | W "+m.getPrice() + " | "+m.getDescription());
            num++;
        }
    }

    public MenuItem getIndexMenu(int num){
       MenuItem m = menuList.get(num-1);

        return m;
    }


}
