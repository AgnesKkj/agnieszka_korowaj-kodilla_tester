package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double averageAboveForty = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPosts)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average posts for users of age no less than 40: " + averageAboveForty);

        double averageBelowForty = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPosts)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average posts for users of age under 40: " + averageBelowForty);
    }
}

