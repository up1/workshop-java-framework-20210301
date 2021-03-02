package com.example.kbtg.user;

import com.example.kbtg.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MyUser, Integer> {

}
