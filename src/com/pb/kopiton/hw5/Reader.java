package com.pb.kopiton.hw5;

import java.util.Arrays;

class Reader {

     // public static int borrowedBooks = 0;

     private String name;
     private int libraryCard;
     private String faculty;
     private String dob;
     private int phone;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getLibraryCard() {
         return libraryCard;
     }

     public void setLibraryCard(int libraryCard) {
         this.libraryCard = libraryCard;
     }

     public String getFaculty() {
         return faculty;
     }

     public void setFaculty(String faculty) {
         this.faculty = faculty;
     }

     public String getDob() {
         return dob;
     }

     public void setDob(String dob) {
         this.dob = dob;
     }

     public int getPhone() {
         return phone;
     }

     public void setPhone(int phone) {
         this.phone = phone;
     }



     public void takeBook(int bookCount) {
         bookCount ++;
         System.out.println(name+ " взял " + bookCount +" книг");
    }


    public void takeBook (String... nameBook) {
        String readBooks = new String();
         for (int i=0; i< nameBook.length; i++) {
             if (nameBook[i] != null ) {
                 readBooks += nameBook[i] + " ";
             }
         } System.out.println( name + " взял книги: " + readBooks + "." );
    }



    public void takeBook(Book... book) {
        String readBooks = new String();
        for (int i=0; i< book.length; i++) {
            if (book[i] != null ) {
                readBooks += book[i] + " ";
            }
        } System.out.println( name + " взял книги: " + readBooks + "." );

    }



    public void returnBook(int bookCount) {
        bookCount ++;
        System.out.println(name+ " вернул " + bookCount +" книг");
    }


    public void returnBook (String... nameBook) {
        String readBooks = new String();
        for (int i=0; i< nameBook.length; i++) {
            if (nameBook[i] != null ) {
                readBooks += nameBook[i] + " ";
            }
        } System.out.println( name + " вернул: " + readBooks + "." );
    }



    public void returnBook(Book... book) {
        String readBooks = new String();
        for (int i=0; i< book.length; i++) {
            if (book[i] != null ) {
                readBooks += book[i] + " ";
            }
        } System.out.println( name + " вернул: " + readBooks + "." );

    }




//    public void takeBook(Book... book) {
//         String arrayBooks = new String();
//       //  arrayBooks = book[1];
//
//         //System.out.println(NameArray());
//         System.out.println(book.toString());
//         System.out.println(Arrays.toString(book));
//         System.out.println(Arrays.deepToString(book));
//         Arrays.asList(book).stream().forEach(s -> System.out.println(s));
//     }

    public class NameArray {

        private String nameArray;

        @Override
        public String toString() {
            return nameArray;
        }
    }



//
//     String takeBook(String name, String nameBook, String auther, int year) {
//         return name + " взял книги: " + nameBook + " (" + auther + ", " +  year +")";
//     }


//    String takeBook (String... nameBook) {
//         String allBooks = new String();
//         for (int i=0; i < nameBook.length; i++) {
//             if (nameBook[i] != null) {
//                 allBooks += nameBook[i] ;
//             }
//         }
//         return  allBooks ;
//     }




//     String returnBook (int borrowedBooks) {
//         return name + " вернул " + borrowedBooks + " книги";
//     }
//
//     String returnBook (String name, String nameBook) {
//         return name + " вернул: " + nameBook ;
//     }
//
//     String returnBook (String name, String nameBook, String auther, int year) {
//         return name + " вернул книги: " + nameBook + " (" + auther + ", " +  year +")";
//     }





}
