package com.travelsky.mapper;

import com.travelsky.bean.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/8/9.
 */
@Repository
public interface DeptMapper {
    List<Dept> selectAll();
}
