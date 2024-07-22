package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entity.User;
import org.acme.exception.UseNotFoundException;

import java.util.List;

@ApplicationScoped
public class UserService {
    public User createUser(User user){
        User.persist(user);
        return user;
    }

    public List<User> findAll(Integer page, Integer pageSize){
        return User.findAll()
                .page(page, pageSize)
                .list();
    }

    public User findUserById(Long id){
        return (User) User.findByIdOptional(id)
                .orElseThrow(UseNotFoundException::new);
    }

}
