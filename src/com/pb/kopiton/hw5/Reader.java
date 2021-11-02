package com.pb.kopiton.hw5;

 class Reader {
    private String name;
    private int libraryCard;
    private String faculty;
    private String dob;
    private int phone;


//    public Reader () {
//
//    }



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




     String takeBook(int borrowedBooks) {
        return name + " взял " + borrowedBooks + " книги";
    }


    String takeBook(String name, int borrowedBooks, String nameBook) {
        return name + " взял книги: " + nameBook ;
    }

    String takeBook(String name, int borrowedBooks, String nameBook, String auther, int year) {
         return name + " взял книги: " + nameBook + " (" + auther + ", " +  year +")";
     }




     String returnBook (int borrowedBooks) {
         return name + " вернул " + borrowedBooks + " книги";
     }

     String returnBook (String name, int borrowedBooks, String nameBook) {
         return name + " вернул: " + nameBook ;
     }

     String returnBook (String name, int borrowedBooks, String nameBook, String auther, int year) {
         return name + " вернул книги: " + nameBook + " (" + auther + ", " +  year +")";
     }







}
