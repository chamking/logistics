package com.chamking.demo.controller;

import com.chamking.demo.service.GroupService;
import com.chamking.demo.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.acl.Group;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/720:53
 * description:
 */

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService ;
    @RequestMapping("/seletFunc.do")
    public JsonResult selectFunc(String loginId){
        JsonResult jsonResult = groupService.selectFunc(loginId);
        return jsonResult;
    }

}
