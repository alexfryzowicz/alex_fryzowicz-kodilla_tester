package com.kodilla.stream;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        //wywołujemy metodę, która zwraca nam ArrayList obiektów typu User.
        List<String> usernames = UsersRepository.getUsersList()
        //uruchamiamy strumień
                .stream()
                .filter(u-> u.getGroup().equals("Chemists"))
                //pierwsza operacja transformująca
                .map(UsersManager::getUserName)
                //wyrażenie terminalne
                //.forEach(un -> System.out.println(un))
                .collect(Collectors.toList());
        System.out.println(usernames);
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }
}
