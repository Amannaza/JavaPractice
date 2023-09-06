package day31.movieTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country,title,genre,directory,releaseDate;
    public ArrayList<String>casts=new ArrayList<>();

    public Movie(String country, String title, String genre, String releaseDate, String directory) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.directory = directory;
       // casts=new ArrayList<>();
    }


    public void addcast(String newCast){
        casts.add(newCast);
    }

    public void addCasts(String[]names){
        casts.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts='" + casts.size() +
                '}';
    }
}
/*
3. Movie Task:

        3.1. Create a class named Movie
        Attributes:
        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
        addCast(String): adds the given string argument to the arrayList casts
        addCasts(String[]): adds the given string array argument to the arrayList casts
        toString(): returns the name of country, title, release date, and total number of casts*/
