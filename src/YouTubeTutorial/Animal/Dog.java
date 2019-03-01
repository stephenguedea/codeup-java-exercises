package YouTubeTutorial.Animal;

// Since Dog extends Animal, it gets all of Animals fields and methods
// INHERITANCE
public class Dog extends Animal {
    public Dog(){

    }

    // overrides Animal methods
    public String makeSound(){
        return "Woof";
    }

    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());
        System.out.println(fido.makeSound());
    }
}
