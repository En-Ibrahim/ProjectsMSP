package com;

import java.util.ArrayList;
import java.util.List;

public class Library {


    private List<Author> authors;
    private List<Book> books;

    public Library() {
        authors= new ArrayList<>();
        books= new ArrayList<>();
    }

    //add
    //remove
    //print

    public void addAuthor(Author author){
        authors.add(author);
    }


    public void removeAuthor(String author){

        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getName().equals(author))
                authors.remove(authors.get(i));
        }
    }

    public void printAuthorBYName(String name){
        for (Author a:authors) {
            if (name.equals(a.getName()))
                System.out.println(a);
        }
    }

    public void printAuthorByID(int id){
        for (Author a:authors) {
            if (id==a.getId())
                System.out.println(a);
        }
    }

    public void printAllAuthor(){
        for (Author a:authors) {
            System.out.println(a);
        }
    }


    //Book operation
    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(String tittle){

        for (int i = 0; i <books.size() ; i++) {
            if (books.get(i).getTittle().equals(tittle))
                books.remove(books.get(i));
        }



    }

    public void printBookByID(int id){
        for (Book book : books) {
            if (id==book.getId())
                System.out.println(book.toString());;
        }
    }


    public void printAllAuthorBooks(String  authorName){
        for (Book book: books) {
            if (authorName==book.getAuthor().getName())
                System.out.println(book);
        }
    }

    public void printAllBooks(){
        for (Book b:books) {
            System.out.println(b);
        }
    }




}
