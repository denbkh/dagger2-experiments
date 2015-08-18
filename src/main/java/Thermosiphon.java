import javax.inject.Inject;

class Thermosiphon {
    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    public void boil() {
        System.out.println("Thermosiphon.boil");
        heater.heat();
    }
}
