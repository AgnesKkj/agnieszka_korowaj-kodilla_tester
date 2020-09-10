package com.kodilla.stream;

public class UsersManager {

    public static String getUserName(User user) {
        return user.getUsername();
    }



    public static void main(String[] args) {
        //tu zaczyna się kod streama
        //normalnie wywołana metoda - zwraca to, co jest początkowym strumieniem danych
        UsersRepository.getUsersList()
                //inicjuje stream
                .stream()

                //pojawia się "wyrażenie lambda" - bijekcja z tymczasowej zmiennej reprezentującej listę w nowy typ danych
                //.map(u -> u.getUsername())

                //zapis :: - referencja klasa::metoda
                .map(UsersManager::getUserName)

                //drukowanie każdego obiektu typu String otrzymanego w 11
                .forEach(un -> System.out.println(un));
    }

    //architektura wyr. lambda
/*    (a, b) -> {
        int c = (a + b) / 2;
        return c;
    }*/







}
