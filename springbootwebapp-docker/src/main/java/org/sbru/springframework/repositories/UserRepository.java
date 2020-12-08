package org.sbru.springframework.repositories;

import org.sbru.springframework.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
    User findByUsername(String username);
}
