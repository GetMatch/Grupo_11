package pt.iade.getmatch.models.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pt.iade.getmatch.models.User;
import pt.iade.getmatch.models.Views.UserView;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "Select usr_id as id, usr_name as name, usr_data_nasc as bDate, usr_emaill as email, usr_senha as pass from users",
    nativeQuery = true)
    Iterable <UserView> findAllUsers();

    
}
