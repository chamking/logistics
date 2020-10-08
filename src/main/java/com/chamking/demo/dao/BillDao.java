package com.chamking.demo.dao;

import com.chamking.demo.entity.BillInfo;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface BillDao {
    List<BillInfo> selectBill();

}
