package com.project.backend.controller;

import com.project.backend.model.User;
import com.project.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {
    @Autowired
    private UserService userService;

    //Rest API Crud - Create User - POST
    //Read User - GET
    //Delete User - DELETE
    //Update User - PUT

  //create user
    @PostMapping("/add")
    public String createUser(@RequestBody User user){
        userService.addUser(user);
        return "Usuario agregado correctamente...";
    }

  //Read User
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUser();
  }

    //Get User By Id
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }


    //Update User By Id
    @PutMapping("/update/{id}")
    public User updateUserById(@PathVariable("id") long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

  // Delete User By Id
  @DeleteMapping("/delete/{id}")
  public String deleteUser(@PathVariable("id") long id){
        userService.deleteUser(id);
        return "Usuario eliminado correctamente";
  }

}
