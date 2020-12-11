package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {

        Input movieInput = new Input();

        boolean keepSearching = true;
        String[] genres = {
            "", "all", "animated", "drama", "horror", "scifi"
        };

        Movie[] allMovies = MoviesArray.findAll();

        do{
            System.out.printf("0 - exit %n" +
                    "1 - view all movies %n" +
                    "2 - view movies in the animated category%n" +
                    "3 - view movies in the drama category%n" +
                    "4 - view movies in the horror category%n" +
                    "5 - view movies in the scifi category%n" +
                    "6 -- add a new movie%n");

            int indexChoice = movieInput.getInt();

            if (indexChoice == 0) {
                keepSearching = false;
            } else if(indexChoice == 1){
                for(int i = 0; i < allMovies.length; i++){
                    System.out.print(allMovies[i].getName() + " -- ");
                    System.out.println(allMovies[i].getCategory());
                }
                System.out.println("You are viewing all movies");
                System.out.println(" ");
            } else if(indexChoice == 6){
                System.out.println("Enter The Movie Title");
                String addMovieTitle = movieInput.getString();
                System.out.println("Enter The Movie Genre");
                String addMovieCategory = movieInput.getString();
                Movie addedMovie = new Movie(addMovieTitle, addMovieCategory);
                Movie[] movieArrWithAddedMovie = Arrays.copyOf(allMovies, allMovies.length + 1);
                Arrays.fill(movieArrWithAddedMovie, movieArrWithAddedMovie.length - 1, movieArrWithAddedMovie.length, addedMovie);
                System.out.println(" ");
            } else if(indexChoice > 1 && indexChoice < 6) {
                returnList(indexChoice, genres, allMovies);
            }
        }while(keepSearching);
    }

    public static void returnList(int index, String[] genreList, Movie[] movieList){
        String genreChoice = genreList[index];
        for(int i = 0; i < movieList.length; i++){
            if(movieList[i].getCategory().equalsIgnoreCase(genreChoice)){
                System.out.print(movieList[i].getName() + " -- ");
                System.out.println(movieList[i].getCategory());
            }
        }
        System.out.println("You are viewing movies in the : " + genreChoice + " category");
        System.out.println(" ");
    }
}
