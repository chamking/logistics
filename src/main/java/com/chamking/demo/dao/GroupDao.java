package com.chamking.demo.dao;

import com.chamking.demo.entity.FunctionWithGroup;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupDao  {
    List<FunctionWithGroup> selectFunc(String loginId);
    
}
