package day31.movieTask;

public class MovieObjects {

    public static void main(String[] args) {

        String genre = "Adventure,Comedy,Thriller";
        String title = "Journey to SDET: Cyde Batch 25 ";

        String[] casts = {"Asiya", "Adam", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};



        Movie movie1=new Movie("USA",title,genre,"10.25.2021","Kuzzat Altay");

        movie1.addCasts(casts);

        System.out.println(movie1);

    }
}
