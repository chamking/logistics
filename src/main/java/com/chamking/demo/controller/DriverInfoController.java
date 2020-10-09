package com.chamking.demo.controller;

import com.chamking.demo.entity.DriverInfo;
import com.chamking.demo.service.DriverInfoService;
import com.chamking.demo.util.TableResult;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/98:58
 * description:
 */
@RestController
@RequestMapping("/driverInfo")
public class DriverInfoController {
    @Autowired
    private DriverInfoService driverInfoService;

    @RequestMapping("/selectAllId.do")
    public List<String>  selectAllId(){
        List<String> list = driverInfoService.findAllId();
        return  list;

    }
    @RequestMapping("/selectAllByPage.do")
    public TableResult findAll(Integer pageNum,Integer limit){
        List<DriverInfo> list = driverInfoService.findAll(pageNum, limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"success",total,limit);
    }
}
