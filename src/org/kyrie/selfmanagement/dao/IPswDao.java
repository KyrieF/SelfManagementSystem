package org.kyrie.selfmanagement.dao;

import org.kyrie.selfmanagement.po.PasswordList;

import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;

public interface IPswDao {
    public int addList(PasswordList passwordList);

    public ArrayList<PasswordList> myPasswordList(String tel);

    public int UpdatePasswordList(PasswordList passwordList);

    public int deletePasswordList(PasswordList passwordList);
}
