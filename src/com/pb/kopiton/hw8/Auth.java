package com.pb.kopiton.hw8;

public class  Auth {

    private static String login;
    private static String password;
    //private String  confirmPassword;
    //private String msg;


    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
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

            Auth auth = new Auth (login,password);
    }


    public static void signIn (String login1, String password1) throws WrongLoginException {

        if(login1.equals(getLogin()) && password1.equals(getPassword())){       // подставить текущее значение
            //System.out.println(login + " логин введен правильно");
        }
        else{
            WrongLoginException ex = new WrongLoginException("Log Error");
            throw ex;
        }

        System.out.println("Пользователь " +  " успешно авторизован");
    }

}
