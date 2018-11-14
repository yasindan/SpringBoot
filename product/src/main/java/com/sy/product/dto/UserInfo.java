package com.sy.product.dto;

public class UserInfo {

    private Long userId;

    private String userName;

    private String userSex;

    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo(Long userId, String userName, String userSex, String password) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.password = password;
    }

    public UserInfo(String userName, String userSex, String password) {
        this.userName = userName;
        this.userSex = userSex;
        this.password = password;
    }


    public UserInfo(Long userId) {
        this.userId = userId;
    }

    public UserInfo(String userName) {
        this.userName = userName;
    }

}
