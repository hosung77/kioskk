import java.util.List;

public class MenuItem {

    // 필드

    private String menuName; // 메뉴명
    private Double price; //  메뉴 가격
    private String description; // 메뉴 설명
    private String category;


    // 생성자
    public MenuItem(String menuName, Double price, String description,String category){
        this.menuName = menuName;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    // 메서드

    // 메뉴를 출력해주는 메서드
    public void printedMenu(){
        System.out.println(menuName + "      | W " + price + " | " + description);

    }

    // 선택한 메뉴를 출력해주는 메서드
    public void printSelectedMenu(MenuItem menuItem){
        System.out.println("선택한 메뉴: "+ menuItem.getMenuName() + " | W " + menuItem.getPrice() + " | " + menuItem.getDescription());
    }

    // 선택한 메뉴를 장바구니에 담을 것인지 확인하는 메세지르를 출력해주는 메서드
    public void printSelectedMenuMore(MenuItem menuItem){
        System.out.println("\""+ menuItem.getMenuName() + " | W "+ menuItem.getPrice() + " | "+ menuItem.getDescription()+"\"");
    }

    // 게터

    public String getMenuName(){
        return this.menuName;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.description;
    }

    public String getCategory(){
        return this.category;
    }

    // 세터

    public void setMenuName(String menuN){
        this.menuName = menuN;
    }

    public void setPrice(Double menuP){
        this.price = menuP;
    }

    public void setDescription(String menuD){
        this.description = menuD;
    }
}

