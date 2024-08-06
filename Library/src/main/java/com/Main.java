package com;

public class Main {

    public static void main(String[] args) {
        Author author1= new Author();
        author1.setId(1);
        author1.setName("Ibrahim");
        author1.setEmail("ibrahim@gmail.com");
        author1.setPhone("123-4528-563");

        Author author2= new Author(2,"Emad","526-4857-364","emad@gmail.com");

        Book book1= new Book(1,"OOP","25-5-2020",2,author1);
        Book book2= new Book(2,"DSA","14-8-2015",2,author1);
        Book book3= new Book(3,"Database","20-6-2019",3,author2);
        Book book4= new Book(10,"Advanced Database","20-6-2021",4,author2);


        Library library= new Library();


        library.addAuthor(author1);
        library.addAuthor(author2);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        //print author
//        System.out.println("\n=======Author========\n");
        library.printAllAuthor();
        library.removeAuthor(author2.getName());
        System.out.println("\n================\n");
        library.printAllAuthor();
//
//
//
//        //Books
        System.out.println("\n========Books========\n");
//            library.printAllBooks();
//        System.out.println("\n================\n");
//
//        library.printAllAuthorBooks("Emad");
//        System.out.println("\n================\n");
        library.printBookByID(10);

        library.removeBook(book4.getTittle());

//        System.out.println("========");
        System.out.println("\n================\n");
        library.printAllBooks();

    }

}
