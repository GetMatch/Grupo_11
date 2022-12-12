package pt.iade.getmatch.models.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.iade.getmatch.models.Modalidade;

public interface ModalidadeRepository extends JpaRepository<Modalidade, Integer>{
    
}
