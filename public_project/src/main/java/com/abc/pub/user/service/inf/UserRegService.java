package com.abc.pub.user.service.inf;

import com.abc.pub.util.ResultUtil;
import com.alibaba.fastjson.JSONObject;

/**
 * 文件名称：UserRegService
 * 作者：Admin
 * 创建时间：2021/4/21 14:12
 * 描述：TODO
 */
public interface UserRegService {
    ResultUtil userReg(JSONObject jsonObject);
}
