public class Car {
    private boolean engine;
    private  int cylinders;
    private  String name;
    private  int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 2;
    }
    public String startEngine()
    {
        return "Car -> startEngine()";
    }
    public String accelerate()
    {
        return "Car -> accelerate()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String brake()
    {
      return  "Car -> brake()";
    }
}
