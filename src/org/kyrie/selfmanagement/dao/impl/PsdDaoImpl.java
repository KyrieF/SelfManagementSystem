package org.kyrie.selfmanagement.dao.impl;

import org.kyrie.selfmanagement.dao.IPswDao;
import org.kyrie.selfmanagement.db.DB;
import org.kyrie.selfmanagement.po.PasswordList;

import java.sql.ResultSet;
import java.util.ArrayList;

public class PsdDaoImpl implements IPswDao {
    DB db = new DB();
    String sql = "";

    @Override
    public int addList(PasswordList p) {
        sql = "insert into passwordlist values('" + p.getTel() + "','" + p.getUsername() + "','" + p.getPassword() + "','" + p.getLocation() + "')";
        if (db.update(sql) == 1) {
            System.out.println("------> Add psd succeed");
            return 1;
        } else {
            System.out.println("------> Add psd failed");
            return 0;
        }
    }

    @Override
    public ArrayList<PasswordList> myPasswordList(String tel) {
        ArrayList<PasswordList> list = new ArrayList<>();
        sql = "select * from passwordlist where tel = '" + tel + "'";
        ResultSet res = db.query(sql);
        if (res != null) {
            try {
                while (res.next()) {
                    PasswordList p = new PasswordList();
                    p.setTel(res.getString(1));
                    p.setUsername(res.getString(2));
                    p.setPassword(res.getString(3));
                    p.setLocation(res.getString(4));
                    list.add(p);
                }
                return list;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override
    public int UpdatePasswordList(PasswordList passwordList) {
        sql = "update passwordlist set username = '" + passwordList.getUsername() + "',password = '" + passwordList.getPassword()
                + "',location ='" + passwordList.getLocation() + "'";
        if (db.update(sql) == 1) {
            System.out.println("-------> Update Psd succeed");
            return 1;
        } else {
            System.out.println("-------> Update Psd failed");
            return 0;
        }
    }

    @Override
    public int deletePasswordList(PasswordList passwordList) {
        sql = "delete from passwordlist where tel = '" + passwordList.getTel() + "' and location ='" + passwordList.getLocation() + "'";
        if (db.update(sql) == 1) {
            System.out.println("------> Delete Psd succeed");
            return 1;
        } else {
            System.out.println("------> Delete Psd failed");
            return 0;
        }
    }
}
