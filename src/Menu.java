import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 필드

    private List<MenuItem>burgers  = new ArrayList<>(); // MenuItem 클래스를 List로 관리
    private List<MenuItem>drinks  = new ArrayList<>(); // MenuItem 클래스를 List로 관리
    private List<MenuItem>sides  = new ArrayList<>(); // MenuItem 클래스를 List로 관리


    // 생성자

    public Menu() {


        MenuItem m1 = new MenuItem("ChickenBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치킨버거","Burgers");
        MenuItem m2 = new MenuItem("PsyBurger", 8.9, "베이컨에 통치킨 패티가 들어간 쉑소스가 토핑된 치킨버거","Burgers");
        MenuItem m3 = new MenuItem("BulgogiBurger", 6.9, "국내산 한우와, 치즈가 토핑된 불고기버거","Burgers");
        MenuItem m4 = new MenuItem("DaeriBurger", 5.4 , "비프패티를 기반으로 야채가 들어간 기본버거","Burgers");

        burgers.add(m1);
        burgers.add(m2);
        burgers.add(m3);
        burgers.add(m4);

        MenuItem m5 = new MenuItem("Coke",1.2,"탄산 가득한 코카콜라","Drinks");
        MenuItem m6 = new MenuItem("ZeroCoke",1.2,"탄산 가득한 코카콜라 제로","Drinks");
        MenuItem m7 = new MenuItem("Sprite",1.2,"탄산 가득한 스프라이트","Drinks");
        MenuItem m8 = new MenuItem("ZeroSprite",1.2,"탄산 가득한 스프라이트 제로","Drinks");

        drinks.add(m5);
        drinks.add(m6);
        drinks.add(m7);
        drinks.add(m8);

        MenuItem m9 = new MenuItem("French Fries",2.2,"갓 튀긴 감자튀김","Sides");
        MenuItem m10 = new MenuItem("Onion Ring",2.2,"갓 튀긴 양파튀김","Sides");
        MenuItem m11 = new MenuItem("Chicken nugget",2.2,"버x킹 보다 맛있는 치킨너겟","Sides");
        MenuItem m12 = new MenuItem("Shake French Fries",2.2,"가루를 넣고 흔들어 먹는 감자튀김","Sides");

        sides.add(m9);
        sides.add(m10);
        sides.add(m11);
        sides.add(m12);


    }



    // 메서드

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
