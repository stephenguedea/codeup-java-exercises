package movies;

public class Movie {
    private String name;
    private String category;



    //    // constructor
    public Movie() {

    }

    // constructor
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static String allMovie() {
        Movie[] allMovies = MoviesArray.findAll();
        String allMovie = "";

        for (Movie m : allMovies) {
            allMovie += m.getName() + " - - - " + m.getCategory() +" \n";
        }
        return allMovie;

    }

    public static String animateMovie() {
        Movie[] animateMovies = MoviesArray.findAll();
        String animateMovie = "";
        for (Movie m : animateMovies) {
            if (m.getCategory() == "animated")
            animateMovie += m.getName() +" \n";
        }
        return animateMovie;

    }

    public static String dramaMovie() {
        Movie[] dramaMovies = MoviesArray.findAll();
        String dramaMovie = "";
        for (Movie m : dramaMovies) {
            if (m.getCategory() == "drama")
                dramaMovie += m.getName() +" \n";
        }
        return dramaMovie;

    }

    public static String horrorMovie() {
        Movie[] horrorMovies = MoviesArray.findAll();
        String horrorMovie = "";
        for (Movie m : horrorMovies) {
            if (m.getCategory() == "horror")
                horrorMovie += m.getName() +" \n";
        }
        return horrorMovie;

    }

    public static String scifiMovie() {
        Movie[] scifiMovies = MoviesArray.findAll();
        String scifiMovie = "";
        for (Movie m : scifiMovies) {
            if (m.getCategory() == "horror")
                scifiMovie += m.getName() +" \n";
        }
        return scifiMovie;

    }

    public static String comedyMovie(){
        Movie[] comedyMovies = MoviesArray.findAll();
        String comedyMovie = "";
        for (Movie m : comedyMovies) {
            if(m.getCategory() == "comedy")
                comedyMovie += m.getName() + " \n";
        }
        return comedyMovie;
    }

    public static String musicMovie(){
        Movie[] musicMovies = MoviesArray.findAll();
        String musicMovie = "";
        for (Movie m : musicMovies){
            if(m.getCategory() == "musical")
                musicMovie += m.getName() + " \n";
        }
        return musicMovie;
    }

//    public static Movie[] addMovie(Movie[] allMovies, Movie new){
//        Movie[] arrayCopy = Arrays.copyOf(movies, movies.length + 1);
////        System.out.println(arrayCopy[arrayCopy.length - 1]);
////        System.out.println(arrayCopy);
//        arrayCopy[arrayCopy.length - 1] = movie;
////                    System.out.println(person.getName());
//
//        return arrayCopy;
//    }



}
