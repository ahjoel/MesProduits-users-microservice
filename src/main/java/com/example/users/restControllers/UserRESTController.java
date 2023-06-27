package com.example.users.restControllers;

import com.example.users.entities.User;
import com.example.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserRESTController {

    @Autowired
    UserService userService;

    @RequestMapping(path="all", method=RequestMethod.GET)
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }
}
