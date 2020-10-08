package com.chamking.demo.util;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/814:48
 * description:
 */
public class TableResult {
    private int code;
    private String msg;
    private  Long count;
    private  Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public TableResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public TableResult() {
    }

    public TableResult(int code, String msg, Long count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
}
