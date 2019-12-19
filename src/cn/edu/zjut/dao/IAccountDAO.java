package cn.edu.zjut.dao;

import cn.edu.zjut.po.Account;

import java.util.List;


public interface IAccountDAO {
    void save(Account transientInstance);
    List findByAccount(Account account);
}
