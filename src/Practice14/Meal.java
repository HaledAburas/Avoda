package Practice14;

public class Meal {
    String name;
    boolean vegan;
    float price;

    public Meal(String name, boolean vegan, float price) {
        this.name = name;
        this.vegan = vegan;
        this.price = price;
    }

    public String toString() {
        return "Meal{name='" + this.name + "', vegan=" + this.vegan + ", price=" + this.price + "}";
    }
}
