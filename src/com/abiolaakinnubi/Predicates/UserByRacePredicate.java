package com.abiolaakinnubi.Predicates;

import com.abiolaakinnubi.Classes.User;
import com.abiolaakinnubi.Enums.Race;
import com.abiolaakinnubi.Interfaces.IUsersPredicate;

/**
 * Search users by their race or skin color predicates. It implements the IUsersPredicate interface. i used I as part of my naming convention to give user an idea of what it does.
 * I feel this makes it easier for anyone to understand what the implemented interface does.
 * The UserByRacePredicate will be used anytime we intend to search or filter user by their race. any method can uses the object without having an understanding of it behavior.
 * It simply adopts or conform to the behavior.
 */
public class UserByRacePredicate implements IUsersPredicate {
    /**
     *
     * @param user : Is the user object or class, this will be used in performing filtering or search operations
     * @return Boolean when a filter or search matches or not. it will return users that are blacks i.e true if the user is African.
     */
    @Override
    public boolean findUsers(User user) {
        return user.getRace().equals(Race.African);
    }
}
