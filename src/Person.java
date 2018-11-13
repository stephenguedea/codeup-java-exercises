public class Person {
    private String name;



    // returns the person's name
    public String getName(){
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.format("Hello, my name is %s", this.name);
    }


    // constructor that accepts a string value and
    // sets the person's name to the passed string
    public Person(String name) {
        setName(name);
    }

    // create a main method on the class that creates a new Person object
    // and tests the above methods
    public static void main(String[] args) {

//        Person p = new Person();
//        p.name = "Stephen";
//        p.sayHello();

//        Person p1 = new Person("John");
//        Person p2 = new Person("John");
//        System.out.println(p1.getName().equals(p2.getName())); //true
//        System.out.println(p1 == p2);                           // false
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true



//
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John
        person2.setName("Jane");
        System.out.println(person1.getName()); // Jane
        System.out.println(person2.getName()); // Jane

    }

}
