package org.sbru.springframework.repositories;

import org.sbru.springframework.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer>{
}
