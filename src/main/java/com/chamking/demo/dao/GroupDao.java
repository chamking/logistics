package com.chamking.demo.dao;

import com.chamking.demo.entity.Function;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupDao  {
    List<Function> selectFunc(String loginId);
    
}
