package LearningJava.Lessons.Lesson7OOBpart2.InterfaceDemo;

public class InterfaceDemo {

    public static void main(String[] args) {
        MyClass a = new MyClass();
        a.someMethod(); // This is a method implemented in MyClass

        System.out.println("The value of the constant is " + MyInterface.myInt); // The value of the constant is 5


    }
}

class MyClass implements MyInterface {

    @Override
    public void someMethod() {
        System.out.println("This is a method implemented in MyClass");
    }

}

interface MyInterface{
    int myInt = 5;
    void someMethod();
}
