package ru.netology.javaqa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class posterManagerTest {

    @Test
    public void OutputAllMoviesTest() {
        posterManager manager = new posterManager();
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");


        String[] expected = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ConclusionOfFiveFilmsFromTheEnd() {
        posterManager manager = new posterManager();
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");

        String[] expected = {"movie7", "movie6", "movie5", "movie4", "movie3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ConclusionOfThreeFilmsFromTheEnd() {
        posterManager manager = new posterManager(3);
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");

        String[] expected = {"movie7", "movie6", "movie5"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void OutputMoviesFromTheEndOfAnArrayLessThanFive() {
        posterManager manager = new posterManager();
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");


        String[] expected = {"movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void OutputMoviesFromTheEndOfTheArrayBackToTheLimitGreaterThanTheArray() {
        posterManager manager = new posterManager(100);
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");

        String[] expected = {"movie7", "movie6", "movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

