package model;

import java.util.Scanner;

public class MovieController {
    private MovieManager manager;

    public MovieController() {
        manager = new MovieManager();
    }

    public void start() {
        displayMenu();
    }

    private void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Movie Store ---");
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Clear Movies");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    setMovieDetails(scanner);
                    break;
                case 2:
                    for (Movie movie : manager.getMovies()) {
                        System.out.println(movie);
                    }
                    break;
                case 3:
                    manager.clearMovies();
                    System.out.println("All movies cleared.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void setMovieDetails(Scanner scanner) {
        int id = manager.getMovieId();
        System.out.print("Enter movie name: ");
        String name = scanner.nextLine();
        System.out.print("Enter release year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();

        Movie movie = new Movie(id, name, year, genre);
        manager.addMovie(movie);
        System.out.println("Movie added successfully.");
    }
}
