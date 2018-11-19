public class ServerNameGenerator {
//    Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
    public static String[] adjectives = {"happy", "sad", "mad", "glad", "calm", "gentle", "brave", "faithful", "eager", "negative"};
    public static String[] nouns = {"man", "woman", "Texas", "dog", "cat", "bird", "boy", "girl", "child", "adult"};





//    Create a method that will return a random element from an array of strings
    public static String randomString(String[] strings){
        return strings[getRandomElement(0, strings.length - 1)];
    }

    public static int getRandomElement(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }




//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate
// the combination and display the generated name to the user.
//    Here is your server name:
// dedicated-photon
public static void main(String[] args) {
    System.out.println("Here is your server name: \n" + randomString(adjectives) + " - " + randomString(nouns));
}



}
