package kits.edu.final_project.repository;


import kits.edu.final_project.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
//    @Query("from users where email=?1")
//    List<UserEntity> getUserByEmail(String email);
    @Query(value = "select * from users u  where email = :email",nativeQuery = true)
    UserEntity findByEmail(String email);

}
