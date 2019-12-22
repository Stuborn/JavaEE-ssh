package cn.edu.zjut.dao;

import cn.edu.zjut.po.AccountEntity;

import java.util.List;


public interface IAccountDAO {
    void save(AccountEntity transientInstance);
    List findByAccount(AccountEntity account);
}
