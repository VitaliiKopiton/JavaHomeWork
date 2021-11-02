package com.pb.kopiton.hw5;

public class Library {
    public static void main(String[] args) {


        Reader reader = new Reader();
        reader.setName("Иванов Иван Иванович");
        reader.setDob("01.01.1970");
        reader.setLibraryCard(0);
        reader.setPhone(100);

        Reader reader1 = new Reader();
        reader1.setName("Иванов Иван Иванович");
        reader1.setDob("01.01.1980");
        reader1.setLibraryCard(1);
        reader1.setPhone(101);

        Reader reader2 = new Reader();
        reader2.setName("Шевченко Тарас Григорьевич");
        reader2.setDob("09.03.1814");
        reader2.setLibraryCard(2);
        reader2.setPhone(102);

        Reader reader3 = new Reader();
        reader3.setName("Косач Лариса Петровна");
        reader3.setDob("25.02.1871");
        reader3.setLibraryCard(2);
        reader3.setPhone(103);



        Book book1 = new Book("Java", "Кей Хорстманн", 2014);
//        book1.nameBook = "Java";
//        book1.autherBook = "Кей Хорстманн";
//        book1.yearBook = 2014;

        Book book2 = new Book("Руководство астронавта по жизни на Земле", "Кристофер Хэдфилд", 2015);
//        book2.nameBook = "Руководство астронавта по жизни на Земле";
//        book2.autherBook = "Кристофер Хэдфилд";
//        book2.yearBook = 2015;
//
        Book book3 = new Book("Богатый Папа, Бедный Папа", "Роберт Кійосакі і Шерон Лехтер", 1997);
//        book3.nameBook = "Богатый Папа, Бедный Папа";
//        book3.autherBook = "Роберт Кійосакі і Шерон Лехтер";
//        book3.yearBook = 1997;

        int borrowedBooks = 5;





        System.out.println(reader);

        System.out.println(reader.takeBook(borrowedBooks));
        System.out.println(reader.takeBook(reader.getName(), borrowedBooks, book1.getNameBook()));
        System.out.println(reader.takeBook(reader.getName(), borrowedBooks, book1.getNameBook(), book1.getAutherBook(), book1.getYearBook()));

        System.out.println(reader.returnBook(borrowedBooks));
        System.out.println(reader.returnBook(reader.getName(), borrowedBooks, book1.getNameBook()));
        System.out.println(reader.returnBook(reader.getName(), borrowedBooks, book1.getNameBook(), book1.getAutherBook(), book1.getYearBook()));

//        System.out.println(book1.getNameBook() + " " + book2.getNameBook());
        System.out.println( book1.Books() + " " + book2.Books() + " " + book3.Books());
        System.out.println(reader1.getName() + " " + reader2.getName() + " " + reader3.getName() + " " + reader.getName());






    }

}
