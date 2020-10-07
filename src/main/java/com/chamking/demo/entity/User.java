package com.chamking.demo.entity;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/510:33
 * description:
 */
public class User {
    private String loginId ;

    private  String password;

    private  boolean ifOnline;

    @Override
    public String toString() {
        return "User{" +
                "loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", ifOnline=" + ifOnline +
                '}';
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIfOnline() {
        return ifOnline;
    }

    public void setIfOnline(boolean ifOnline) {
        this.ifOnline = ifOnline;
    }
}
