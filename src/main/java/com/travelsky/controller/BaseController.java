package com.travelsky.controller;

import com.google.gson.Gson;
import com.travelsky.bean.Dept;
import com.travelsky.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/8/9.
 */
@Controller
public class BaseController {
    @Autowired
    private BaseService baseService;
    @RequestMapping(value = "/get",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getAllDept(){
        List<Dept> depts = baseService.getAllDept();
        Gson gson = new Gson();
        return gson.toJson(depts);
    }
}
