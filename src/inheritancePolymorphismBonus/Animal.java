package inheritancePolymorphismBonus;

public class Animal {

    protected String breed;


    // constructor
    public Animal(String breed){

        this.breed = breed;
    }

    //method
    public void callForAnimal(){
        System.out.println("Where is this animal?");
    }

    public void run(String action){
        System.out.println(action);
    }
}
