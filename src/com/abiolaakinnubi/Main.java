package com.abiolaakinnubi;

import com.abiolaakinnubi.Classes.User;
import com.abiolaakinnubi.Enums.Gender;
import com.abiolaakinnubi.Enums.Race;
import com.abiolaakinnubi.Interfaces.IUsersPredicate;
import com.abiolaakinnubi.Predicates.UserByHighEarningRegardlessRace;
import com.abiolaakinnubi.Predicates.UserByRaceAndEarningPredicate;
import com.abiolaakinnubi.Predicates.UserByRacePredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<User> userList = Arrays.asList( new User(1,"Adeola Akinboyee",2000, Gender.Male, Race.African,5),
                new User(2,"Rafael Dos Santos",100000, Gender.Male, Race.White,15),
                new User(3,"Amir Khalid",2024000, Gender.Male, Race.Arabian,25),
                new User(4,"Cynthia Cameron",2124000, Gender.Female, Race.African,15),
                new User(5,"Cyndia Ma",24000, Gender.Female, Race.Asian,5)
        );

        // Task one requested by the customer : users that are blacks or African
        // This will show the users that matches this criteria on the terminal
        System.out.println("===== Users that are african =========");
        System.out.println(filterUsers(userList, new UserByRacePredicate()));
        // Task two requested by the customer: users that are blacks or African that earns above 100,000 Naira.
        // This will show the user that matches this criteria on the terminal
        System.out.println("===== Users earning above 100k that are african ==========");
        System.out.println(filterUsers(userList, new UserByRaceAndEarningPredicate()));

        // Task two requested by the customer: users that earns above 100,000 Naira regardless of their race.
        // This will show the user that matches this criteria on the terminal
        System.out.println("===== Users earning above 100k  ==========");
        System.out.println(filterUsers(userList, new UserByHighEarningRegardlessRace()));

    }
    public static List<User> filterUsers(List<User> userList, IUsersPredicate usersPredicate){
        List<User> result = new ArrayList<>();
        for (User user:userList
             ) {
            if(usersPredicate.findUsers(user)){
                result.add(user);
            }
        }
        return result;
    }
}
