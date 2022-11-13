package top.popov.testSpring;

public class Kitchen {
    private Menu menu;
    private String name;
    private double price;

    public Kitchen(Menu menu) {
        this.menu = menu;
    }

    public Kitchen() {}

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void getMenu(){
        System.out.println(menu.getMenu());
    }
}
