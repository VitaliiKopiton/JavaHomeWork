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


            if(login.matches("[a-zA-Z0-9]{5,20}")){
                System.out.println(login + " логин введен правильно");
            }
            else{
                WrongLoginException ex = new WrongLoginException("Log Error");
                throw ex;
            }

            if (password.equals(confirmPassword) && password.matches("[a-zA-Z0-9_]{5,200}")) {
                System.out.println("пароль OK");
            }
            else {
                WrongPasswordException ex = new WrongPasswordException("Password Error");
                throw ex;
            }

            System.out.println("Пользователь " + login + " успешно зарегистрирован на сайте");

    }

}
