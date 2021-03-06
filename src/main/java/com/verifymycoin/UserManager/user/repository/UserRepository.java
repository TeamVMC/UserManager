package com.verifymycoin.UserManager.user.repository;

import com.verifymycoin.UserManager.user.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    boolean existsBySub(String sub);

    Optional<User> getBySub(String sub);

    Optional<User> findByUserId(String userId);
    Optional<User> findBySub(String sub);
    User getByUserId(String userId);

//    @Query("select u from User u where u.username = :username and u.password = :password")
//    User signin(@Param("username") String username, @Param("password") String password);


//    User findByFirstName(String firstName);
//    List<User> findByLastName(String lastName);

}
