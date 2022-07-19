public class Car extends Vehicle {

    public Car(String name, int kilometers) {
        super(name, kilometers);
    }
    @Override
    public String doStuff() {
        return "I'm " + this.getName() + "  and I go zoom zoom zoom!";
    }
}
