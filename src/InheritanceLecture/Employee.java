package InheritanceLecture;

public class Employee extends Person{


    private double salary;
    public void doWork() {
        System.out.println("Working...");
    }


//        private double salary;
//        public void doWork() {
//            System.out.println("Work, work...");
//        }

    // method overwriting
    public void sayHello() {
        System.out.println("How can I help you?");
    }

    // method overwriting
//    public void sayHello(String name) {
//        System.out.println("Hello from " + name);
//    }

//    public void saySecret(){
//        System.out.println("Hello " + knownName + " and " + secretName);
//
//    }

//    public String work(){
//            return "filling out TPS reports";
//    }
}
