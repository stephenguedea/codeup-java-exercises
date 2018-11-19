package inheritancePolymorphismBonus;

public class Dog extends Animal {

    public Dog(String breed){

        super(breed);
    }


    //method overriding
    public void callForAnimal(){
        System.out.println("Bark BARK!!!");
    }
}
