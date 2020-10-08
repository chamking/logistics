package com.chamking.demo.service.impl;

import com.chamking.demo.dao.BillDao;
import com.chamking.demo.entity.BillInfo;
import com.chamking.demo.service.BillService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/815:07
 * description:
 */
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillDao billDao;

    @Override
    public List<BillInfo>selectBill(Integer pageNum,Integer limit){
        PageHelper.startPage(pageNum,limit);
        return billDao.selectBill();

    }
}
