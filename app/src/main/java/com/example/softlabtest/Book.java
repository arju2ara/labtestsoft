package com.example.softlabtest;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int units;

    public Book(String title, String author, String genre, int units) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.units = units;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}
