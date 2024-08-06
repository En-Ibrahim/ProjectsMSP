package com;

public class Book {

    private int id;
    private String tittle;
    private String date;
    private int version;

    private Author author;

    public Book() {
    }

    public Book(int id, String tittle, String date, int version, Author author) {
        this.id = id;
        this.tittle = tittle;
        this.date = date;
        this.version = version;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", date='" + date + '\'' +
                ", version=" + version +
                ", author=" + author.getName() +
                '}';
    }
}
