package org.sbru.springframework.services;

import org.sbru.springframework.domain.User;

public interface UserService extends CRUDService<User> {

    User findByUsername(String username);

}
