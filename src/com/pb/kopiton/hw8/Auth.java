package com.pb.kopiton.hw8;

public class Auth {

    private String login;
    private String password;
    private String  confirmPassword;
    private String msg;


    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static void signUp (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
      //  public static void signUp (String login, String password, String confirmPassword)  {


            if(login.matches("[a-zA-Z0-9]{5,20}")){
                System.out.println(login + " логин введен правильно");
            }
            else{
                WrongLoginException ex = new WrongLoginException("Log Error");
                throw ex;
            }

            if (password.equals(confirmPassword) && password.matches("[a-zA-Z0-9]{5,200}")) {
                System.out.println("пароль OK");
            }
            else {
                WrongPasswordException ex = new WrongPasswordException("Password Error");
                throw ex;
            }





//        try {
//            int arry [] = new int[2];
//            System.out.println("dfsfds" + arry[3]);
//
//        }   catch (WrongLoginException ex) {
//            System.out.println(login + " логин указан не верно. Попробуйте снова");
//        } catch (WrongPasswordException ex) {
//            System.out.println(" пароль 1 и пароль 2 указаны не верно. Попробуйте снова");
//        }
//
//        System.out.println("Пользователь " + login + " успешно зарегистрирован на сайте");


    }

    //public static void signIn (String login, String password) {
//        try {
//
//        } catch (WrongLoginException e) {
//
//        }
//
//        System.out.println("Логин и пароль верный");

    //}


}
