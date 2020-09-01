package com.kodilla.optional.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    // obliczył średnią liczbę postów dla użytkowników, których wiek jest >= 40.
    public static void main(String[] args) {
        double avg1 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()>= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg1);

//kolejny Stream, który obliczy średnią liczbę postów dla użytkowników, których wiek jest < 40.
        double avg2 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()< 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg2);

    }
}
