package com.abc.pub.user.controller;

import com.abc.pub.user.service.inf.UserRegService;
import com.abc.pub.util.ResultUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件名称：UserRegController
 * 作者：Admin
 * 创建时间：2021/4/21 14:08
 * 描述：TODO
 */
@RestController
@RequestMapping(value = "${service.baseurl}")
public class UserRegController {
    @Autowired
    private UserRegService userRegService;
    @RequestMapping(value = "/userReg",method = RequestMethod.POST)
    public ResultUtil userReg(@RequestBody JSONObject jsonObject){
        return userRegService.userReg(jsonObject);
    }
}
