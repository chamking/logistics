package com.chamking.demo.dao;
import com.chamking.demo.entity.DriverInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverInfoDao {
    List<String> findAllId();

    List<DriverInfo> findAll();


}
