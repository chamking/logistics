package com.chamking.demo.service;

import com.chamking.demo.entity.DriverInfo;

import java.util.List;

public interface DriverInfoService {

    List<String> findAllId();

    List<DriverInfo> findAll(Integer pageNum,Integer limit);

}
