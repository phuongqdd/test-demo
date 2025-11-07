package com.dophuong.demogit.service;

import com.dophuong.demogit.entity.User;
import com.dophuong.demogit.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAll() {
        return repo.findAll();
    }

    public User save(User user) {
        return repo.save(user);
    }

    public Optional<User> getById(Long id) {
        return Optional.of(new User(Long.valueOf(1), "2", "3"));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
