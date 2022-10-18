package com.cbcode.carlocator.service;

import com.cbcode.carlocator.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);
    List<Object> isUserPresent(User user);
}
