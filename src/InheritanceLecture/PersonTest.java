package InheritanceLecture;

public class PersonTest {

    public static void main(String[] args) {

//        Employee john = new Employee("John");
//        john.sayHello();
//        john.name;

        Person p = new Person();
        Employee e = new Employee();

        p.sayHello();
        e.doWork();
        e.sayHello();

    }



//    public static void doWork(Employee e) {
//        System.out.println(e.work());
//    }

//    public static void triggerVehicleTurnOn(Vehicle v) {
//        v.turnOn();
//    }
//    public static void main(String[] args) {
//
//        Employee one = new Employee();
//        Employee two = new Manager();
//
//        doWork(one);
//        doWork(two);

//        Person p = new Person();




//        System.out.println(p.secretName);
//        Employee e = new Employee();
//        e.saySecret(); // Hello y
//
//
//        p.sayHello(); // hello world
//        e.sayHello(); // How can I help you?
//        e.doWork(); // Work, work...
//        e.sayHello("Stevie"); // Hello from Stevie


// super keyword
//        Person clark = new Person("Clark Kent");
//        System.out.println(clark.getName());
//        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");
//
//        System.out.println(theManOfSteel.getName()); // "Superman"
//        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"

//        Vehicle vh = new Vehicle(1000000);
//        Bus b = new Bus (60);
////        Jet j = new Jet (100);
////        Yacht y = new Yacht(20);
//
////        Vehicle[] vehicles = {vh, b, j, y};
//        Vehicle[] vehicles = {vh, b};
//        for (Vehicle v : vehicles){
//            triggerVehicleTurnOn(v);
//        }
//
//        b.eject();
//        b.honkHorn();
//        b.stopping();







}
