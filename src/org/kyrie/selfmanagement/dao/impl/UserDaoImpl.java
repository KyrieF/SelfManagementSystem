package org.kyrie.selfmanagement.dao.impl;

import org.kyrie.selfmanagement.dao.IUserDao;
import org.kyrie.selfmanagement.db.DB;
import org.kyrie.selfmanagement.po.User;

import java.sql.ResultSet;

public class UserDaoImpl implements IUserDao {
    DB db = new DB();
    String sql = "";


    @Override
    public int addUser(User user) {
        sql = "insert into user values('" + user.getTel() + "','" + user.getPassword() + "','" + user.getNickname() + "')";
        if (db.update(sql) == 1) {
            System.out.println("------>  Add user succeed");
            return 1;
        }
        System.out.println("------>  Add user failed");
        return 0;
    }

    @Override
    public int updateUser(User user) {
        sql = "update user set tel = '" + user.getTel() + "',password = '" + user.getPassword() + "',nickname = '" + user.getNickname() + "'";
        if (db.update(sql) == 1) {
            System.out.println("------>  Update user succeed");
            return 1;
        }
        System.out.println("------>  Update user failed");
        return 0;
    }

    @Override
    public User queryUser(String tel) {
        User user = new User();
        sql = "select * from user where tel = '" + tel + "'";
        ResultSet res = db.query(sql);
        if (res != null) {
            try {
                while (res.next()) {
                    user.setPassword(res.getString(2));
                    user.setTel(res.getString(1));
                    user.setNickname(res.getString(3));
                    return user;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
