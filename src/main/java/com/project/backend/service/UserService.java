package com.project.backend.service;

import com.project.backend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    //create a user
    public User addUser(User user);

    //read users
    public List<User> getUser();

    //read user by id
    public User getUserById(long id);

    //update by id
    public User updateUser (long id, User user);

    //delete by id
    public void deleteUser(long id);
}
