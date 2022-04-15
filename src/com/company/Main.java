package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UserDao userDao;
        userDao = new UserDao();
        User users1 = new User(2, "asan", 31);
      User user2 = new User(3, "uson", 25);
      User user3 = new User(1, "samat", 34);

      userDao.addUser(users1);
      userDao.addUser(user2);
      userDao.addUser(user3);

        System.out.println(userDao.getById(2));


    }
}
