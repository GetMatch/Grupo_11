package pt.iade.getmatch.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.getmatch.models.User;
import pt.iade.getmatch.models.Repository.UserRepository;
import pt.iade.getmatch.models.Views.UserView;

@RestController
@RequestMapping(path="api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<UserView> getStudents() {
    
    return userRepository.findAllUsers();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<User> getStudent(@PathVariable int id){
  
        return userRepository.findById(id);    
    }

}
