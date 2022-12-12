package pt.iade.getmatch.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.getmatch.models.User;
import pt.iade.getmatch.models.Repository.UserRepository;


@RestController
@RequestMapping(path="api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getStudents() {
    
    return userRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<User> getStudent(@PathVariable("id") int id){
  
        return userRepository.findById(id);    
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public User savUser(@RequestBody User user){

        return userRepository.save(user);
    }

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteUser(@PathVariable("id") int id){

        userRepository.deleteById(id);  
    }
    
}
