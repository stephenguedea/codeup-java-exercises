package YouTubeTutorial;

public class HelloWorld {
    // create a class variable
    static String randomString = "String to print";

    // crete a variable that remains the same
    static final double PINUM = 3.141529;
    // static = we want everyone to have access to this
    // final = constant
    // double = value with decimal places




    // define a function call main
    public static void main(String[] args) {
        // static = only a class can call for this function
        // to execute.
        // void = stating this function doesn't return any
        // values after it's done executing

//        System.out.println("Hello World");
//        System.out.println(randomString);
//        System.out.println(PINUM);
//
//        int integerOne = 22;
//        int integerTwo = integerOne + integerOne;
//        System.out.println(integerOne);
//        System.out.println(integerTwo);

        // PRIMITIVE TYPES
        byte bigByte = 127; // 127 biggest value a byte can hold
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 9220000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.1498908093457094;

        System.out.println(Float.MAX_VALUE); // 3.4028235E38
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308

        boolean trueOfFalse = true;

        System.out.println(trueOfFalse);

        char randomChar = 65;
        char anotherChar = 'A';

        char escapedChars = '\b';

        String randomString = "I'm a random string";
        String anotherString = "Stuff";
        String andAnotherString = randomString + " " + anotherString;

        // convert byte to a String
        String byteString = Byte.toString(bigByte);
//        System.out.println(byteString); // 127


        // convert one primitve type to another
        double aDoubleValue = 3.14546466464;
        int doubleToInt = (int)aDoubleValue; // (whatever you want to be converted into) andTheVariableYouWantToConvert
//        System.out.println(doubleToInt); // 3

        // how to turn a String into a primitive type
        String intString = Integer.toString(bigInt);

        int stringToInt = Integer.parseInt(intString);
        System.out.println(stringToInt); // 2100000000
    }
}
