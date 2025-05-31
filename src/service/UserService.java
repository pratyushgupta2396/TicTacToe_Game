package service;

import model.User;
import repository.UserDb;

public class UserService {

    UserDb userDb;
    public UserService(){
        this.userDb = new UserDb();
    }


    public User validateUserId(int id){
        User user =  userDb.getUserById(id);
        return user;
    }

    public User createNewUser(String name){
        return userDb.createNewUser(name);

    }

}