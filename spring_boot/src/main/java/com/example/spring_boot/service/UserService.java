package com.example.spring_boot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot.entity.User;
import com.example.spring_boot.repository.UserRepository;

import java.util.Optional;

//repositoryの処理を呼び出すServiceを作成するビジネスロジックのみ書くこと！（今回はビジネスロジックがないため、repositoryのメソッドを呼び出す）
@Service
public class UserService {
    @Autowired
    // (required = false)
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findOne(Long id) {
        return userRepository.findById(id);
    }

    public User save(User user) { // 引数何入れるのが正しい????
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
