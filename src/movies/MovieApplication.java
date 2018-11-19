package movies;

import util.Input;

import java.util.Scanner;

public class MovieApplication {
    public static void main(String[] args) {

        System.out.println("Welcome to Blockbuster!");
       do {
           System.out.println("\nWhat would you like to do?\n" +
                   "0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama " +
                   "category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n" +
                   "6 - view movies in the comedy category\n7 - view movies in the musical category\n");
           Scanner scanner = new Scanner(System.in);
           Input userInput = new Input(scanner); // Loading song onto Deck
           int userInputValue = userInput.getInt(0, 7);
//        System.out.println("You entered " + userInputValue );

           // if else statements for the userInput
           // start by just printing the number the user picked
           // loop the display of the menu and asking the user to pick a number until they choose 0
           // get choice 1 functional (showing all the movies)

           //           for (Person p : people) {
//               System.out.println(p.getName());
//           }

//           Movie[] allMovies = MoviesArray.findAll();
//           for (Movie m : allMovies) {
//               System.out.println(m.getName() + " " + m.getCategory());
//           }

//           Movie[] animateMovie = MoviesArray.findAll();
//           for (Movie m : animateMovie) {
//               if (m.getCategory() == "animate")
//               System.out.println(m.getName());
//           }

//           Movie[] dramaMovie = MoviesArray.findAll();
//           for (Movie m : dramaMovie) {
//               if (m.getCategory() == "drama")
//                   System.out.println(m.getName());
//           }

//           Movie[] horrorMovie = MoviesArray.findAll();
//           for (Movie m : horrorMovie){
//               if (m.getCategory() == "horror")
//                   System.out.println(m.getName());
//           }

//           Movie[] scifiMovie = MoviesArray.findAll();
//           for (Movie m : scifiMovie){
//               if (m.getCategory() == "scifi")
//                   System.out.println(m.getName());
//           }
           if (userInputValue == 1) {
               System.out.println("You entered " + userInputValue + "\nAll movies\n===============\n");

               System.out.println(Movie.allMovie());
//               for (Movie m : allMovies) {
//                   System.out.println(m.getName() + " " + m.getCategory());
//               }

           } else if (userInputValue == 2) {
               System.out.println("You entered " + userInputValue + "\nAnimated movies\n===============\n");
               System.out.println(Movie.animateMovie());
//               for (Movie m : animateMovie) {
//                   if (m.getCategory() == "animated")
//                       System.out.println(m.getName());
//               }
           } else if (userInputValue == 3) {
               System.out.println("You entered " + userInputValue + "\nDrama movies\n===============\n");
               System.out.println(Movie.dramaMovie());
//               for (Movie m : dramaMovie) {
//                   if (m.getCategory() == "drama")
//                       System.out.println(m.getName());
//               }
           } else if (userInputValue == 4) {
               System.out.println("You entered " + userInputValue + "\nHorror movies\n===============\n");
               System.out.println(Movie.horrorMovie());
//               for (Movie m : horrorMovie){
//                   if (m.getCategory() == "horror")
//                       System.out.println(m.getName());
//               }
           } else if (userInputValue == 5) {
               System.out.println("You entered " + userInputValue + "\nSci-fi movies\n===============\n");
               System.out.println(Movie.scifiMovie());
//               for (Movie m : scifiMovie){
//                   if (m.getCategory() == "scifi")
//                       System.out.println(m.getName());
//               }
           } else if (userInputValue == 6) {
               System.out.println("You entered " + userInputValue + "\nComedy movies\n===============\n");
               System.out.println(Movie.comedyMovie());

           } else if (userInputValue == 7) {
               System.out.println("You entered " + userInputValue + "\nMusical movies\n===============\n");
               System.out.println(Movie.musicMovie());

           }
           else if (userInputValue == 0) {
               System.out.println("You entered " + userInputValue + "\nGood-bye!");
               break;


           }
       } while (true);

    }
}

