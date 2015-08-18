import dagger.Component;

@Component(modules = DripCoffeeModule.class)
interface CoffeeShop {

    Thermosiphon thermosiphon();
}
