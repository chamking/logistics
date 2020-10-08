package com.chamking.demo.dao;

import com.chamking.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User login(@Param("loginId") String loginId);

}
