package com.example.users;

import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class userStorage {

    /*private TextView nameOutput;
    private TextView degreeOutput;
    private TextView emailOutput;*/


    private ArrayList<User> users = new ArrayList<>();

    private static userStorage storage = null;

    private userStorage(){
    }

    public static userStorage getInstance(){
        if(storage == null){
            storage = new userStorage();
        }
        return storage;
    }

    public ArrayList<User>getUsers(){return users;}

    public void addUser(User user){
        users.add(user);
    }

    public void listUsers(){
        for(User user : users){
            user.printInfo();
            /*nameOutput.setText(user.firstName);
            degreeOutput.setText(user.getDegreeProgram());
            emailOutput.setText(user.getEmail());*/
        }

    }
}
