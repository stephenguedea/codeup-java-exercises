package inheritancePolymorphismBonus;

public class Pug extends Dog {

    public Pug(String breed){
        super(breed);
    }

    //method overriding
    public void callForAnimal(){
        System.out.println("Woof WOOOFFFF!!! WOOF!");
    }
}
