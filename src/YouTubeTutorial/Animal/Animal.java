package YouTubeTutorial.Animal;

// You can import libraries with helpful methods using import

import java.util.Scanner;
import java.util.*;

// A class defines the attributes (fields) and capabilities (methods) of a real world object

public class Animal {
    static Scanner scanner = new Scanner(System.in);


    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;

//  Static variables have the same value for every object
//  Any variable or function that doesn't make sense for an object to have, should be made static
//  Protected means that this value can only be accessed by other code in the same package or subclasses in other packages

    protected static int numberOfAnimals = 0;

    //  A Scanner object allows you to except user input from the keyboard
    static Scanner userInput = new Scanner(System.in);

    //    Any time an Animal object is created this function, the constructor, is called to initialize the object
    public Animal(){
//        Shorthand for numberOfAnimals = numberOfAnimals + 1;
        numberOfAnimals++;

        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " + sumOfNumbers);

        int diffOfNumbers = 5 - 1;
        System.out.println("5 - 1 = " + diffOfNumbers);

        int multOfNumbers = 5 * 1;
        System.out.println("5 x 1 = " + multOfNumbers);

        int divOfNumbers = 6 / 2;
        System.out.println("6 / 2 = " + divOfNumbers);

        int modOfNumbers = 5 % 3;
        System.out.println("5 % 3 = " + modOfNumbers);


        // ENTERING THE DATA
        // print is used to print to the screen, but it doesn't end with a newline
        System.out.print("Enter the name: ");

        if(scanner.hasNextLine()){
            this.setName(scanner.nextLine());
        }

        this.setFavoriteChar();
        this.setUniqueID();
    }

    // It is good to use getter and setter methods so that you can protect your data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUniqueID() {
        return uniqueID;
    }


    // Method overloading allows you to accept different input with the same method name
    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }

    public void setUniqueID() {
        long minNum = 1;
        long maxNum = 1000000;


        // Generates a random number between 1 and 1000000
        this.uniqueID = minNum = (long)(Math.random() * ((maxNum - minNum) +1));


        // You can case from one primitive value into another by putting what you want
        // between ()

        // You convert from a primitive to a string like this
        String stringNumber = Long.toString(maxNum);

        // You convert from a String to a primitive like this
        int numberString = Integer.parseInt(stringNumber);
        System.out.println("Unique ID: " + this.uniqueID);

    }

    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }

    public void setFavoriteChar() {
        int randomNumber = (int)(Math.random() * 126) + 1;
        this.favoriteChar = (char)randomNumber;
        // CONVERT TO A CHAR
        if(randomNumber == 32) {
            System.out.println("Favorite character: Space"); // 32 = "space"
        } else if (randomNumber == 10) {
            System.out.println("Favorite character: NewLine"); // 10 = \n
        } else {
            System.out.println("Favorite character: " + this.favoriteChar);
        }
        if (randomNumber > 97 && randomNumber < 122 ){
            System.out.println("Favorite character: lowercase letter");
        }
        if ((randomNumber > 97 && randomNumber < 122) || (randomNumber > 64 && randomNumber < 91)){
            System.out.println("Favorite character: letter");
        }
        if (!false){
            System.out.println("I turned false to " + !false);
        }

        // The ternary operator assigns one or another value based on a condition
        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
        System.out.println("The biggest number is " + whichIsBigger);

//        The switch statement is great for when you have a limited number of values

        switch (randomNumber){
            case 8:
                System.out.println("Favorite character: Backspace");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Favorite character: Backspace");
                break;
            default:
                System.out.println("Favorite character set to: " + this.favoriteChar);
                break;
        }
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    protected static int getNumberOfAnimals(){
        return numberOfAnimals;
    }

    // Since numberOfAnimals is Static you must set the value using the class name

    public void setNumberOfAnimals(int numberOfAnimals) {
        Animal.numberOfAnimals = numberOfAnimals;
    }

    protected static void countTo(int startingNumber) {
        for (int i = startingNumber; i <= 100; i++){

            // continue is used to skip 1 iteration of the loop
            if (i == 90) continue;
            System.out.println(i);
        }
    }

    protected static String printNumbers(int maxNumbers){

        int i = 1;
        while (i < (maxNumbers / 2)) {
            System.out.println(i);
            i++;

            // This isn't needed, but if you want to jump out of a loop, use break
            if (i == (maxNumbers / 2)) break;
        }

        Animal.countTo(maxNumbers/2);
        // you can return a value like this
        return "End of printNumbers()";
    }

    protected static void guessMyNumber() {
        int number;

        // Do while loops are used when you want to execute the code in the braces at least once
        do {
            System.out.println("Guess my number up to 100");

            // If what they entered isn't a number send a warning
            while (!userInput.hasNextInt()) {
                String numberEntered = userInput.next();
                System.out.printf("%s is not a number\n", numberEntered);
            }
            number = userInput.nextInt();
        } while (number != 50);
        System.out.println("Yes the number was 50");
    }

    // This will be used to demonstrate polymorphism
    public String makeSound(){
        return "Grrr!";
    }

    // With polymorphism we can refer to any Animal and yet use overridden methods
    //  in the specific animal type
    public static void speakAnimal(Animal randAnimal){
        System.out.println("Animal says " + randAnimal.makeSound());
    }

    // public allows other classes to use this method
    // static means that only a class can call for this execute
    // void means it doesn't return a value when it finishes executing
    // This method can except Strings that can be stored in the String array args when it is executed


        public static void main(String[] args) {
        Animal theDog = new Animal();
            System.out.println("The animal is named" + theDog.getName());
            System.out.println(Animal.printNumbers(100));
            Animal.countTo(100);
            Animal.guessMyNumber();

            // An array is fixed series of boxes that contain multiple values of the same data type
            // How you create arrays
            // int[] favoriteNumbers;
            // favoriteNumbers = new int[29];

            int[] favoriteNumbers = new int[20];
            favoriteNumbers[0] = 100;
            String[] favoriteComics = {"Batman", "Deadpool", "Wolverine"};

            // for (dataTye[] varForRow : arrayName)
            for (String word : favoriteComics)
            {
                System.out.println(word);
            }

            // This is a multidimensional array
            String[][][] favoriteMovies = {{{"The Dark Knight"}, {"Deadpool 2"}, {"Logan"}},
                    {{"Galaxy Quest"}, {"Jurassic Park"}, {"Star Wars"}, {"Ready Player One"}},
                    {{"Titanic"}, {"Alita"}, {"A Knight's Tale"}, {"Toy Story"}} };

            for(int i =0; i < favoriteMovies.length; i++){
                for (int j = 0; j < favoriteMovies[i].length; j++) {
                    for (int k = 0; k < favoriteMovies[i][j].length; k++){
                        System.out.print("| " + favoriteMovies[i][j][k] + " ");
                    }
                }
                System.out.println("|");
            }

            // You can copy an array (stringToCopy, indexes to copy)
            String[] cloneOfArray = Arrays.copyOf(favoriteComics, 3);

            // you can print out the whole array
            System.out.println(Arrays.toString(cloneOfArray));

            // returns the index or a negative number
            System.out.println(Arrays.binarySearch(cloneOfArray, "Deadpool"));
            System.out.println(Arrays.toString(favoriteComics));

    }
}
