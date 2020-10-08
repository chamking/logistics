package com.chamking.demo.service.impl;

import com.chamking.demo.dao.GroupDao;
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
    public JsonResult selectFunc(String loginId) {
        List<FunctionWithGroup> functionWithGroups = groupDao.selectFunc(loginId);
        if (functionWithGroups == null){
            throw new RuntimeException("信息为空");
        }
        return new JsonResult(1,"成功",functionWithGroups);
    }
}
