package com.abc.pub.util;

/**
 * 文件名称：ResultUtil
 * 作者：Admin
 * 创建时间：2021/4/21 14:25
 * 描述：TODO
 */

public class ResultUtil {
    //响应码
    private String respCode;

    //响应信息
    private String respMsg;

    //返回sessionId信息
    private String sgasession;

    //返回私有数据
    private Object respData;

    public String getSgasession() {
        return sgasession;
    }

    public void setSgasession(String sgasession) {
        this.sgasession = sgasession;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public Object getRespData() {
        return respData;
    }

    public void setRespData(Object respData) {
        this.respData = respData;
    }

    public ResultUtil(String respCode, String respMsg, String sgasession, Object respData) {
        super();
        this.respCode = respCode;
        this.respMsg = respMsg;
        this.respData = respData;
        this.sgasession = sgasession;
    }

    public ResultUtil() {
        super();
        // TODO Auto-generated constructor stub
    }
}
