package com.example.softlabtest;
import java.util.ArrayList;
import java.util.List;

public class Genre {
    List<Book> mystery = new ArrayList<>();
    List<Book> fantasy = new ArrayList<>();
    List<Book> thriller = new ArrayList<>();

    public void addBookToGenre(Book book) {
        switch (book.getGenre()) {
            case "mystery":
                mystery.add(book);
                break;
            case "fantasy":
                fantasy.add(book);
                break;
            case "thriller":
                thriller.add(book);
                break;
        }
    }

    public void showBookInfoByGenre(String genre) {
        List<Book> books = null;
        switch (genre.toLowerCase()) {
            case "mystery":
                books = mystery;
                break;
            case "fantasy":
                books = fantasy;
                break;
            case "thriller":
                books = thriller;
                break;
        }
        if (books != null) {
            for (Book book : books) {
                System.out.println(book.getTitle() + ", " + book.getAuthor() + ", Units: " + book.getUnits());
            }
        }
    }
}
