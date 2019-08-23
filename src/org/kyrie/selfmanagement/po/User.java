package org.kyrie.selfmanagement.po;

public class User {
    private String tel;
    private String password;
    private String nickname;

    public User() {

    }

    public User(String tel, String pass, String nicaknam) {
        this.tel = tel;
        this.password = pass;
        this.nickname = nicaknam;
    }

    public String getTel() {
        return tel;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickaname) {
        this.nickname = nickaname;
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
}
