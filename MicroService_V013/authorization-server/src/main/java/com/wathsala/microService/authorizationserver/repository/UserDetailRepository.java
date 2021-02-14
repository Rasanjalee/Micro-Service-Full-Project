package com.wathsala.microService.authorizationserver.repository;

import com.wathsala.microService.authorizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author acer on 2/10/2021
 */
public interface UserDetailRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUserName(String name);
}
