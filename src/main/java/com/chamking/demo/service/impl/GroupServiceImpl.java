package com.chamking.demo.service.impl;

import com.chamking.demo.dao.GroupDao;
import com.chamking.demo.entity.Function;
import com.chamking.demo.entity.FunctionWithGroup;
import com.chamking.demo.service.GroupService;
import com.chamking.demo.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/722:43
 * description:
 */
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDao groupDao;


    @Override
    public List<Function> selectFunc(String loginId) {
        List<Function> list = groupDao.selectFunc(loginId);
        return list;
    }
}
