package com.pb.kopiton.hw8;

public class OnlineShop {
    public static void main(String[] args) {

        try {

            String login = "QQqda1";
            String passvord = "qwert_";
            String confirmPassword = "qwert_";
            String msg = "dsfdsfsdfsdf";

            Auth.signUp (login,passvord, confirmPassword);
        } catch (WrongLoginException ex) {
            System.out.println( " логин указан не верно. Попробуйте снова");
        } catch (WrongPasswordException ex) {
            System.out.println(" пароль 1 и пароль 2 указаны не верно. Попробуйте снова");
        }
    }
}
