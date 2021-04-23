package com.abc.pub.user.service.impl;

import com.abc.pub.user.domain.UserInfo;
import com.abc.pub.user.mapper.UserInfoMapper;
import com.abc.pub.user.service.inf.UserRegService;
import com.abc.pub.util.ConstUtil;
import com.abc.pub.util.ResultUtil;
import com.abc.pub.util.RspResultUtil;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文件名称：UserRegServiceImpl
 * 作者：Admin
 * 创建时间：2021/4/21 14:13
 * 描述：TODO
 */
@Service
public class UserRegServiceImpl implements UserRegService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public ResultUtil userReg(JSONObject jsonObject) {
        String name = jsonObject.getString("name");
        String level = jsonObject.getString("level");
        String job = jsonObject.getString("job");
        String addr = jsonObject.getString("addr");
        String phone = jsonObject.getString("phone");
        if("".equals(phone)||phone==null){
            return new RspResultUtil().respReturn(ConstUtil.SYS_FAIL,"手机号不能为空");
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setAddr(addr);
        userInfo.setJob(job);
        userInfo.setLevel(level);
        userInfo.setName(name);
        userInfo.setPhone(phone);
        try {
            userInfoMapper.insert(userInfo);
        } catch (Exception e) {
            logger.info("注册失败：{}", e.getMessage());
            return new RspResultUtil().respReturn(ConstUtil.SYS_FAIL,"失败");
        }
        return new RspResultUtil().respReturn(ConstUtil.SYS_SUCCESS,"成功",null,jsonObject);
    }
}
