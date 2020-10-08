package com.chamking.demo.controller;

import com.chamking.demo.entity.BillInfo;
import com.chamking.demo.service.BillService;
import com.chamking.demo.util.TableResult;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/815:16
 * description:
 */
@RestController
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private BillService billService;

    @RequestMapping("/findByPage.do")
    public TableResult billInfo(Integer pageNum,Integer limit){
        List<BillInfo> list = billService.selectBill(pageNum, limit);
        long total = ((Page)list).getTotal();
        return  new TableResult(200,"success",total,list);

    }
}
