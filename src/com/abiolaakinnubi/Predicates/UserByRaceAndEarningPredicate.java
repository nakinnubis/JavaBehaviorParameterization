package com.abiolaakinnubi.Predicates;

import com.abiolaakinnubi.Classes.User;
import com.abiolaakinnubi.Enums.Race;
import com.abiolaakinnubi.Interfaces.IUsersPredicate;

/**
 * This search predicate get a user that is black and earns 100,000.00 and above. it implements our already defined IUsersPredicate by adopting the findUsers method.
 * this method is used as a filter for our search operations. Any method can uses the object without having an understanding of it behavior.
 */
public class UserByRaceAndEarningPredicate implements IUsersPredicate {
    /**
     *
     * @param user : Is the user object or class, this will be used in performing filtering or search operations
     * @return  Boolean when a filter or search matches or not. it will return users that are blacks and earns 100,000 and above i.e true if the user is African.
     */
    @Override
    public boolean findUsers(User user) {
        return user.getRace().equals(Race.African) && user.salary >= 100000.00;
    }
}
