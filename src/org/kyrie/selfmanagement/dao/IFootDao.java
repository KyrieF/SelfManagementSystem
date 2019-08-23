package org.kyrie.selfmanagement.dao;

import org.kyrie.selfmanagement.po.Footstep;
import org.kyrie.selfmanagement.po.User;

import java.util.ArrayList;

public interface IFootDao {
    public ArrayList<Footstep> myFootstep(String tel);

    public int AddFootstep(Footstep footstep);

    public int DeleteFootstep(String footstep);
}