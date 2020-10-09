package com.chamking.demo.service;

import com.chamking.demo.entity.Function;
import com.chamking.demo.util.JsonResult;

import java.util.List;

public interface GroupService {
    List<Function> selectFunc(String loginId);
}
