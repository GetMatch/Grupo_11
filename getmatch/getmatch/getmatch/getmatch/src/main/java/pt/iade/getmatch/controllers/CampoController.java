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


import pt.iade.getmatch.models.Campo;
import pt.iade.getmatch.models.Repository.CampoRepository;

@RestController
@RequestMapping(path = "api/campos")
public class CampoController {
    
    @Autowired
    private CampoRepository campoRepository;

    @GetMapping(path = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Campo> getCampos(){

        return campoRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Campo> getCampoById(@PathVariable int id){
  
        return campoRepository.findById(id);    
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Campo saveCampo(@RequestBody Campo campo){

        return campoRepository.save(campo);
    }

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCampo(@PathVariable("id") int id){

        campoRepository.deleteById(id);  
    }



}
