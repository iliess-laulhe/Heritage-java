public class Boat extends Vehicle{

    public Boat(String name, int kilometers) {
        super(name, kilometers);
    }
    @Override
    public String doStuff() {
        return "I'm" + this.getName() + "and I go glug glug!";
    }
}
