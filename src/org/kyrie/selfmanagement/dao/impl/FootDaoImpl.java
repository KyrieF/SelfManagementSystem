package org.kyrie.selfmanagement.dao.impl;

import org.kyrie.selfmanagement.dao.IFootDao;
import org.kyrie.selfmanagement.db.DB;
import org.kyrie.selfmanagement.po.Footstep;

import java.sql.ResultSet;
import java.util.ArrayList;

public class FootDaoImpl implements IFootDao {
    DB db = new DB();
    String sql = "";

    @Override
    public ArrayList<Footstep> myFootstep(String tel) {
        ArrayList<Footstep> footsteps = new ArrayList<>();
        sql = "select * from myfootstep where tel = '" + tel + "' order by time desc";
        ResultSet res = db.query(sql);
        if (res != null) {
            try {
                while (res.next()) {
                    Footstep footstep = new Footstep();
                    footstep.setTel(tel);
                    footstep.setTitle(res.getString(2));
                    footstep.setParagragh(res.getString(3));
                    footstep.setTime(res.getString(4));
                    footsteps.add(footstep);
                }
                return footsteps;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override
    public int AddFootstep(Footstep footstep) {
        sql = "insert into myfootstep values('" + footstep.getTel() + "','" + footstep.getTitle() + "','" + footstep.getParagragh() + "','" + footstep.getTime() + "')";
        if (db.update(sql) == 1) {
            System.out.println("Add footstep succeed!");
            return 1;
        } else {
            System.out.println("Add footstep failed!");
            return 0;
        }
    }


    public int DeleteFootstep(String footstep) {
        sql = "delete from myfootstep where  time = '" + footstep + "'";
        if (db.update(sql) == 1) {
            System.out.println("Delete footstep succeed!");
            return 1;
        } else {
            System.out.println("Delete footstep failed!");
            return 0;
        }
    }
}
