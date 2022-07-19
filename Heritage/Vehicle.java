public abstract class Vehicle {
    private String name;
    private int kilometers;

    public Vehicle(String name, int kilometers) {
        this.name = name;
        this.kilometers = 0;

    }

    public String getName() {  
        return this.name;  
    }  

    public void setName(String name) {  
        this.name = name;  
    }  

    public int getkilometers() {  
        return this.kilometers;  
    }  
    public void setAge(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff ();

}