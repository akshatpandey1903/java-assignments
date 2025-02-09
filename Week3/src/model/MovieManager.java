package model;

import java.io.*;
import java.util.*;

public class MovieManager {
    private List<Movie> movies;
    private static final String filePath = "D:\\vscode\\javaAssignments\\Week3\\src\\model\\MovieData.bin";

    public MovieManager() {
        movies = new ArrayList<>();
        loadMovies();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        saveMovies();
    }

    public void clearMovies() {
        movies.clear();
        saveMovies();
    }

    public List<Movie> getMovies() {
        return new ArrayList<>(movies);
    }

    public int getMovieId() {
        return movies.isEmpty() ? 1 : movies.get(movies.size() - 1).getId() + 1;
    }

    public void loadMovies() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            movies = (List<Movie>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            movies = new ArrayList<>();
        }
    }

    public void saveMovies() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(movies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteAllMovies() {
        movies.clear();
        saveMovies();
    }
}

