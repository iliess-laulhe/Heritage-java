public class Hangar {
    public static void main(String[] args) {
        
        Car car1 = new Car("Clio", 113410);
        Boat boat1 = new Boat("Zodiac", 20120);

        System.out.println(car1.doStuff());
        System.out.println(boat1.doStuff());
    }
}
