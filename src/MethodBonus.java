public class MethodBonus {
    public static void main(String[] args) {
        caseLetterCount("How are you going to tell me that Avenged Sevenfold is a better rock band " +
                "than Metallica? That's like saying Britney Spears is a better singer than Christina Aguilera!");

    }
//
//    public static void vowelCount (String string) {
//        int vowels = 0;
//        for (int i = 0; i < string.length(); i++) {
//            char vowel = vowels.charAt(i);
//            if()
//        }
//    }


    public static void caseLetterCount (String string) {
        int uppercase = 0;
        int lowercase = 0;
        for (int i = 0; i < string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))) {
                uppercase++;

            } else {
                lowercase++;
            }
        }
        System.out.println(uppercase + " uppercase letters\n");
        System.out.println(lowercase + " lowercase letters\n");
    }



}
