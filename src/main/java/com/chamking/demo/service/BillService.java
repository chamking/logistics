package com.chamking.demo.service;

import com.chamking.demo.entity.BillInfo;

import java.util.List;

public interface BillService {
    List<BillInfo>selectBill(Integer pageNum,Integer limit);

}
