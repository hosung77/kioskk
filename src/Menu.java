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

    public void printSelectedCategory(int num){
        switch (num){
            case 1:
                System.out.println("[ BURGERS MENU ]");
                int menuNum1 =1;
                for(MenuItem menuItem : burgers){
                    System.out.println(menuNum1 +". " + menuItem.getMenuName()+"  | W "+menuItem.getPrice() + " | "+menuItem.getDescription());
                    menuNum1++;
                }
                System.out.println("0. 뒤로가기");

                break;
            case 2:
                System.out.println("[ Drinks MENU ]");
                int menuNum2 =1;
                for(MenuItem menuItem : drinks){
                    System.out.println(menuNum2 +". " + menuItem.getMenuName()+"  | W "+menuItem.getPrice() + " | "+menuItem.getDescription());
                    menuNum2++;
                }
                System.out.println("0. 뒤로가기");
                break;
            case 3:
                System.out.println("[ Sides MENU ]");
                int menuNum3 =1;
                for(MenuItem menuItem : sides){
                    System.out.println(menuNum3 +". " + menuItem.getMenuName()+"  | W "+menuItem.getPrice() + " | "+menuItem.getDescription());
                    menuNum3++;
                }
                System.out.println("0. 뒤로가기");
                break;
            default:
                System.out.println("잘못된 번호입니다.");
        }
    }

    public MenuItem getMenuItem(int num1, int num2){
        if(num1 == 1){
            MenuItem menuItem = burgers.get(num2 -1);
            return menuItem;
        } else if (num1 == 2) {
            MenuItem menuItem2 = drinks.get(num2 -1);
            return  menuItem2;
        } else if (num1 == 3){
            MenuItem menuItem3 = sides.get(num2 -1);
            return  menuItem3;
        } else {
            return null;
        }
    }

}
