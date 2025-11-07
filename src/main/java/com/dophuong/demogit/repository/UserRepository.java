package com.dophuong.demogit.repository;

import com.dophuong.demogit.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
