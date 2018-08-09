package com.travelsky.service.impl;

import com.travelsky.bean.Dept;
import com.travelsky.mapper.DeptMapper;
import com.travelsky.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/8/9.
 */
@Service
public class BaseServiceImpl implements BaseService{
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> getAllDept() {
        List<Dept> depts = deptMapper.selectAll();
        return depts;
    }
}
