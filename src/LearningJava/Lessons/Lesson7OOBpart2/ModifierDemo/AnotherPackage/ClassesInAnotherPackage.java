package LearningJava.Lessons.Lesson7OOBpart2.ModifierDemo.AnotherPackage;

import LearningJava.Lessons.Lesson7OOBpart2.ModifierDemo.ModifierDemo;

public class ClassesInAnotherPackage {

    // just an empty class
}

class MyClassC extends ModifierDemo {
    public void printMessages() {

        // OK
        System.out.println(publicNum);

        // OK
        System.out.println(protectedNum);

        // NOT OK
//        System.out.println(packagePrivateNum);

//        NOT OK
//        System.out.println(privateNum);
    }
}
class MyClassD {
        public void printMessages() {
            ModifierDemo p = new ModifierDemo();

            // OK
            System.out.println(p.publicNum);

            // NOT OK
//            System.out.println(p.protectedNum);

            // NOT OK
//            System.out.println(p.packagePrivateNum);

            // NOT OK
//            System.out.println(p.privateNum);
        }
}


/* ClassC can access publicNum and protectedNum but not packagePri.., and privateNum.
* It can acess protectedNum because it's a child of ModifierDemo
*  ClassD can only access publicNum but nothing else because it's neither a subclass
*  of ModifierDemo nor in the same package. */
