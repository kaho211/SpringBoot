package com.example.spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_boot.entity.User; //User.javaのエラーなくなればエラー解消

// usersテーブルを操作できるようにする
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
