package day31.restaurantTask;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server[] servers = {

                new Server("Deniz", 123245, 7.5, true),
                new Server("Arif", 345632, 2.3, false),
                new Server("Semra", 321232, 2.9, true),
                new Server("Isil", 984321, 2.2, true),
        };

        Chef[] chefs = {
                new Chef("Mehmet", 124176, 3, true),
                new Chef("Hamidiye", 521254, 1.6, true),
                new Chef("Gul", 836534, 2, false),
        };

        Restaurant myRestaurant = new Restaurant("Aman", "Muragap", 5);

        myRestaurant.hireChef(chefs);
        myRestaurant.hireServers(servers);

        System.out.println(myRestaurant);

    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
        - Make a Restaurant object
        - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
        - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

        - Print your whole restaurants information */
