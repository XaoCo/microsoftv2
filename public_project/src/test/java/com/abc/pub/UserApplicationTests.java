package com.abc.pub;

import com.abc.pub.user.service.inf.UserRegService;
import com.abc.pub.util.ResultUtil;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserApplicationTests {
    @Autowired
    private UserRegService userRegService;
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
   public void test(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","cpp");
        jsonObject.put("level","1");
        jsonObject.put("job","java");
        jsonObject.put("addr","北京");
        jsonObject.put("phone","17600201849");
        ResultUtil result = userRegService.userReg(jsonObject);
        logger.info("result={}",result);
    }

}
