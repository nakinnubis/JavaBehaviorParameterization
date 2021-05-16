package com.abiolaakinnubi.Predicates;

import com.abiolaakinnubi.Classes.User;
import com.abiolaakinnubi.Interfaces.IUsersPredicate;

/**
 *
 */
public class UserByHighEarningRegardlessRace implements IUsersPredicate {
    /**
     *
     * @param user: Is the user object or class, this will be used in performing filtering or search operations
     * @return This returns true for user that earns 100000 Naira or more regardless of their race.
     */
    @Override
    public boolean findUsers(User user) {
        return user.getSalary() >= 100000.00;
    }
}
