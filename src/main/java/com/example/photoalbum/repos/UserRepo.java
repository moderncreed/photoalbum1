package com.example.photoalbum.repos;

import com.example.photoalbum.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {
    List<User> findByNickname(String nickname);
}
