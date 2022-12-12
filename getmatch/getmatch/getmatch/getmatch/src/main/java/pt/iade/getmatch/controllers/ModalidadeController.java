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

import pt.iade.getmatch.models.Modalidade;
import pt.iade.getmatch.models.Repository.ModalidadeRepository;


@RestController
@RequestMapping(path="api/modalidade")
public class ModalidadeController {

    @Autowired
    private ModalidadeRepository modalidadeRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Modalidade> getModalidades() {
    
    return modalidadeRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Modalidade> getModalidade(@PathVariable("id") int id){
  
        return modalidadeRepository.findById(id);    
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Modalidade saveModalidade(@RequestBody Modalidade user){

        return modalidadeRepository.save(user);
    }

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteModalidade(@PathVariable("id") int id){

        modalidadeRepository.deleteById(id);  
    }
    
}