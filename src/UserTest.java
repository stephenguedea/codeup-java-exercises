import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        User user1 = new User();
//        user1.firstName = "Stephen";
//        user1.lastName = "Guedea";
//        user1.age = 28;

//        User user2 = new User("Matt", "Andrews", 24);

        System.out.println("Enter first name: ");
        User user3 = new User();
        user3.setFirstName(scanner.next());
        System.out.println("Enter last name: ");
        user3.setLastName(scanner.next());
        System.out.println("Enter age: ");
        user3.setAge(scanner.nextInt());




//        System.out.println(user1.sayHello());
//        System.out.println(user1.stageAge());
//        System.out.println(user2.sayHello());
//        System.out.println(user2.stageAge());
        System.out.println(user3.sayHello());
        System.out.println(user3.stageAge());
        if (user3.getAge() >= 21) {
            System.out.println("You can buy beer!");
        } else {
            System.out.println("You CANNOT buy beer!");
        }
        System.out.println(User.ofAge(user3.age));


    }
}
