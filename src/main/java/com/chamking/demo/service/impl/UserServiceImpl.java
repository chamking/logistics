package com.chamking.demo.service.impl;

import com.chamking.demo.dao.UserDao;
import com.chamking.demo.entity.User;
import com.chamking.demo.service.UserService;
import com.chamking.demo.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/79:44
 * description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired

    private UserDao userDao;
    @Override
    public User login(String loginId, String password) {
        User user = userDao.login(loginId, password);
        if (user == null) {
            throw new RuntimeException("账号错误");
        }
        if (!user.getPassword().equals(MD5Utils.MD5(password))){
            throw new RuntimeException("密码错误");
        }
        return user;
    }
}