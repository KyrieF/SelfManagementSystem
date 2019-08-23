package org.kyrie.selfmanagement.dao;

import org.kyrie.selfmanagement.po.User;

public interface IUserDao {
    public int addUser(User user);

    public int updateUser(User user);

    public User queryUser(String tel);
}
