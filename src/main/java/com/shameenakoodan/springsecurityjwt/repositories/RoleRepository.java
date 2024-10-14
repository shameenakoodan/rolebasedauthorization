package com.shameenakoodan.springsecurityjwt.repositories;
import com.shameenakoodan.springsecurityjwt.entity.Role;
import com.shameenakoodan.springsecurityjwt.entity.RoleEnum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Optional<Role> findByName(RoleEnum name);
}