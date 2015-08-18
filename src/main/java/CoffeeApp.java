public class CoffeeApp {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = DaggerCoffeeShop.create();
        coffeeShop.thermosiphon().boil();
    }
}
