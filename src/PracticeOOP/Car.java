package PracticeOOP;

public class Car {
    // primative types
    private String ownerFirstName;
    private String ownerLastName;

    public String model;
    public int year;

    public int miles;

    public Car() {

    }

    public Car(String ownerFirstName, String ownerLastName, String model, int year, int miles) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.model = model;
        this.year = year;
        this.miles = miles;
    }

    public String greet() {
        return String.format("Hello, " + ownerLastName + " " + ownerLastName);
    }

    public String ownerCar(){
        return String.format("You're vehicle is " + year + " " + model + " with " + miles + " miles" );
    }

}
