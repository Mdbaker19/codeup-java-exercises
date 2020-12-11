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
            System.out.printf("0 - exit %n1 - view all movies %n" +
                    "2 - view movies in the animated category%n" +
                    "3 - view movies in the drama category%n" +
                    "4 - view movies in the horror category%n" +
                    "5 - view movies in the scifi category");

            int indexChoice = movieInput.getInt();
            String filter = genres[indexChoice];


            if (indexChoice == 0) {
                keepSearching = false;
            } else if(indexChoice == 1){
                for(int i = 0; i < allMovies.length; i++){
                    System.out.print(allMovies[i].getName() + " -- ");
                    System.out.println(allMovies[i].getCategory());
                }
                System.out.println("You are viewing movies in the : " + filter + " category");
                System.out.println(" ");
            }
            returnList(indexChoice, genres, allMovies);
        }while(keepSearching);

    }

    public static void returnList(int index, String[] genreList, Movie[] movieList){
        String genreChoice = genreList[index];
        for(int i = 0; i < movieList.length; i++){
            if(movieList[i].getCategory().equalsIgnoreCase(genreChoice)){
                System.out.print(movieList[i].getName() + " -- ");
                System.out.println(movieList[i].getCategory());
                System.out.println("You are viewing movies in the : " + genreChoice + " category");
                System.out.println(" ");
            }
        }
    }
}
