package com.chamking.demo.util;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/616:12
 * description:
 */
public class JsonResult {
    private int code;
    private Object info;
    private Object data;

    public static JsonResult success(Object data) {

        return new JsonResult(1, "成功", data);
    }


    public JsonResult() {
    }

    public JsonResult(int code, Object info) {
        this.code = code;
        this.info = info;
    }

    public JsonResult(int code, Object info, Object data) {
        this.code = code;
        this.info = info;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "code=" + code +
                ", info=" + info +
                '}';
    }
}