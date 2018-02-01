package com.example.demo;import java.util.List;


public interface UserRepositoryCustom {
List<User> findByFirstName(String firstName);
}
