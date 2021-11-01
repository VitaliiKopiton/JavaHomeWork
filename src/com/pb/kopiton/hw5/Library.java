package com.pb.kopiton.hw5;

public class Library {
    public static void main(String[] args) {

        Reader reader1 = new Reader();
        reader1.name = "Иванов Иван Иванович";
        reader1.dob = "01.01.1980";
        reader1.libraryCard = 1;
        reader1.phone = 101;

        Reader reader2 = new Reader();
        reader2.name = "Шевченко Тарас Григорьевич";
        reader2.dob = "09.03.1814";
        reader2.libraryCard = 2;
        reader2.phone = 102;

        Reader reader3 = new Reader();
        reader3.name = "Косач Лариса Петровна";
        reader3.dob = "25.02.1871";
        reader3.libraryCard = 2;
        reader3.phone = 102;



        Book book1 = new Book();
        book1.nameBook = "Java";
        book1.autherBook = "Кей Хорстманн";
        book1.yearBook = 2014;

        Book book2 = new Book();
        book2.nameBook = "Руководство астронавта по жизни на Земле";
        book2.autherBook = "Кристофер Хэдфилд";
        book2.yearBook = 2015;

        Book book3 = new Book();
        book3.nameBook = "Богатый Папа, Бедный Папа";
        book3.autherBook = "Роберт Кійосакі і Шерон Лехтер";
        book3.yearBook = 1997;




        System.out.println(reader1);



    }

}
