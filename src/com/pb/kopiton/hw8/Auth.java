package com.pb.kopiton.hw8;

public class Auth {

    private String login;
    private String password;
    private String  confirmPassword;


    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void signUp (String login, String password, String confirmPassword) {
        try {

        } catch (WrongLoginException) {
            System.out.println(login + " логин указан не верно. Попробуйте снова");
        } catch (WrongPasswordException) {
            System.out.println(" пароль 1 и пароль 2 указаны не верно. Попробуйте снова");
        }

        System.out.println("Пользователь " + login + " успешно зарегистрирован на сайте");


    }

    void signIn (String login, String password) {
        try {

        } catch (WrongLoginException) {

        }

        System.out.println("Логин и пароль верный");

    }


}
