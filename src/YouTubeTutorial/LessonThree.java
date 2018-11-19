package YouTubeTutorial;

public class LessonThree {
    public static void main(String[] args) {

        int randomNumber = (int)(Math.random() * 50);

        System.out.println(randomNumber);

        if (randomNumber < 25) {
            System.out.println("Random number is less than 25");
        } else if (randomNumber > 50) {
            System.out.println(randomNumber + " is greater than 50");
        }
    }
}
