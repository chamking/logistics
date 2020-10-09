package com.chamking.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.chamking.demo.dao.DriverInfoDao;
import com.chamking.demo.entity.DriverInfo;
import com.chamking.demo.service.DriverInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/98:54
 * description:
 */
@Service
public class DriverInfoServiceImpl implements DriverInfoService {
    @Autowired
    private DriverInfoDao driverInfoDao;


    @Override
    public List<String> findAllId() {
        return driverInfoDao.findAllId();
    }

    @Override
    public List<DriverInfo> findAll(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        return driverInfoDao.findAll();
    }
}
