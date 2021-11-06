package com.pb.kopiton.hw5;

/**
 *  Класс описывающий книгу
 */


 public class Book {

     public static int borrowedBooks = 0;
     public static int bookCount = 0;

     private String nameBook;
     private String autherBook;
     private int yearBook;

    //private  String [] allBook;


     public Book (String nameBook, String autherBook, int yearBook) {    // Конструктор
         this.nameBook = nameBook;
         this.autherBook = autherBook;
         this.yearBook = yearBook;
     }

    public static int getBorrowedBooks() {
        return borrowedBooks;
    }

    public static void setBorrowedBooks(int borrowedBooks) {
        Book.borrowedBooks = borrowedBooks;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public static void setBookCount(int bookCount) {
        Book.bookCount = bookCount;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAutherBook() {
        return autherBook;
    }

    public void setAutherBook(String autherBook) {
        this.autherBook = autherBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

         public String allBooks () {
             return nameBook + " (" + autherBook + " " + yearBook + "г.)" ;
     }

     public  String [] allBoooksObj () {
         String [] allBook = new String [3]; // [nameBook, autherBook, yearBook];
         allBook[0] = nameBook;
         allBook[1] = autherBook;
         allBook[2] = Integer.toString(yearBook);
         return allBook;
     }

 }
