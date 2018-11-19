public class User {

    // 4 primative types

    // String = reference
    private String firstName;
    private String lastName;

    // age primative type
    public int age;
    // boolean primative type
    public boolean admin;

    // constant class
     public static final int MIN_AGE = 18;

    public User(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    // method to get user's first name, last name, and age
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(boolean admin) {
        this.admin = admin;
    }

    // static method
    public static boolean ofAge(int age) {
        return age >= MIN_AGE;
    }



    // method sayHello() to greet the user lastname, firstname
    public String sayHello() {
        return String.format("Welcome %s, %s!", firstName, lastName);
    }

    // method stageAge() to state the user's age
    public String stageAge() {
        return String.format("You are %s years old.", age);

    }


}
