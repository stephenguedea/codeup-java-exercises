package inheritancePolymorphismBonus;

public class AnimalTest {

    // main method
    public static void main(String[] args) {


        // new object instances
        Dog d = new Dog("Bulldog");
//        Dog d = new Dog("Boxer");
        Lizard l = new Lizard("Eastern Collared Lizard");
        Pug p = new Pug("Pug");

        // an array of Animal objects
        Animal[] animals = {d, l, p};

        //iterate over the array of strings
        for (Animal a : animals){
            System.out.println(a.breed);
            a.callForAnimal();

            System.out.println();

        }




    }
}
