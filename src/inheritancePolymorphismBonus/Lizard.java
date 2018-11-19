package inheritancePolymorphismBonus;

public class Lizard extends Animal {

    public Lizard(String breed){
        super(breed);
    }


    //method overriding
    public void callForAnimal(){
        System.out.println("--- no sound ---");
    }

}
