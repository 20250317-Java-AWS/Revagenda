package com.revature.revagenda_backend.repositories;

import com.revature.revagenda_backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    /*
    save()
    saveOrUpdate()
    getAll()
    delete(Integer id)
     */

}
