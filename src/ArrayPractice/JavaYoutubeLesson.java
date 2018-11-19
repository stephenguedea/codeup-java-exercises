package ArrayPractice;

public class JavaYoutubeLesson {

    public static void main(String[] args) {
        // declare an array
        String[] verbs = {"go", "run", "play", "work"};
        printArray(verbs);

        //declare an array
        short[] numbers = {7, 3, 9, 1, 5};
        long product = arrayProduct(numbers);
        System.out.printf("Product: %d", product);
    }
    private static long arrayProduct( short[] numbers) {
        long product = 1;
        for (short n : numbers) {
            product *= n; // product = product * n;
        }
        return product;
    }

        // print
    private static void printArray(String[] words){
        for(String w : words) {
            System.out.printf("%s ", w);
        }

        System.out.println();

    }


}