package com.pb.kopiton.hw5;

public class Library {
    public static void main(String[] args) {


        Reader reader0 = new Reader();
        reader0.setName("Иванов Иван Иванович");
        reader0.setDob("01.01.1970");
        reader0.setLibraryCard(0);
        reader0.setPhone(100);

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
        Book book2 = new Book("Руководство астронавта по жизни на Земле", "Кристофер Хэдфилд", 2015);
        Book book3 = new Book("Богатый Папа, Бедный Папа", "Роберт Кійосакі і Шерон Лехтер", 1997);


        int bookCount = 0;


        int borrowedBooks = 5;


        reader0.takeBook(0);
        reader0.takeBook(book1.getNameBook(), "и", book2.getNameBook());
        reader0.takeBook(book1.allBooks(), book2.allBooks(), book3.allBooks());

        reader0.returnBook(0);
        reader0.returnBook(book1.getNameBook(), "и", book2.getNameBook());
        reader0.returnBook(book1.allBooks(), book2.allBooks(), book3.allBooks());

        




        // reader0.takeBook(book1.allBoooksObj(), book2.allBoooksObj());
       // reader0.takeBook(book1);
        //reader0.NameArray(book1);





        //book1.allBoooksObj();
        //System.out.println( book1.allBoooksObj());


//        System.out.println(reader0.returnBook(borrowedBooks));
//        System.out.println(reader0.returnBook(reader0.getName(), book1.getNameBook()));
//        System.out.println(reader0.returnBook(reader0.getName(), book1.getNameBook(), book1.getAutherBook(), book1.getYearBook()));
//
////        System.out.println(book1.getNameBook() + " " + book2.getNameBook());
//        System.out.println( book1.Books() + " " + book2.Books() + " " + book3.Books());
//        System.out.println(reader1.getName() + " " + reader2.getName() + " " + reader3.getName() + " " + reader0.getName());
//
//        //System.out.println("ти книга" + book1.allBooks());







//
//        System.out.println(reader);
//
//        System.out.println(reader.takeBook(borrowedBooks));
//        System.out.println(reader.takeBook(reader.getName(), book1.getNameBook(), book2.getNameBook()));
//        System.out.println(reader.takeBook(reader.getName(), book1.getNameBook(), book1.getAutherBook(), book1.getYearBook()));
//
//        System.out.println(reader.returnBook(borrowedBooks));
//        System.out.println(reader.returnBook(reader.getName(), book1.getNameBook()));
//        System.out.println(reader.returnBook(reader.getName(), book1.getNameBook(), book1.getAutherBook(), book1.getYearBook()));
//
////        System.out.println(book1.getNameBook() + " " + book2.getNameBook());
//        System.out.println( book1.Books() + " " + book2.Books() + " " + book3.Books());
//        System.out.println(reader1.getName() + " " + reader2.getName() + " " + reader3.getName() + " " + reader.getName());
//
//








    }

}
