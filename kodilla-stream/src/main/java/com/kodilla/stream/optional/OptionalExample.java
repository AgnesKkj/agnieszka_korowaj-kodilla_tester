package com.kodilla.stream.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User userOne = new User("User 1", 30, 100, "Test");
        //składnia Optional
        Optional<User> optionalUserOne = Optional.ofNullable(userOne);
        //obejście błędu poprzez dodanie pustego obiektu
        String usernameOne = optionalUserOne.orElse(new User("",0,0,"")).getUsername();
        System.out.println(usernameOne);

        User userTwo = null;
        //składnia Optional
        Optional<User> optionalUserTwo = Optional.ofNullable(userTwo);
        String usernameTwo = optionalUserTwo.orElse(new User("",0,0,"")).getUsername();
        System.out.println(usernameTwo);

        optionalUserOne.ifPresent(u -> System.out.println(u.getUsername()));
    }
}
