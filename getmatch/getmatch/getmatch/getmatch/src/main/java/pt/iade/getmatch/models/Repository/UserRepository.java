package pt.iade.getmatch.models.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.iade.getmatch.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    

}
