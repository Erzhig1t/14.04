package com.company;

import java.util.ArrayList;

public class UserDao {

    private ArrayList<User> users = new ArrayList<>();
    public void addUser(User user){
     users.add(user);
    }
    public User getById(int id){
        User reUsers = new User();
        for(int a = 0; a<users.size(); a++){
            if(users.get(a).getId()==id){

                reUsers = users.get(a);
            }
            }return reUsers;

        }
    }




