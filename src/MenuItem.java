
// MenuItem class
public class MenuItem {
    private String name;
    private double priceInDollars;

    public MenuItem(String name, double priceInDollars) {
        this.name = name;
        this.priceInDollars = priceInDollars;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return priceInDollars;
    }
}
