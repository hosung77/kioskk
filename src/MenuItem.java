import java.util.List;

public class MenuItem {
    private String menuName; // 메뉴명
    private Double price; //  메뉴 가격
    private String description; // 메뉴 설명

    public MenuItem(String menuName, Double price, String description){
        this.menuName = menuName;
        this.price = price;
        this.description = description;
    }

    public void printedMenu(){
        System.out.println(menuName + "      | W " + price + " | " + description);

    }

    public void printSelectedMenu(String menuN, Double menuP, String des){
        System.out.println("선택한 메뉴: "+ menuN + "      | W " + menuP + " | " + des);

    }


    public String getMenuName(){
        return this.menuName;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.description;
    }


}

