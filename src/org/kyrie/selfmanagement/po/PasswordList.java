package org.kyrie.selfmanagement.po;

import java.util.ArrayList;

public class PasswordList {
    private String tel;
    private String password;
    private String username;
    private String location;

    public PasswordList(String tel,  String username, String password,String location) {
        this.tel = tel;
        this.password = password;
        this.username = username;
        this.location = location;
    }
    public PasswordList() {
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
