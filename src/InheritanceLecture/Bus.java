package InheritanceLecture;

public class Bus extends Vehicle {

    public boolean headLightOn;

    //creating new constructor
    public Bus(int maxSpeed) {
        super(maxSpeed); //using old constructor
        this.headLightOn = false;
    }

    public void honkHorn() {
        System.out.println("Honk HONK!!");
    }

    public void eject(){
        System.out.println("Laters!");
    }

    public void stopping(){
        System.out.println("Slowing down.... Halt!");
    }

    // overriding from parent
    public void turnOn(){
        System.out.println(".... cracking engine");
    }
}
