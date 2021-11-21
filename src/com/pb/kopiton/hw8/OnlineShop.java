package com.pb.kopiton.hw8;

public class OnlineShop {
    public static void main(String[] args) {

        try {

            String login = "QQqda1";
            String password = "qwert_";
            String confirmPassword = "qwert_";
            String msg = "dsfdsfsdfsdf";


            Auth.signUp (login,password, confirmPassword);
        } catch (WrongLoginException ex) {
            System.out.println( " логин указан не верно. Попробуйте снова");
        } catch (WrongPasswordException ex) {
            System.out.println(" пароль 1 и пароль 2 указаны не верно. Попробуйте снова");
        }


        try {

            String login1 = "QQqda1";
            String password1 = "qwert_";


            Auth.signIn (login1, password1);
        } catch (WrongLoginException ex) {
            System.out.println( " логин указан или пароль указан не верно. Попробуйте снова");
        }
    }
}
