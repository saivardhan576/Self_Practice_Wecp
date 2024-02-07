package com.sai.user.service;

import java.util.List;

import com.sai.user.Entity.User;

public interface UserService {
    public List<User>findAll();
    public User save(User user);
    public User findone(int id);
    public User deleteById(int id);
    
    
}
