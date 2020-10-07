package com.chamking.demo.service;

import com.chamking.demo.entity.User;

public interface UserService {
    User login (String loginId, String password);
}
