package com.abc.pub.util;

/**
 * 文件名称：RspResultUtil
 * 作者：Admin
 * 创建时间：2021/4/21 14:25
 * 描述：TODO
 */

public class RspResultUtil {
    /*
     * 返回信息
     * 响应码、相应信息、sessionId、返回的数据
     * */
    public final ResultUtil respReturn(String codeRsp, String msgRsp, String sessionId, Object data) {
        return new ResultUtil(codeRsp, msgRsp, sessionId, data);
    }

    /*
     * 返回信息
     * 响应码、响应信息、sessionId
     * */
    public final ResultUtil respReturn(String codeRsp, String msgRsp, String sessionId) {
        return new ResultUtil(codeRsp, msgRsp, sessionId, null);
    }

    /*
     * 返回信息
     * 响应码、响应信息
     * */
    public final ResultUtil respReturn(String codeRsp, String msgRsp) {
        return new ResultUtil(codeRsp, msgRsp, null, null);
    }
}
